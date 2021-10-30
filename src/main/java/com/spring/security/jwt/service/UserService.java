package com.spring.security.jwt.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.security.jwt.entity.Role;
import com.spring.security.jwt.entity.User;
import com.spring.security.jwt.repo.RoleRepository;
import com.spring.security.jwt.repo.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private RoleRepository roleRepo;

	public User createUser(User user) {
		return userRepo.save(user);
	}
	
	public void initRoleAndUser() {
		
		// save admin role details 
		Role adminRole = new Role();
		adminRole.setRole_name("admin");
		adminRole.setRole_description("Admin role for application");
		roleRepo.save(adminRole);
		
		// save user role details
		Role userRole = new Role();
		userRole.setRole_name("user");
		userRole.setRole_description("Default role for newly created user");
		roleRepo.save(userRole);
		
		// save admin user details
		User adminUser = new User();
		adminUser.setUserName("admin123");
		adminUser.setUserFirstName("Admin");
		adminUser.setUserLastName("Admin");
		adminUser.setUserPassword("admin@123");
		Set<Role> setAdminRole = new HashSet();
		setAdminRole.add(adminRole);
		adminUser.setRole(setAdminRole);
		userRepo.save(adminUser);
		
		// save user details
		User defaultUser = new User();
		defaultUser.setUserName("user");
		defaultUser.setUserFirstName("soumya");
		defaultUser.setUserLastName("Mukherjee");
		defaultUser.setUserPassword("soumya@123");
		Set<Role> setUserRole = new HashSet<Role>();
		setUserRole.add(userRole);
		defaultUser.setRole(setUserRole);
		userRepo.save(defaultUser);
	}

	
}
