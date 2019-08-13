package com.ecm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.ecm.common.SizeEnum;

import lombok.Data;

@Data
@Entity
public class ProductPrice {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		@ManyToOne
	    @JoinColumn(name ="product_entity")
		private ProductEntity productEntity;
		private SizeEnum size;
		private int quantity;
		private float actualPrice;
		private float discountPrice;
		
}