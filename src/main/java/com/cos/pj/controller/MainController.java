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
	@GetMapping("/myPurchasedList")
	public String myPurchasedList() {
		return "myPurchasedList";
	}
	@GetMapping("/findLoc")
	public String findLoc() {
		return "findLoc";
	}
	@GetMapping("/cart")
	public String cart() {
		return "cart";
	}
	
	@GetMapping("/auth/aChildHead")
	//인증이 필요없는 곳에 /auth를 붙인다.
	public String aChildHead() {
		return "aChildHead";
	}
	
	@GetMapping("/auth/seniorCitizen")
	//인증이 필요없는 곳에 /auth를 붙인다.
	public String seniorCitizen() {
		return "seniorCitizen";
	}
	
	@GetMapping("/auth/singleParent")
	//인증이 필요없는 곳에 /auth를 붙인다.
	public String singleParent() {
		return "singleParent";
	}

	
}
