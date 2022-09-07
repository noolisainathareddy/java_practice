package com.spring.firstProject.hello.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	
	public boolean authenticate(String username, String password) {
		
		boolean isValidUserName = username.equalsIgnoreCase("sai");
		boolean isValidPassword = password.equalsIgnoreCase("dummy");
		return isValidUserName && isValidPassword; 
	}
}
