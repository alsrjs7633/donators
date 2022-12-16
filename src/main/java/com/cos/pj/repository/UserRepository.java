package com.cos.pj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.pj.model.Users;

public interface UserRepository extends JpaRepository<Users,Integer>{
	
}
