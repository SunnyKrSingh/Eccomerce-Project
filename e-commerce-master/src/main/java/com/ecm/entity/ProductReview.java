package com.ecm.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class ProductReview {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "product_entity")
	private ProductEntity productEntity;
	private float rating;
	private String reviewDesc;
	@ManyToOne

	@JoinColumn(name = "app_users")
	private AppUser user;

	private Date dateCreated;

}