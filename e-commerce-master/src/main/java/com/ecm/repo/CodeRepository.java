package com.ecm.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ecm.entity.AppUser;
import com.ecm.entity.Code;

public interface CodeRepository extends CrudRepository<Code, Long>{
	
	List<Code> findByCodeTypeAndCustomer(int codeType, AppUser appUser);
	
	Code findByCodeStr(String codeStr);
}
