package com.spring.security.jwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.security.jwt.entity.Role;
import com.spring.security.jwt.repo.RoleRepository;

@Service
public class RoleService {
	
	@Autowired
	private RoleRepository roleRepo;
	
	public Role createRole(Role role) {
		
		return roleRepo.save(role);
	}

}
