package sonn.web.shiro.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.realm.Realm;

/**
* @ClassName: AuthenticationRealm 
* @Description: Shiro's realm
* @author sonne
* @date 2017-1-15 13:08:59 
* @version 1.0
 */
public class AuthenticationRealm implements Realm {

//	@Resource(name = "userMapper")
//	private UserMapper userMapper;

	@Override
	public boolean supports(AuthenticationToken token) {
		return token instanceof UsernamePasswordToken;
	}

	@Override
	public String getName() {
		return "AuthenticationRealm";
	}

	@Override
	public AuthenticationInfo getAuthenticationInfo(AuthenticationToken token)
			throws AuthenticationException {
		String username = (String) token.getPrincipal(); 
		String password = new String((char[]) token.getCredentials()); 
		if (!"1".equals(username)) {
			throw new UnknownAccountException(); 
		}
		if (!"2".equals(password)) {
			throw new IncorrectCredentialsException(); 
		}
		return new SimpleAuthenticationInfo(username, password, getName());
	}
}
