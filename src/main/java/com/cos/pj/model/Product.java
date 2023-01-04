package com.cos.pj.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Table(name="product")
@Getter
@Setter
@AllArgsConstructor
@Entity
@SequenceGenerator(
		name="PRODUCT_SEQ_GENERATOR"
		, sequenceName="PRODUCT_SEQ"
		, initialValue =1
		, allocationSize =1
		)

public class Product {
	@Id //primary key
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PRODUCT_SEQ_GENERATOR")
	//프로젝트에 연결된 DB의 넘버링 전략을 사용
	private int id;//시퀀스
	
	@Column(nullable=false)
	private String pName; //상품이름
	
	@Column(nullable=false)
	private int pPrice;

	@ManyToOne(fetch=FetchType.EAGER)
	private Users users;
	
	@CreationTimestamp
	private Timestamp createDate;
	

}
