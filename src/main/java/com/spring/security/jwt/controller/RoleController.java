package com.spring.security.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.security.jwt.entity.Role;
import com.spring.security.jwt.service.RoleService;

@RestController
@RequestMapping("/role")
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	@PostMapping("/createnewrole")
	public Role createRole(@RequestBody Role role) {
		return roleService.createRole(role);
	}

}
