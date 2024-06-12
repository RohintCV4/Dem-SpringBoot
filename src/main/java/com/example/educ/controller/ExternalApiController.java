package com.example.educ.controller;

import com.example.educ.entity.ExternalApi;
import com.example.educ.service.ExternalApiService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pageapi")
public class ExternalApiController {
	@Autowired
    private ExternalApiService externalApiService;
    //ExternalApiController() {}
//    public ExternalApiController(ExternalApiService externalApiService) {
//        this.externalApiService = externalApiService;
//    }
    
    

    @GetMapping("/getexternalusers")
    public String updateValues()  {
        return externalApiService.updateValues() ;
    }
    
    @PostMapping("/externalapi")
	public void insertApiValue(final int page) {
		 this.externalApiService.insertApiValue(page);
	}
}