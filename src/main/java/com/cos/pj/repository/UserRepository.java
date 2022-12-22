package com.cos.pj.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.pj.model.Users;

//jsp의 DAO
//자동으로 bean 등록
public interface UserRepository extends JpaRepository<Users,Integer>{
	Optional<Users> findByUsername(String username);

	

	
}
