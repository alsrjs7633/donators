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
	public ResponseDto<Integer> save(@RequestBody Users user) {//save의 data가 input type=text 
		System.out.println("UserApiController호출됨");		   //-> 어떤 타입이 들어올지 모르기때문에 사용
		//control
		//클라이언트가 보낸 요청에 대해서 어떤 처리를 해야할 지 결정해준다
		//여기서 컨트롤러는 해당 요청에 대한 처리의 로직에 관여하진 않는다(->Service)
		//들어온 url 요청에 대해 어떤 view를 리턴할 지 결정해준다.
		//Model 객체는 Controller 에서 생성된 데이터를 담아 View 로 전달할 때 사용하는 객체이다.
		userService.회원가입(user);
		return new ResponseDto<Integer>(HttpStatus.OK.value(),1);
		//result가 1이면 성공, -1이면 실패
		//자바 오브젝트를 리턴받아옴
	}
	
	
	

    
	
}
