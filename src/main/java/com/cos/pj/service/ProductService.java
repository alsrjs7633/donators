package com.cos.pj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.cos.pj.model.Product;
import com.cos.pj.model.Users;
import com.cos.pj.repository.ProductRepository;

public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	@Transactional
	public void 구매하기(Product product, Users user) {
		product.getPPrice();
		product.getId();
		product.getPName();
		productRepository.save(product);
	}

}
