package sonn.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import sonn.web.entity.User;

import com.alibaba.fastjson.JSONObject;

/**
 * @ClassName: LoginController
 * @Description: Controller of login
 * @author sonne
 * @date 2017-1-15 13:07:00
 * @version 1.0
 */
@Controller
@RequestMapping("/login")
public class LoginController {

	/*
	 * show the web page of login action.
	 */
	@RequestMapping(value = "/show", method = RequestMethod.GET)
	public String submit(HttpServletRequest request, Model model)
			throws Exception {
		String path = request.getContextPath();
		String basePath = request.getScheme() + "://" + request.getServerName()
				+ ":" + request.getServerPort() + path;
		model.addAttribute("base", basePath);
		return "login";
	}

	/*
	 * login submit, check, save the session.
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public JSONObject submit(HttpServletRequest request,
			HttpServletResponse response, User usr) throws Exception {
		JSONObject jo = new JSONObject();
		String usrname = usr.getUsrname();
		String passwd = usr.getPasswd();
		UsernamePasswordToken token = new UsernamePasswordToken(usrname, passwd);
		Subject subject = SecurityUtils.getSubject();
		try {
			subject.login(token);
		} catch (IncorrectCredentialsException ice) {
			jo.put("success", false);
			jo.put("msg", "密码错误");
			return jo;
		} catch (UnknownAccountException uae) {
			jo.put("success", false);
			jo.put("msg", "未知用户名");
			return jo;
		} catch (ExcessiveAttemptsException eae) {
			jo.put("success", false);
			jo.put("msg", "登录次数过多");
			return jo;
		}
		jo.put("success", true);
		jo.put("msg", "登录成功");
		return jo;
	}

}
