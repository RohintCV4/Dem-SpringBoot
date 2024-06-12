//package com.example.educ.entity;
//
//import java.time.Instant;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name = "school")
//public class School {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column
//	private Long id; 
//	
//	@Column
//	private String name;
//	
//	@Column
//	private String email;
//	
//	@Column
//	private String gender;
//	
//	@Column
//	private String status;
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getGender() {
//		return gender;
//	}
//
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
//
//	public String getStatus() {
//		return status;
//	}
//
//	public void setStatus(String status) {
//		this.status = status;
//	}
//
////	public void setCreatedAt(Instant now) {
////		// TODO Auto-generated method stub
////		
////	}
//	
//	
////	public School(){}
////	
////    public School(Long id,String name,String address1){
////		this.id=id;
////		this.name=name;
////		this.address1=address1;
////	}
//	
//	
//}