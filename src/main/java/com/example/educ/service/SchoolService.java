package com.example.educ.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.educ.entity.School;
import com.example.educ.repository.SchoolRepository;
import com.fasterxml.jackson.databind.JsonNode;

@Service
public class SchoolService {

	@Autowired
	private SchoolRepository schoolRepository;
	@Autowired
	private RestTemplate restTemplate;

	public String insertapiValue(Long page) {
		String url = "https://reqres.in/api/users?page=" + page;
		JsonNode jsonNode = restTemplate.getForObject(url, JsonNode.class).get("data");
		List<School> apiData = new ArrayList<>();
		String response;
		if (!jsonNode.isEmpty()) {
			for (JsonNode jsonData : jsonNode) {
				apiData.add(setValue(jsonData));

			}
			this.schoolRepository.saveAll(apiData);
			response = "Inserted the Data";

		} else {
			response = "Can't inserted the data";
		}
		return response;
	}

	public School setValue(JsonNode jsonNode) {
		School api = new School();
		api.setId(jsonNode.findValue("Id").asLong());
		api.setFirst_name(jsonNode.findValue("first_name").asText());
		api.setLast_name(jsonNode.findValue("last_name").asText());
		api.setEmail(jsonNode.findValue("email").asText());
		api.setAvatar(jsonNode.findValue("avatar").asText());
		return api;

	}

}
