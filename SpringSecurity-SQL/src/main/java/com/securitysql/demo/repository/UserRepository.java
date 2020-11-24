package com.securitysql.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.securitysql.demo.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUsernae(String username);

}
