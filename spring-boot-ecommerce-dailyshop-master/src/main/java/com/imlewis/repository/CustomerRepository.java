package com.imlewis.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.imlewis.model.AppUser;

@Transactional
public interface CustomerRepository extends CrudRepository<AppUser, Long>{
	
	AppUser findByEmail(String email);
	
}
