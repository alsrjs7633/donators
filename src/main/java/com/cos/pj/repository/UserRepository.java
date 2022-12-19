package com.cos.pj.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.pj.model.Users;



public interface UserRepository extends JpaRepository<Users,Integer>{
	Optional<Users> findByUsername(String username);
}
