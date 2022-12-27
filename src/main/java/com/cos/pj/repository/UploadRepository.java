package com.cos.pj.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.pj.model.UploadFiles;

public interface UploadRepository extends JpaRepository<UploadFiles,Long>{

	

}
