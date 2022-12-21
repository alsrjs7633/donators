package com.cos.pj.controller.api;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cos.pj.model.uploadFiles;
import com.cos.pj.service.uploadFilesService;

@RestController
public class UploadApiController {
	
	@Autowired
	uploadFilesService filesService;
	
	@PostMapping("/upload")
	public String uploadFile(@RequestPart MultipartFile files) throws IOException{
		
		uploadFiles file = new uploadFiles();
		String sourceFileName = files.getOriginalFilename();
		String sourceFileNameExtension = FilenameUtils.getExtension(sourceFileName).toLowerCase();
		FilenameUtils.removeExtension(sourceFileName);
		
		File destinationFile;
		String destinationFileName;
		String fileUrl = "C:\\Users\\GREEN\\Documents\\upload";
		UUID one=UUID.randomUUID();
		do {//uuid 역할
			destinationFileName = one+"."+sourceFileNameExtension;
			destinationFile = new File(fileUrl+destinationFileName);
		}while(destinationFile.exists());
		destinationFile.getParentFile().mkdirs();
		files.transferTo(destinationFile);
		
		file.setFileName(destinationFileName);
		file.setFileOriName(sourceFileName);
		file.setFileUrl(fileUrl);
		filesService.save(file);
		return "redirect:/upload";
	}
	
}
