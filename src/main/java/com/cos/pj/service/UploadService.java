package com.cos.pj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.cos.pj.model.Boards;
import com.cos.pj.model.UploadFiles;
import com.cos.pj.model.Users;
import com.cos.pj.repository.UploadRepository;

@Service
public class UploadService {
	
	@Autowired
	private UploadRepository uploadRepository;
	
	@Transactional
	public void 업로드(String saveFile, Users user, MultipartFile multi){//이미지 이름
		UploadFiles uploadfiles = new UploadFiles();
		uploadfiles.setDbFileName(saveFile);
		uploadfiles.setUsers(user);
		uploadfiles.setUploadFileName(multi.getOriginalFilename());
		uploadRepository.save(uploadfiles);
	}
	
	public List<UploadFiles> 글목록(){
		return uploadRepository.findAll();
	}
	
}
