package com.ecm.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ecm.entity.AppUser;
import com.ecm.entity.Code;
import com.ecm.entity.Role;
import com.ecm.repo.AppUserRepo;
import com.ecm.repo.RoleRepository;
import com.ecm.service.CodeService;
import com.ecm.service.IAppUserService;

@Service
public class AppUserServiceImpl implements IAppUserService {

	@Autowired
	private AppUserRepo appUserRepo;
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	private CodeService codeService;

	@Override
	public AppUser findOne(Long customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(AppUser appUser) {
		System.out.println("CustomerServiceImpl.save()");
		appUser.setPassword(passwordEncoder.encode(appUser.getPassword()));
		System.out.println("password:: " + appUser.getPassword());
		// save or update
		
		if (appUser.getUserId() == null) {
			
			// Cart cart = new Cart();
			Role role = new Role();
			role.setEmail(appUser.getEmail());
			role.setAuthority("ROLE_UNAUTH");
			role.setAppUser(appUser);
			// create customer first
			appUserRepo.save(appUser);

			/*
			 * // save cart cart.setCustomer(appUser); //cartRepository.save(cart);
			 * 
			 * // update cartId in Customer appUser.setCart(cart); appUser.setEnabled(true);
			 * customerRepository.save(appUser);
			 */

			// save role
			roleRepository.save(role);
			// generate active code
			Code code = new Code();
			code.setCodeDate(new Date());
			code.setCodeType(0);
			code.setCustomer(appUser);
			codeService.save(code);
		} else {
			appUserRepo.save(appUser);
		}

	}

	@Override
	public void activeAccount(String codeStr) {
		Code code = codeService.findByCodeStr(codeStr);
    	if(code != null){
        	AppUser appUser = code.getCustomer();
        	Role role = new Role();
        	role.setAuthority("ROLE_USER");
        	role.setAppUser(appUser);
        	role.setEmail(appUser.getEmail());
        	roleRepository.save(role);
        	// delete role UNAUTH
        	roleRepository.delete(roleRepository.findByAuthorityAndAppUser("ROLE_UNAUTH", appUser));
        	// delete active code
        	codeService.delete(code);
    	}
	}

	@Override
	public AppUser findByEmail(String email) {
		return appUserRepo.findByEmail(email);
	}

	@Override
	public boolean hasRole(String role, AppUser appUser) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<AppUser> getAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long customerId) {
		// TODO Auto-generated method stub

	}

	@Override
	public AppUser findById(Long uid) {
		//return appUserRepo.findByUserId(uid).orElse(new AppUser());
		return appUserRepo.findByUserId(uid);
	}

}
