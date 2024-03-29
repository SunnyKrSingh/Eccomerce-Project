package com.imlewis.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.imlewis.model.AppUser;
import com.imlewis.model.ShippingAddress;

public interface ShippingAddressRepository extends CrudRepository<ShippingAddress, Long>{
	
	List<ShippingAddress> findAllByCustomer(AppUser appUser);
	
	
}
