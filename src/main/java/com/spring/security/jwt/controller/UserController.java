package com.spring.security.jwt.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.security.jwt.entity.User;
import com.spring.security.jwt.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostConstruct
	public void initRoleAndUser() {
		this.userService.initRoleAndUser();
	}
	
	@PostMapping("/register")
	public User registerUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
	@GetMapping("/forAdmin")
	public String forAdmin() {
		return "This API is accessible only for admin";
	}
	
	@GetMapping("/forUser")
	public String forUser() {
		return "This API is accessible only for user";
	}
}
