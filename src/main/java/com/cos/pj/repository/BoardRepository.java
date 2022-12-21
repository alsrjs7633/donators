package com.cos.pj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.pj.model.Boards;

public interface BoardRepository extends JpaRepository<Boards,Integer>{

}
