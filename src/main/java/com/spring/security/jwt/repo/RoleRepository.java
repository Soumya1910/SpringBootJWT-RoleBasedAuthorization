package com.spring.security.jwt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.security.jwt.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {

}
