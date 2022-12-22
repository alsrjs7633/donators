package com.cos.pj.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cos.pj.model.RoleType;
import com.cos.pj.model.Users;
import com.cos.pj.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder encodeer;
	
	@Transactional
	public void 회원가입(Users user) {
		String rawPassword =user.getPassword();
		String encPassword = encodeer.encode(rawPassword);
		user.setPassword(encPassword);
		user.setRoles(RoleType.USER);
		userRepository.save(user); //하나의 트랜젝션
	}
	@Transactional
	public int 중복체크(Users user) {
		 int cnt=userRepository.findByUsername(username,user.getUsername());
		 return cnt;
	}
	
	
	
}
