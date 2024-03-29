package com.imlewis.service;

import java.util.List;

import com.imlewis.model.Code;
import com.imlewis.model.AppUser;

public interface CodeService {
	
	List<Code> findByCodeTypeAndCustomer(int codeType, AppUser appUser);
	
	void save(Code code);
	
	Code findByCodeStr(String codeStr);
	
	void delete(Code code);
}
