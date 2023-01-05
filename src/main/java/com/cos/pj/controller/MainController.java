package com.cos.pj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cos.pj.model.UploadFiles;
import com.cos.pj.repository.UploadRepository;
import com.cos.pj.service.UploadService;
import com.cos.pj.specification.SearchSpecification;

@Controller
public class MainController {

	
	@Autowired
	private UploadRepository uploadRepository;
	
	@Autowired
	private UploadService uploadService;
	



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
	
	
	

	//https://dev-setung.tistory.com/20
	// @RequestParam(value = "searchKeyword", required = false) String searchKeyword
	
	

	
	@GetMapping("/search")
	public String search(Model model,@PageableDefault(size=6,sort="id",direction=Sort.Direction.DESC) Pageable pageable,
			@RequestParam(value="genSelect", required = false) String genSelect,
			@RequestParam(value="min_bir", required = false) String min_bir,
			@RequestParam(value="max_bir", required = false) String max_bir,
			@RequestParam(value="area_select", required = false) String area_select) {
		
		Specification<UploadFiles> spec = (root, query, criteriaBuilder) -> null;
		
		if((genSelect!=null)||(max_bir!=null)||(min_bir!=null)||(area_select!=null)) {
			System.out.println(genSelect);
			System.out.println(min_bir);
			System.out.println(max_bir);
			System.out.println(area_select);

		spec=spec.and(SearchSpecification.searchTotal(genSelect,max_bir,min_bir,area_select));		
				}
			
		
		model.addAttribute("uploadFiles", uploadRepository.findAll(spec, pageable));
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
	@GetMapping("/searchUpload")
	public String searchUpload() {
		return "searchUpload";
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
