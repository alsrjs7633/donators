package com.cos.pj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.cos.pj.model.Boards;
import com.cos.pj.model.UploadFiles;


public interface BoardRepository  extends JpaRepository<Boards, Integer>,JpaSpecificationExecutor<Boards>{


}
