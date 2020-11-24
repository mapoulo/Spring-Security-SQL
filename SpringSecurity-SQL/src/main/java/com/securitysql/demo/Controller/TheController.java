package com.securitysql.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/all")
public class TheController {
     
	
	@RequestMapping(value="/user")
	public String getAllUser() {
		return "The secured url ...";
	}
}
