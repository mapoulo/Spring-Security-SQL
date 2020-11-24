package com.securitysql.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Role {
	
	@Id
	private int role_id;
	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public String getRole() {
		return user_role;
	}

	public void setRole(String role) {
		this.user_role = role;
	}

	private String user_role;

}
