package com.cos.pj.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.pj.model.uploadFiles;

public interface FilesRepository extends JpaRepository<uploadFiles,Integer>{

	Optional<uploadFiles> findByUsername(String username);
}
