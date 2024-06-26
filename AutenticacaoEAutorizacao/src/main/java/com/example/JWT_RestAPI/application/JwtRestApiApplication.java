package com.example.JWT_RestAPI.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = {"com.example"})
@EnableMongoRepositories("com.example.JWT_RestAPI.repository")
public class JwtRestApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(JwtRestApiApplication.class, args);
	}
}
