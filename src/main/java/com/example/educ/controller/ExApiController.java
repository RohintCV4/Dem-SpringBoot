package com.example.educ.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.educ.entity.ExApi;
import com.example.educ.service.ExApiService;

@RestController
public class ExApiController {
	@Autowired
	private ExApiService exapiService;
	@PostMapping("/exapi")
	public void postData() {
		this.exapiService.postData();
	}
	@GetMapping("/getapi")
	public List<ExApi> getData(){
		return exapiService.getData();
	}
	
	
}
