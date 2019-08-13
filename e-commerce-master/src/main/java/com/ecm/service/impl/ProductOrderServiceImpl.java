package com.ecm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecm.entity.ProductOrder;
import com.ecm.repo.ProductOrderRepository;
import com.ecm.service.ProductOrderService;

@Service
public class ProductOrderServiceImpl implements ProductOrderService{

	@Autowired
	private ProductOrderRepository productRepository;

	@Override
	public void save(ProductOrder prdtOrd) {
		productRepository.save(prdtOrd);		
	}
	
}
