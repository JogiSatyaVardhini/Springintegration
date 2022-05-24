package com.Login.Form.LoginForm.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Login.Form.LoginForm.model.User;
import com.Login.Form.LoginForm.service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	private LoginService service;
	
	@PostMapping("/loginuser")
	public User loginUser(@RequestBody User user) throws Exception {
		String tempEmailId = user.getEmailId();
		if(tempEmailId != null && !"".equals(tempEmailId)) {
			User userObj = service.fetchUserByEmailId(tempEmailId);
			if(userObj != null) {
				throw new Exception("user with "+tempEmailId+" is already exist");
			}
		}
		User userObj = null;
		
		userObj = service.saveUser(user);
		return  userObj;
	}

}
