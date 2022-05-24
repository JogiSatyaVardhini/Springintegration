package com.Login.Form.LoginForm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Login.Form.LoginForm.model.User;
import com.Login.Form.LoginForm.repository.LoginRepository;

@Service
public class LoginService {
	
	
	@Autowired
	private LoginRepository repo;
	public User saveUser(User user) {
		
		return repo.save(user);
		
	}
	public User fetchUserByEmailId(String email) {
		return repo.findByEmailId(email);
	}

}
