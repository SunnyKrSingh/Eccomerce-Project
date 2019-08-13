package com.imlewis.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.imlewis.model.AppUser;
import com.imlewis.model.Role;
import com.imlewis.repository.CustomerRepository;

@Service("customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
    private CustomerRepository customerRepository;
     
    @Transactional(readOnly=true)
    public UserDetails loadUserByUsername(String email)
            throws UsernameNotFoundException {
        AppUser appUser = customerRepository.findByEmail(email);
        if(appUser == null){
            throw new UsernameNotFoundException("Username not found"); 
        }
            return new org.springframework.security.core.userdetails.User(appUser.getEmail(), appUser.getPassword(), 
            		appUser.isEnabled(), true, true, true, getGrantedAuthorities(appUser));
    }
 
     
    private List<GrantedAuthority> getGrantedAuthorities(AppUser appUser){
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        for(Role role : appUser.getRoles()){
            authorities.add(new SimpleGrantedAuthority(role.getAuthority()));
        }
        return authorities;
    }
}
