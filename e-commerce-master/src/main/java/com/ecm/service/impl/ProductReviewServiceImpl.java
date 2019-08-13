package com.ecm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecm.entity.ProductEntity;
import com.ecm.entity.ProductReview;
import com.ecm.repo.ProductReviewRepository;
import com.ecm.service.ProductReviewService;

@Service
public class ProductReviewServiceImpl implements ProductReviewService{

	@Autowired
	private ProductReviewRepository productImageRepository;

	@Override
	public List<ProductReview> FindByProductEntity(ProductEntity obj) {
		return productImageRepository.findByProductEntity(obj);
	}
	
	
}
