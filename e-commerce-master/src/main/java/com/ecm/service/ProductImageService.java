package com.ecm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecm.entity.ProductEntity;
import com.ecm.entity.ProductImage;

@Service
public interface ProductImageService {

	List<ProductImage> findByProductEntity(ProductEntity obj);


}
