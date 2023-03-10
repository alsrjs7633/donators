package com.cos.pj.config.auth;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.cos.pj.model.Users;

import lombok.Getter;



@Getter
public class PrincipalDetail implements UserDetails{
	private Users user;

//스프링 시큐리티가 로그인 요청을 가로채서 로그인을 진행하고 완료가 되면
//UserDetails 타입의 오브젝트를 스프링 시큐리티의 고유한 세션 저장소에 저장
//그 떄 저장되는게 PrincipalDetail이 저장된다.


	public PrincipalDetail(Users user) {
		this.user=user;
	}
	
	@Override
	public String getPassword() {
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		return user.getUsername();
	}

	//계정이 만료되지 않았는지 리턴된다(true:만료안됨)
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}
	//계정이 잠겨있지 않았는지 리턴된다.(true:잠기지 않음)
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}
	//비밀번호가 만료되지 않았는지 리턴한다.(true:만료안됨)
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}
	//계정이 활성화 되어있는지 리턴한다.(true:활성화)
	@Override
	public boolean isEnabled() {
		return true;
	}
	
	//계정이 갖고있는 권한목록은 리턴한다.(권한이 여러개 있을 수 있어서 루프를 돌려야한는데 지금은 한개만
		@Override
		public Collection<? extends GrantedAuthority> getAuthorities() {
			Collection<GrantedAuthority> collectors = new ArrayList<>();
			collectors.add(()->{return "ROLE_"+user.getRoles();});
			return collectors;
		}
}

