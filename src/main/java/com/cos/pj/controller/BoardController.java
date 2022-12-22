package com.cos.pj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cos.pj.service.BoardService;

//게시글 작성하기 33p
@Controller
public class BoardController {
	
	
	
	@GetMapping("/boardSaveForm")
	public String boardSaveForm() {
		return "boardSaveForm";
	}
	@GetMapping("/auth/noticeBoard")
	public String noticeBoard() {
		return "noticeBoard";
	}
	@GetMapping("/boardList")
	public String boardList() {
		return "boardList";
	}
	@GetMapping("/boardDetail")
	public String boardDetail() {
		return "boardDetail";
	}
	@GetMapping("/uploadFile")
	public String uploadFiles() {
		return "uploadFile";
	}
}
