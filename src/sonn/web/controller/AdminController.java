package sonn.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
* @ClassName: AdminController 
* @Description: controller for admin usr
* @author sonne
* @date 2017-1-16 08:37:08 
* @version 1.0
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
	@RequestMapping(value = "/show", method = RequestMethod.GET)
	public String submit(HttpServletRequest request,Model model) throws Exception {
		return "admin";
	}
}
