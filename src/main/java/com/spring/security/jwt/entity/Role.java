package com.spring.security.jwt.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "role_details")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Role {
	
	@Id
	private String role_name;
	private String role_description;

}
