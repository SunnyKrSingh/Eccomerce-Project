package com.ecm.repo;

import org.springframework.data.repository.CrudRepository;

import com.ecm.entity.AppUser;
import com.ecm.entity.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	Role findByAuthorityAndAppUser(String auth, AppUser appUser);
}
