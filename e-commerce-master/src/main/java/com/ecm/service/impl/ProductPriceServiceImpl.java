package com.ecm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecm.common.SizeEnum;
import com.ecm.entity.ProductEntity;
import com.ecm.entity.ProductPrice;
import com.ecm.repo.ProductPriceRepository;
import com.ecm.service.ProductPriceService;

@Service
public class ProductPriceServiceImpl implements ProductPriceService{

	@Autowired
	private ProductPriceRepository productPriceRepository;

	@Override
	public List<ProductPrice> findByProductEntity(ProductEntity obj) {
		return productPriceRepository.findByProductEntity(obj);
	}

	@Override
	public ProductPrice findByProductEntityAndSize(ProductEntity obj, SizeEnum valueOf) {
		return productPriceRepository.findByProductEntityAndSize(obj, valueOf);
	}
}
