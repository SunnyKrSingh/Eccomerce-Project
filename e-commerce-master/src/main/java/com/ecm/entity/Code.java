package com.ecm.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Code {
	
	@Id
    @GeneratedValue
    private Long codeId;
	
	private String codeStr;
	private int codeType; // 0:active, 1: reset PW
	
	@Column(columnDefinition="DATETIME")
	private Date codeDate;
	
	@ManyToOne
    @JoinColumn(name = "userId")
    private AppUser customer;

		
}
