//package com.example.educ.service;
//
//import java.time.Instant;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.educ.entity.School;
//import com.example.educ.repository.SchoolRepository;
//
//@Service
//public class SchoolService {
//	
//	@Autowired
//	private SchoolRepository schoolRepository;
//	
//	
//	public School createSchool(final School school) {
//		///school.setCreatedAt(Instant.now());
//		return this.schoolRepository.save(school);
//	}
//	
//	public List<School> retrieveSchool() {
//		return this.schoolRepository.findAll();
//	}
//
//	public School postalldata() {
//		//List<School>getalldata=
//		return null;
//	}
//
//}
