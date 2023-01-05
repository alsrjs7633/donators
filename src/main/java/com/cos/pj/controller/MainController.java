package com.cos.pj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cos.pj.model.Product;
import com.cos.pj.repository.ProductRepository;

@Controller
public class MainController {
	
	@Autowired
	private ProductRepository productRepository;
	

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
	public String myPurchasedList(Model model) {
		List<Product> product = productRepository.findAll();
		
		model.addAttribute("product", product);
		
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
