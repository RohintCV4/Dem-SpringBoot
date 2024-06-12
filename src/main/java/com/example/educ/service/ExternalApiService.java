package com.example.educ.service;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.educ.entity.ExApi;
import com.example.educ.entity.ExternalApi;
import com.example.educ.repository.ExternalApiRepository;
import com.fasterxml.jackson.databind.JsonNode;
//import com.example.educ.repository.SchoolRepository;

@Service
public class ExternalApiService {

	@Autowired
	ExternalApiRepository externalapiRepository;
	
	//@Autowired
	//RestTemplate restTemplate;
	
//    private final String url = "https://gorest.co.in/public/v2/users";
//
//	public void postalldata() {
////		List<ExternalApi> getallData=getUsers();
////		if(!getallData.isEmpty()) {
////	    externalapiRepository.saveAll(getallData);
////		}
//		List<ExternalApi> getAllData=getUsers();
//		externalapiRepository.saveAll(getAllData);
//	}
//
//	public List<ExternalApi> getUsers() {
//		ResponseEntity<ExternalApi[]>responseEntity=restTemplate.getForEntity(url, ExternalApi[].class);
//		return Arrays.asList(responseEntity.getBody());
//	}
	private RestTemplate restTemplate =new RestTemplate();
	public String insertApiValue(final Long page){
		//RestTemplate restTemplate =new RestTemplate();
		String url="https://reqres.in/api/users?page="+page;
		String response;
		final JsonNode jsonNode=restTemplate.getForObject(url, JsonNode.class).get("data");
		final List<ExternalApi> apiData=new LinkedList<>();
		if(!jsonNode.isEmpty()) {
			System.out.println(jsonNode.size());
			for(final JsonNode jsonData:jsonNode) {
				apiData.add(setValue(jsonData));
			}
			this.externalapiRepository.saveAll(apiData);
			response="successfull insert the data";
		}
		else {
			response="not data found in api";
		}
		return response;
	}

	public String updateValues() {
		String url="https://reqres.in/api/users/2";
		String response;
		JsonNode jsonNode=restTemplate.getForObject(url,JsonNode.class).get("data");
		if(!jsonNode.isEmpty()) {
			this.externalapiRepository.save(setValue(jsonNode));
			response="update success";
		}
		else {
			response="no data found";
		}
		return response;
	}
	public ExternalApi setValue(JsonNode jsonNode) {
		ExternalApi api=new ExternalApi();
		api.setId(jsonNode.findValue("id").asLong());
		api.setFirst_name(jsonNode.findValue("first_name").asText());
		api.setLast_name(jsonNode.findValue("last_name").asText());
		api.setEmail(jsonNode.findValue("email").asText());
		api.setAvatar(jsonNode.findValue("avatar").asText());
		return api;
	}
}