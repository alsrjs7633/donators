package com.cos.pj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping({"","/"})
	//인증이 필요없는 곳에 /auth를 붙인다.
	public String index() {
		return "index";
	}
	
	@GetMapping({"/funding"})
	//인증이 필요없는 곳에 /auth를 붙인다.
	public String funding() {
		return "funding";
	}
	
	@GetMapping({"/payment"})
	//인증이 필요없는 곳에 /auth를 붙인다.
	public String payment() {
		return "payment";
	}
	
	@GetMapping({"/boardList"})
	//인증이 필요없는 곳에 /auth를 붙인다.
	public String boardList() {
		return "boardList";
	}
	
	@GetMapping({"/boardDetail"})
	//인증이 필요없는 곳에 /auth를 붙인다.
	public String boardDetail() {
		return "boardDetail";
	}
}
