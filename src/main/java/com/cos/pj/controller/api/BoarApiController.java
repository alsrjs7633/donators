package com.cos.pj.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cos.pj.config.auth.PrincipalDetail;
import com.cos.pj.dto.ResponseDto;
import com.cos.pj.model.Boards;
import com.cos.pj.service.BoardService;

@RestController
public class BoarApiController {
	
	@Autowired
	private BoardService boardService;
	
	
	@PostMapping("/api/board")
	public ResponseDto<Integer> save(@RequestBody Boards board,@AuthenticationPrincipal PrincipalDetail principal){
		boardService.글쓰기(board,principal.getUser());
		return new ResponseDto<Integer>(HttpStatus.OK.value(),1);
	}
}
