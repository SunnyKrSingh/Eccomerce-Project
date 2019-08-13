package com.ecm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.ecm.common.ProductTagsEnum;

import lombok.Data;

@Data
@Entity
public class ProductEntity {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String productName;
		private String productUrl;
		@ManyToOne
	    @JoinColumn(name ="product_category")
		private ProductCategory productCategory;
		private String productShortDesc;
		private String productLongDesc;
		private float actualPrice;
		private float discountPrice;
		private ProductTagsEnum tag ;
		
}
