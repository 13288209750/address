package com.hdg.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hdg.vo.User;

@Controller
@RequestMapping(value="/index")
public class LoginAction {

	@RequestMapping(value="/tologin")
	public String toLogin(){
		return "login";
	}
	
	@RequestMapping(value="/tohome")
	public String toHome(User user,Model model){
		System.out.println(user);
		model.addAttribute("user", user);
		return "home";
	}
}
