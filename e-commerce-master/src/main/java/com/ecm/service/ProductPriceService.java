package com.ecm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecm.common.SizeEnum;
import com.ecm.entity.ProductEntity;
import com.ecm.entity.ProductPrice;

@Service
public interface ProductPriceService {

	List<ProductPrice> findByProductEntity(ProductEntity obj);

	ProductPrice findByProductEntityAndSize(ProductEntity obj, SizeEnum valueOf);

	
}
