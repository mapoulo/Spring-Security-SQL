package com.securitysql.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.securitysql.demo.model.User;
import com.securitysql.demo.repository.UserRepository;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private UserRepository userRepository;
	
	@PreAuthorize("hasAnyRole('ADMIN')")
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String addUserByAdmin(@RequestBody User user) {
	  String password = user.getPassword();
	  String encryptedPassword = passwordEncoder.encode(password);
	  user.setPassword(encryptedPassword);
	  userRepository.save(user);
		return "The user is successfully added ";
	}
	

}
