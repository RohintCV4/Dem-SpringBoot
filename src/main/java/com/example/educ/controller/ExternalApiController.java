package com.example.educ.controller;

import com.example.educ.entity.School;
import com.example.educ.service.ExternalApiService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExternalApiController {

    private final ExternalApiService externalApiService;

    public ExternalApiController(ExternalApiService externalApiService) {
        this.externalApiService = externalApiService;
    }

    @GetMapping("/get/users")
    public List<School> getUsers() {
        return externalApiService.getUsers();
    }
    
    @PostMapping("/api")
	public void postalldata() {
		 this.externalApiService.postalldata();
	}
}