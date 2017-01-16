package sonn.web.my_shiro;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;

import sonn.web.entity.User;
import sonn.web.mapper.UserMapper;
import sonn.web.utils.Principal;

/**
 * @ClassName: AuthenticationRealm
 * @Description: Shiro's realm
 * @author sonne
 * @date 2017-1-15 13:08:59
 * @version 1.0
 */
public class MyRealm extends AuthorizingRealm {

	@Resource(name = "userMapper")
	private UserMapper userMapper;

	@Override
	public String getName() {
		return "AuthenticationRealm";
	}

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		SimpleAuthorizationInfo simpleAuthorInfo = new SimpleAuthorizationInfo();
		Session session = this.getSession();
		if (session == null) {
			return null;
		}
		Principal principal = (Principal) session.getAttribute("currentUser");
		String role = principal.getRole();
		if (role.equals("user")) {
			simpleAuthorInfo.addRole("user");
		}
		if (role.equals("admin")) {
			simpleAuthorInfo.addRole("admin");
		}
		return simpleAuthorInfo;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		String username = (String) token.getPrincipal();
		String password = new String((char[]) token.getCredentials());
		User db_usr = userMapper.findByUsername(username);
		if (!db_usr.getUsrname().equals(username)) {
			throw new UnknownAccountException();
		}
		if (!db_usr.getPasswd().equals(password)) {
			throw new IncorrectCredentialsException();
		}
		SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(
				username, password, getName());
		String role;
		if (db_usr.isIs_admin()) {
			role = "admin";
		} else {
			role = "user";
		}
		Principal principal = new Principal(db_usr.getId(), username, role);
		this.setSession("currentUser", principal);
		return simpleAuthenticationInfo;
	}

	private void setSession(Object key, Object value) {
		Subject currentUser = SecurityUtils.getSubject();
		if (null != currentUser) {
			Session session = currentUser.getSession();
			System.out
					.println("Session默认超时时间为[" + session.getTimeout() + "]毫秒");
			if (null != session) {
				session.setAttribute(key, value);
			}
		}
	}

	private Session getSession() {
		Subject currentUser = SecurityUtils.getSubject();
		if (null != currentUser) {
			Session session = currentUser.getSession();
			return session;
		}
		return null;
	}
}
