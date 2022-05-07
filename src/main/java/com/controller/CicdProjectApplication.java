package com.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdProjectApplication {
	@GetMapping("/message")
	public String getMessage() {
		return "Spring project is ready for Docker and Jenkins";
	}

	public static void main(String[] args) {
		SpringApplication.run(CicdProjectApplication.class, args);
	}

}
