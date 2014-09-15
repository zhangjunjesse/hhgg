package com.tgb.web;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tgb.entity.LoginUser;
import com.tgb.entity.User;

@Controller
public class LoginController {
	
	@ModelAttribute("loginuser")
	public LoginUser getUser(){
		return new LoginUser();
	}
	
	@RequestMapping("/tologin")
	public String toLogin(){
		return "/login";
	}

	@RequestMapping("login")
	public String login(@Valid @ModelAttribute("loginuser")LoginUser loginuser ,Errors errors){
		if(errors.hasErrors()){
			return toLogin();
		}
		if(loginuser.getUsername().equals("jesse")&&loginuser.getPassword().equals("123")){
			return "redirect:user/getAllUser";
		}
		return toLogin();
	}
	
}
