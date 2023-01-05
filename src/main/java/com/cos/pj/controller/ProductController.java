package com.cos.pj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.cos.pj.repository.ProductRepository;
import com.cos.pj.service.ProductService;

public class ProductController {
	@Autowired
	private ProductService productService;
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping("/payment")
	public String saveBuy(/* Product product,@AuthenticationPrincipal PrincipalDetail principal */) {
		/* productService.구매하기(product,principal.getUser()); */
		return "/payment";
	}
	
/*	@GetMapping("/board/boardList")
	public String index(Model model,@PageableDefault(size = 6, sort = "id",
	direction =  Sort.Direction.DESC) Pageable pageable) {
		System.out.println( boardService.글목록(pageable));
		model.addAttribute("boards", boardService.글목록(pageable));
		return "board/boardList";
	}
	*/
/*	@GetMapping("/myPurchasedList")
	public String myPurchasedList(Model model,@PageableDefault(size = 6, sort = "id",
			direction =  Sort.Direction.DESC) Pageable pageable) {
	//	List<Product> product = productRepository.findAll();
		
		model.addAttribute("product", productService.구매하기(pageable));
		
		return "myPurchasedList";
	}
*/
}