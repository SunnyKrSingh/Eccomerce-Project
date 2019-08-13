package com.ecm.entity;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ecm.common.GenderEnum;

import lombok.Data;

@Data
@Entity
public class ProductCategory {

	ProductCategory(){
		System.out.println("ProductCategory.ProductCategory()");
	}
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String categoryName;
		private GenderEnum gender ;
		
}
