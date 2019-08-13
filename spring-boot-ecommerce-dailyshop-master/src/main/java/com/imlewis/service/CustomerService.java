package com.imlewis.service;

import java.util.List;

import com.imlewis.model.AppUser;

public interface CustomerService {
	
	AppUser findOne(Long customerId);
	
	void save(AppUser appUser);
	
	void activeAccount(String codeStr);
	
	AppUser findByEmail(String email);
	
	boolean hasRole(String role, AppUser appUser);
	
	List<AppUser> getAllCustomer();
	
	void delete(Long customerId);
}
