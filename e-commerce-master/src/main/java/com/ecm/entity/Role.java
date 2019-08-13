package com.ecm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "role")
@Data
public class Role {

	@Id
	@GeneratedValue
	private Long roleId;
	private String authority;
	private String email;

	@ManyToOne
	@JoinColumn(name = "userId")
	private AppUser appUser;

	

	

}
