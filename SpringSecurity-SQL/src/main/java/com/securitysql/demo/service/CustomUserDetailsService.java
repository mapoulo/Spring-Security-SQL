package com.securitysql.demo.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.securitysql.demo.model.User;
import com.securitysql.demo.repository.UserRepository;




public class CustomUserDetailsService implements UserDetailsService {

	 private UserRepository userRepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepo.findByUsernae(username);
		CustomUserDetails userDetails = null;
		if(user != null) {
			userDetails = new CustomUserDetails();
			userDetails.setUser(user);
		}
		return null;
	}

}
