package com.ecm.service;

import java.util.List;

import com.ecm.entity.AppUser;
import com.ecm.entity.Code;


public interface CodeService {
	
	List<Code> findByCodeTypeAndCustomer(int codeType, AppUser customer);
	
	void save(Code code);
	
	Code findByCodeStr(String codeStr);
	
	void delete(Code code);
}
