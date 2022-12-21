package com.cos.pj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cos.pj.model.Boards;
import com.cos.pj.model.Users;
import com.cos.pj.repository.BoardRepository;

//스프링이 컴포넌트 스캔을 통해 Bean에 등록,Ioc 해준다
@Service
public class BoardService {
	@Autowired
	private BoardRepository boardRepository;
	
	@Transactional
	public void 글쓰기(Boards board,Users user){//title,content
		board.setCount(0);
		board.setUsers(user);
		boardRepository.save(board);
	}
	public List<Boards> 글목록(){
		return boardRepository.findAll();
	}
}
