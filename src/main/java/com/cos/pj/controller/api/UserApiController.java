package com.cos.pj.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cos.pj.dto.ResponseDto;
import com.cos.pj.model.Users;
import com.cos.pj.service.UserService;


@RestController
public class UserApiController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/auth/joinProc")//회원가입 로직이 실행되는 부분
	public ResponseDto<Integer> save(@RequestBody Users user) {//@request
		System.out.println("UserApiController호출됨");
		//user.setRoles(RoleType.USER);
		//실제로 DB에 insert를 하고 아래에서(1자리에) return이 된다.
		
		userService.회원가입(user);
		return new ResponseDto<Integer>(HttpStatus.OK.value(),1);
		//result가 1이면 성공, -1이면 실패
		//자바 오브젝트를 리턴받아옴
	}
	@PostMapping("/idCheck")
	public String idcheck(@RequestBody Users user){
			 if(userService.중복체크(user)!=0) {
				 return "fail";
			 }else {
			 return "success";}
		}
		
	
	

    
	
}
