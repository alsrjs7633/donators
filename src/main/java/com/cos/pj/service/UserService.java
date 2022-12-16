package com.cos.pj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cos.pj.model.Users;
import com.cos.pj.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	
	@Transactional
	public void 회원가입(Users user) {
			userRepository.save(user);
	}
	@Transactional(readOnly=true)
	public Users 로그인(Users user) {
		return userRepository.findByUsernameAndPassword(user.getUsername()
				,user.getPassword());
	}
}
