package com.cos.pj.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.cos.pj.config.auth.PrincipalDetailService;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private PrincipalDetailService principalDetailService;
	
	@Bean
	public BCryptPasswordEncoder encodePWD() {
		return new BCryptPasswordEncoder();
	}
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(principalDetailService).passwordEncoder(encodePWD());
		//패스워드 인코더가 encodePWD라는 것을 null자리의 오브젝트에게 알려줘야한다.
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.csrf().disable()
			.authorizeRequests()
			.antMatchers("/","/auth/**","/js/**","/css/**","/images/**")
			.permitAll()
			.anyRequest()
			.authenticated()
		.and()
			.rememberMe()// Remember Me 기능을 동작 시킴
		  	.rememberMeParameter("remember")//로그인 페이지에서 Remember Me 부분은 보통 체크박스로 구현할 텐데 이 때 해당 체크박스의 name 속성 값을 지정해주면 됨
		  	.tokenValiditySeconds(3600)//초 단위로 remember-me 토큰의 유효시간을 설정
		  	.alwaysRemember(false)//사용자가 이 기능을 사용한다고 체크하지 않아도 자동으로 사용하게 하는 기능(기본값은 false)
		  	.userDetailsService(principalDetailService)//Remember Me 기능을 사용하기 위해 필요한 사용자 정보
		.and()
			.formLogin()
			.loginPage("/auth/loginForm")
			.loginProcessingUrl("/auth/loginProc")
			.defaultSuccessUrl("/");
	}
}
