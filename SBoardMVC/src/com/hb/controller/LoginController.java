package com.hb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hb.service.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {
	@Autowired
	LoginService loginSvc;
	
	@RequestMapping("/welcomePage")
	public String welcomePage(
			@RequestParam("id")String id,
			@RequestParam("pw")String pw){
		if(loginSvc.isLoginMember(id, pw)){
			return "redirect:/board/BoardList";
		}else{
			return "/login";
		}
	}
}











