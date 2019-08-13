package com.ecm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecm.entity.ProductEntity;
import com.ecm.entity.ProductReview;

@Service
public interface ProductReviewService {

	List<ProductReview> FindByProductEntity(ProductEntity obj);

}
