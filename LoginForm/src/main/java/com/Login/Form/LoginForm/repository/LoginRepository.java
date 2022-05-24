package com.Login.Form.LoginForm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Login.Form.LoginForm.model.User;

public interface LoginRepository extends JpaRepository<User, Integer>{
	public User findByEmailId(String emailId);
	
}
