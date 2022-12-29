package com.cos.pj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.cos.pj.model.UploadFiles;
import com.cos.pj.model.Users;
import com.cos.pj.repository.UploadRepository;

@Service
public class UploadService {
	
	@Autowired
	private UploadRepository uploadRepository;
	
	@Transactional
	public void 업로드(String saveFile, Users user, MultipartFile multi){//이미지 이름
		UploadFiles uploadfile = new UploadFiles();
		uploadfile.setDbFileName(saveFile);
		uploadfile.setUsers(user);
		uploadfile.setUploadFileName(multi.getOriginalFilename());
		uploadRepository.save(uploadfile);
	}

	public Page<UploadFiles> 글목록(Pageable pageable){
		return uploadRepository.findAll(pageable);
	}
	
		 
		
	
	
}
