package com.imlewis.repository;

import org.springframework.data.repository.CrudRepository;

import com.imlewis.model.AppUser;
import com.imlewis.model.Role;

public interface RoleRepository extends CrudRepository<Role, Long>{
	Role findByAuthorityAndCustomer(String auth, AppUser appUser);
}
