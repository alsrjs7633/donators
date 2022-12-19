package com.cos.pj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping({"","/"})
	public String index() {
		return "index";
	}
	@GetMapping("/funding")
	public String funding() {
		return "funding";
	}
	@GetMapping("/payment")
	public String payment() {
		return "payment";
	}
	@GetMapping("/auth/faq")
	public String faq() {
		return "faq";
	}
	@GetMapping("/search")
	public String search() {
		return "search";
	}
	@GetMapping("/myPage")
	public String myPage() {
		return "myPage";
	}
	@GetMapping("/board")
	public String board() {
		return "board";
	}
	@GetMapping("/auth/noticeBoard")
	public String noticeBoard() {
		return "noticeBoard";
	}
	@GetMapping("/auth/findLoc")
	public String findLoc() {
		return "findLoc";
	}
	@GetMapping("/cart")
	public String cart() {
		return "cart";
	}
	
	
}
