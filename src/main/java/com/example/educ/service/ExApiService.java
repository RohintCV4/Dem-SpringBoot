package com.example.educ.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
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
	private final String url="https://666924352e964a6dfed3f343.mockapi.io/userapi/v1";
	
	public List<ExApi> getData(){
		ResponseEntity<ExApi[]>responseEntity=restTemplate.getForEntity(url, ExApi[].class);
		return Arrays.asList(responseEntity.getBody());
	}
	
	public List<ExApi> postData() {
		List<ExApi> getAllData=getData();
		exapiRepository.saveAll(getAllData);
		return getAllData;
//		this.exapiRepository.saveAll(getData());
	}
	
//	public ExApi createDatas(ExApi api) {
//		return this.exapiRepository.save(api);
//	}
	public ExApi createData(ExApi exapi){
		ResponseEntity<ExApi>responseEntity=restTemplate.postForEntity(url, exapi, ExApi.class);
		exapiRepository.save(exapi);
		return exapi;
	}
	
	
	public ExApi updateData(Long id,ExApi exapi) {
		String link=url+"/"+id;
		ResponseEntity<ExApi> responseEntity=restTemplate.exchange(link, HttpMethod.PUT,new HttpEntity<>(exapi),ExApi.class);
		if(responseEntity.getStatusCode()==HttpStatus.OK) {
			ExApi updatedUser=responseEntity.getBody();
			return exapiRepository.save(updatedUser);
		}
		else {
			throw new RuntimeException("Error Occured");
		}
	}

	public ExApi deleteData(Long id) {
		String link=url+"/"+id;
		ResponseEntity<ExApi> responseEntity=restTemplate.exchange(link, HttpMethod.DELETE,HttpEntity.EMPTY,ExApi.class);
		//boolean exists=exapiRepository.existsById(id);
		if(responseEntity.getStatusCode()==HttpStatus.OK) {
			ExApi deleteUser=responseEntity.getBody();
			this.exapiRepository.delete(deleteUser);
		}
		
		else {
			throw new RuntimeException("Error Occured");
		}
		return null;
	}
}
