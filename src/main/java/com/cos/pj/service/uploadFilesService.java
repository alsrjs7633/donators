package com.cos.pj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cos.pj.model.uploadFiles;
import com.cos.pj.repository.FilesRepository;

@Service
public class uploadFilesService {
	@Autowired
	FilesRepository filesRepository;
	
	public void save(uploadFiles files) {
		uploadFiles f=new uploadFiles();
		f.setFileName(files.getFileName());
		f.setFileOriName(files.getFileOriName());
		f.setFileUrl(files.getFileUrl());
		
		filesRepository.save(f);

	}
}
