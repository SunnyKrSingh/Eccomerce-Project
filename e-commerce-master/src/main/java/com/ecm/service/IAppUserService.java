package com.ecm.service;

import java.util.List;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ecm.entity.AppUser;


public interface IAppUserService {

	//public String registerUser(AppUser ap,RedirectAttributes attributes);

    AppUser findOne(Long customerId);
	
	void save(AppUser appUser);
	
	void activeAccount(String codeStr);
	
	AppUser findByEmail(String email);
	
	boolean hasRole(String role, AppUser appUser);
	
	List<AppUser> getAllCustomer();
	
	void delete(Long customerId);
	
	AppUser findById(Long l);
}
