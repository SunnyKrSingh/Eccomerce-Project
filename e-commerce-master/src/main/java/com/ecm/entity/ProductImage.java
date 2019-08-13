package com.ecm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class ProductImage {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		@ManyToOne
	    @JoinColumn(name ="product_entity")
		private ProductEntity productEntity;
		private String mediumImage;
		private String thumbnailImage;
		private String largeImage;
		
}