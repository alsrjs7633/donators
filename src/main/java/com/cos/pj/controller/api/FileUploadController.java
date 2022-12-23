package com.cos.pj.controller.api;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
public class FileUploadController {
	 @PostMapping(value={"/upload"})
     @ResponseBody
     public Map<String, Object> TestUploadUtil(HttpServletRequest req) throws IOException {
         
         Map<String, Object> result = new HashMap<>();
         MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) req;
         
         // 파일 디렉토리
         Path uploadDir = Paths.get("C:\\Users\\GREEN\\Documents\\upload");
         
         
         MultipartFile mFile = (MultipartFile) multipartRequest.getFileMap().values();
             
         UUID tempFileName = UUID.randomUUID(); 
         String originalFileName = mFile.getOriginalFilename();        // 원본 파일명
         String fileExt = FilenameUtils.getExtension(originalFileName);
             
         if(originalFileName.toLowerCase().endsWith(".tar.bz2")) {
             fileExt = "tar.bz2";
         } else if(originalFileName.toLowerCase().endsWith(".tar.gz")) {
             fileExt = "tar.gz";
         }
         // 물리파일은 확장자를 제외하고 저장한다.
         String logicalFileName = tempFileName.toString()+ "." + fileExt;
            
         byte[] fileBytes = mFile.getBytes(); // 파일을 바이트로 읽어온다.
         Path filePath = uploadDir.resolve(logicalFileName);
         Files.write(filePath, fileBytes); // 파일 생성
         return result;
             
     }

}