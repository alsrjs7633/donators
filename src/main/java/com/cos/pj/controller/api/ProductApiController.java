package com.cos.pj.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cos.pj.config.auth.PrincipalDetail;
import com.cos.pj.dto.ResponseDto;
import com.cos.pj.model.Product;
import com.cos.pj.service.ProductService;

public class ProductApiController {
	@Autowired
	private ProductService productService;
	
	@PostMapping("/api/product")
	public ResponseDto<Integer> save(@RequestBody Product product, @AuthenticationPrincipal PrincipalDetail principal){
		productService.구매하기(product, principal.getUser());
		return new ResponseDto<Integer>(HttpStatus.OK.value(),1);
	}

}
