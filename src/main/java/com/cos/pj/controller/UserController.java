package com.cos.pj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	@GetMapping("/auth/joinForm")
	public String joinForm() {
		return "user/joinForm";
	}
	@GetMapping("/auth/loginForm")
	public String loginForm() {
		return "user/loginForm";
	}
	//업로드
//	@GetMapping("/uploadFiles")
//	public String uploadFiles() {
//		return "uploadFiles";
//	}
	
	

	
}
