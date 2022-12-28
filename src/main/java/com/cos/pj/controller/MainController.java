package com.cos.pj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cos.pj.service.UploadService;

@Controller
public class MainController {
	
	@Autowired
	private UploadService uploadService;
	
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
	public String search(Model model,@PageableDefault(size=6,sort="id",direction=Sort.Direction.DESC) Pageable pageable) {
		model.addAttribute("uploadFiles",uploadService.글목록(pageable));
		return "search";
	}
	@GetMapping("/myPage")
	public String myPage() {
		return "myPage";
	}
	
	
	@GetMapping("/auth/findLoc")
	public String findLoc() {
		return "findLoc";
	}
	@GetMapping("/cart")
	public String cart() {
		return "cart";
	}
	@GetMapping("/searchUpload")
	public String searchUpload() {
		return "searchUpload";
	}
	
	
	
}
