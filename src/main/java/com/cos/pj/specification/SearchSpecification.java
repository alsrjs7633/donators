package com.cos.pj.specification;


import org.springframework.data.jpa.domain.Specification;

import com.cos.pj.model.UploadFiles;

public class SearchSpecification {
	public static Specification<UploadFiles> searchTypeTitle(String genSelect) {//users의 gender와 genSelect 비교
        return (root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("users").get("gender"),genSelect);
    }

}
