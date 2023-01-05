package com.cos.pj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cos.pj.model.Product;
import com.cos.pj.model.Users;
import com.cos.pj.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor 
@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	@Transactional
	public void 구매하기(Product product, Users user) {
		Product products = new Product();
		products.setPPrice(product.getPPrice());
		products.setUsers(user);
		products.setPName(product.getPName());
		products.setPayChoice(product.getPayChoice());
		productRepository.save(products);
	}

	public Object 구매하기(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}


}
