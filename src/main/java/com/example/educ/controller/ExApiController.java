package com.example.educ.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.educ.entity.ExApi;
import com.example.educ.repository.ExApiRepository;
import com.example.educ.service.ExApiService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



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
	@PostMapping("/userdata")
	public ExApi createData(@RequestBody ExApi exapi) {
				
		return exapiService.createData(exapi);
	}
	@PutMapping("/{id}")
	public ExApi putData(@PathVariable Long id, @RequestBody ExApi exapi) {
		
		return exapiService.updateData(id, exapi);
	}
	@DeleteMapping("/{id}")
	public ExApi deleteData(@PathVariable Long id) {
		
		return exapiService.deleteData(id);
	}
	
	
}
