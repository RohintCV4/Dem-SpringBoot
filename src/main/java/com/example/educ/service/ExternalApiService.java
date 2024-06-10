package com.example.educ.service;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ExternalApiService {

    private final RestTemplate restTemplate;

    public ExternalApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getUsers() {
        String url = "https://gorest.co.in/public/v2/users";
        return restTemplate.getForObject(url, String.class);
    }
}