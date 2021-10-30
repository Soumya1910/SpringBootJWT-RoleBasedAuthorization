package com.spring.security.jwt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguration {
	
	private final String GET = "GET";
	private final String DELETE = "DELETE";
	private final String POST = "POST";
	private final String PUT = "PUT";

	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {

			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
					.allowedMethods(GET, DELETE, POST, PUT)
					.allowedHeaders("*")
					.allowedOriginPatterns("*")
					.allowCredentials(true);
			}
			
			
		};
	}
}
