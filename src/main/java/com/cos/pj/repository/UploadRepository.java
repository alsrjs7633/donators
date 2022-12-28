package com.cos.pj.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.pj.model.UploadFiles;

public interface UploadRepository extends JpaRepository<UploadFiles,Long>{

	 //Page<UploadFiles> findByTitleContaining(String searchKeyword, Pageable pageable);
	 //BY => where, Containing => Like
}
