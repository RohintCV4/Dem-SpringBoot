package com.example.educ.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.service.annotation.DeleteExchange;

import com.example.educ.entity.School;
import com.example.educ.service.SchoolService;
import com.fasterxml.jackson.databind.JsonNode;

@RestController
@RequestMapping("/api/v1")
public class SchoolController {
	
	private final SchoolService schoolService;
	
	public SchoolController(SchoolService schoolService){
		this.schoolService = schoolService;
	} 
	
	@PostMapping("/")
	public School createSchool(@RequestBody School school) {
		return this.schoolService.createSchool(school);
	}
	
	@GetMapping("/")
	public List<School> retrieveSchool() {
		return this.schoolService.retrieveSchool();
	}
	
	@GetMapping("/api/calling")
	public ResponseEntity<JsonNode> apiCalling(){
	    String uri="https://reqres.in/api/users?page=2";
	    RestTemplate rest=new RestTemplate();
	    ResponseEntity<JsonNode> response = rest.getForEntity(uri, JsonNode.class);
//	    List<Object> result = new ArrayList<>();
//	    ArrayNode arrayNode = (ArrayNode) response.getBody().get("data");
//        if (arrayNode != null) {
//            for (JsonNode node : arrayNode) {
//                result.add(node);
//            }
//        }
	    return response;
	
	
	

}
}
