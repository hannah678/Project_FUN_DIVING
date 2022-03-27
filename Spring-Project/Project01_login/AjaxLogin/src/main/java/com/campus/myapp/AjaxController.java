package com.campus.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {
	@GetMapping("/ajaxView")
	public String ajaxView() {
		return "ajax/ajaxView";
	}
	@RequestMapping(value="/ajaxForm", method = RequestMethod.POST, produces="application/text;charset=utf-8")
	@ResponseBody
	public String ajaxForm(String userid, String userpwd, Model model) {
		System.out.println(userid);
		System.out.println(userpwd);
		
		String 	msg = "";
		if(userid.equals("abcd") && userpwd.equals("1234")){
				msg += "login ok";
		}else{
			msg += "login fail";
		}
		return msg;
	}
}