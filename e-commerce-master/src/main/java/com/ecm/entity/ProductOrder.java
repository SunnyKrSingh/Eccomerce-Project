package com.ecm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.ecm.common.OrderTypeEnum;

import lombok.Data;

@Data
@Entity
public class ProductOrder {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		@ManyToOne
	    @JoinColumn(name ="product_entity")
		private ProductEntity productEntity;
		@ManyToOne
	    @JoinColumn(name ="product_price")
		private ProductPrice productPrice;
		private OrderTypeEnum orderTypeEnum;
		private int quantity;
		
}