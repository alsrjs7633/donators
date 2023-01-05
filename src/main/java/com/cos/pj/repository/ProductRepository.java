package com.cos.pj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.pj.model.Product;


public interface ProductRepository extends JpaRepository<Product, Integer> {
}
