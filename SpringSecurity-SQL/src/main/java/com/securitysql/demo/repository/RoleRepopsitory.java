package com.securitysql.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.securitysql.demo.model.Role;

public interface RoleRepopsitory extends JpaRepository<Role, Integer> {

}
