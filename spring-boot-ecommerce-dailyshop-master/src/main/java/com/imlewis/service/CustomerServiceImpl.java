package com.imlewis.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.imlewis.model.Cart;
import com.imlewis.model.Code;
import com.imlewis.model.AppUser;
import com.imlewis.model.Role;
import com.imlewis.repository.CartRepository;
import com.imlewis.repository.CustomerRepository;
import com.imlewis.repository.RoleRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private CodeService codeService;

    public void save(AppUser appUser) {
    	System.out.println("CustomerServiceImpl.save()");
        appUser.setPassword(passwordEncoder.encode(appUser.getPassword()));
        System.out.println("password:: "+appUser.getPassword());
    	// save or update
    	if(appUser.getCustomerId() == null){
    		Cart cart = new Cart();
    		Role role = new Role();
        	role.setEmail(appUser.getEmail());
        	role.setAuthority("ROLE_UNAUTH");
        	role.setCustomer(appUser);
        	// create customer first
        	customerRepository.save(appUser);
        	// save cart
        	cart.setCustomer(appUser);
        	cartRepository.save(cart);
        	// update cartId in Customer
        	appUser.setCart(cart);
        	appUser.setEnabled(true);
        	customerRepository.save(appUser);
        	// save role
        	roleRepository.save(role);
        	// generate active code
        	Code code = new Code();
        	code.setCodeDate(new Date());
        	code.setCodeType(0);
        	code.setCustomer(appUser);
        	
        	codeService.save(code);
    	}else{
    		customerRepository.save(appUser);
    	}
    }
    
    public void activeAccount(String codeStr){
    	Code code = codeService.findByCodeStr(codeStr);
    	if(code != null){
        	AppUser appUser = code.getCustomer();
        	Role role = new Role();
        	role.setAuthority("ROLE_USER");
        	role.setCustomer(appUser);
        	role.setEmail(appUser.getEmail());
        	roleRepository.save(role);
        	// delete role UNAUTH
        	roleRepository.delete(roleRepository.findByAuthorityAndCustomer("ROLE_UNAUTH", appUser));
        	// delete active code
        	codeService.delete(code);
    	}
    }
    
    public AppUser findByEmail(String email){
    	return customerRepository.findByEmail(email);
    }
    
    public AppUser findOne(Long customerId){
    	return customerRepository.findOne(customerId);
    }
    
    public boolean hasRole(String role, AppUser appUser){
    	return (roleRepository.findByAuthorityAndCustomer(role, appUser) != null);
    }
    
    public List<AppUser> getAllCustomer(){
    	return (List<AppUser>) customerRepository.findAll();
    }
    
    public void delete(Long customerId){
    	customerRepository.delete(customerId);
    }
}
