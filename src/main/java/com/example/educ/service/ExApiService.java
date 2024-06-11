package com.example.educ.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.educ.entity.ExApi;
import com.example.educ.repository.ExApiRepository;

@Service
public class ExApiService {
	@Autowired
	private ExApiRepository exapiRepository;
	@Autowired
	RestTemplate restTemplate;
	private final String url="https://gorest.co.in/public/v2/comments";
	
	public List<ExApi> getData(){
		ResponseEntity<ExApi[]>responseEntity=restTemplate.getForEntity(url, ExApi[].class);
		return Arrays.asList(responseEntity.getBody());
	}
	
	public void postData() {
		List<ExApi> getAllData=getData();
		exapiRepository.saveAll(getAllData);
	}
}
