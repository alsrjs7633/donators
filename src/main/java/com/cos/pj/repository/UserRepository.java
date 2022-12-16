package com.cos.pj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.pj.model.user;

//jspd 의 DAO
//자동으로 bean이 등록이된다.
//@Repository 생략가능
public interface userRepository extends JpaRepository<user,Integer>{
	//jpaRepository를 상속받으면 save,update,delete등등을 할 수 있다.
	//로그인을 위한 함수
		//jpa naming 전략
		//select * from users where username=? and password=?;
		//Users findByUsernameAndPassword(String username, String password);
		//위와같다.
		//@Query(value="select * from users where username=?1
		//and password=?2",nativeQuery=true)
		//User login(String username,String password);
}
