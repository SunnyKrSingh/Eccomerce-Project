package com.ecm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecm.entity.ProductEntity;
import com.ecm.entity.ProductImage;
import com.ecm.repo.ProductImageRepository;
import com.ecm.service.ProductImageService;

@Service
public class ProductImageServiceImpl implements ProductImageService{

	@Autowired
	private ProductImageRepository productImageRepository;
	
	@Override
	public List<ProductImage> findByProductEntity(ProductEntity obj) {
		return productImageRepository.findByProductEntity(obj);
	}
	
}
