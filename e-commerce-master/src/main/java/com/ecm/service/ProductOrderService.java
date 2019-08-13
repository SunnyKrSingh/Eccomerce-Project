package com.ecm.service;

import org.springframework.stereotype.Service;

import com.ecm.entity.ProductOrder;

@Service
public interface ProductOrderService {

	void save(ProductOrder prdtOrd);


}
