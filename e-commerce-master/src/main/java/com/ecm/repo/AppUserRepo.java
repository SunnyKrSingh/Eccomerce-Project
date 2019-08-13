package com.ecm.repo;

import java.io.Serializable;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.ecm.entity.AppUser;

@Repository
@Transactional
public interface AppUserRepo extends JpaRepository<AppUser, Serializable>, JpaSpecificationExecutor<AppUser> {
	
void activeAccount(String codeStr);
	
	AppUser findByEmail(String email);
	AppUser findByUserId(Long uid);

}
