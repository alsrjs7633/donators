package com.cos.pj.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.cos.pj.model.UploadFiles;

public interface UploadRepository extends JpaRepository<UploadFiles,Long>,JpaSpecificationExecutor<UploadFiles>{
	Page<UploadFiles> findByUsers_genderContaining(String genSelect, Pageable pageable);

	Page<UploadFiles> findByUsers_areaContaining(String area);

	Page<UploadFiles> findByUsers_birthContaining(String min_birth, String max_birth);

	
	
	

	//findBy + (fk필드_첫문자는대문자) + "_" + "fk도메인의 ID 필드" 로 생성하면 된다
	// Page<UploadFiles> findByUsersContaining(String genSelect, Pageable pageable);
	//BY => where, Containing => Like
}
