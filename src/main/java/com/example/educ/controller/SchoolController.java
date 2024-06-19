package com.example.educ.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.educ.service.SchoolService;

@RestController
@RequestMapping("/api/v1")
public class SchoolController {
	
	private final SchoolService schoolService;
	
	public SchoolController(SchoolService schoolService){
		this.schoolService = schoolService;
	} 
	
	@PostMapping("/schapi/{page}")
	public String createSchool(@PathVariable Long page) {
		return this.schoolService.insertapiValue(page);
	}
	
//	@PostMapping("/api")
//	public School postalldata() {
//		return this.schoolService.postalldata();
//	}
	
//	@GetMapping("/")
//	public List<School> retrieveSchool() {
//		return this.schoolService.retrieveSchool();
//	}
	
//	@GetMapping("/api/calling")
//	public ResponseEntity<JsonNode> apiCalling(){
//	    String uri="https://reqres.in/api/users?page=2";
//	    RestTemplate rest=new RestTemplate();
//	    ResponseEntity<JsonNode> response = rest.getForEntity(uri, JsonNode.class);
//	    List<Object> result = new ArrayList<>();
//	    ArrayNode arrayNode = (ArrayNode) response.getBody().get("data");
//        if (arrayNode != null) {
//            for (JsonNode node : arrayNode) {
//                result.add(node);
//            }
//        }
//	    return response;
//	
//	
//	
//
//}
}
