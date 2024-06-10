package com.example.educ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication



public class EducApplication {

	public static void main(String[] args) {
		SpringApplication.run(EducApplication.class, args);
	}

}
