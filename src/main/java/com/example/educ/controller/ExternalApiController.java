package com.example.educ.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.educ.service.ExternalApiService;

@RestController
@RequestMapping("/pageapi")
public class ExternalApiController {
	@Autowired
	private ExternalApiService externalApiService;

//    @GetMapping("/getexternalusers")
//    public String updateValues()  {
//        return externalApiService.updateValues() ;
//    }

	@PostMapping("/externalapi/{id}")
	public void insertApiValue(@PathVariable Long id) {
		this.externalApiService.insertApiValue(id);
	}
}