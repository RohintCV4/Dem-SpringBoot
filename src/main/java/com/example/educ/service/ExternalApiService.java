package com.example.educ.service;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.educ.entity.School;
import com.example.educ.repository.SchoolRepository;

@Service
public class ExternalApiService {

	@Autowired
	SchoolRepository schoolRepository;
	
	@Autowired
	RestTemplate restTemplate;
	
    private final String url = "https://gorest.co.in/public/v2/users";

	public void postalldata() {
		List<School> getallData=getUsers();
	    schoolRepository.saveAll(getallData);
	    
	}

	public List<School> getUsers() {
		ResponseEntity<School[]>responseEntity=restTemplate.getForEntity(url, School[].class);
		return Arrays.asList(responseEntity.getBody());
	}
}