package com.example.educ.entity;
import java.time.Instant;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "school")
public class School {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Long id; 
	
	@Column(name="name")
	private String name;
	
	@Column(name="address_1")
	private String address1;
	
	@Column(name="created_at")
	private Instant createdAt;
	
	public School(){}
	
    public School(Long id,String name,String address1){
		this.id=id;
		this.name=name;
		this.address1=address1;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return this.id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	
	public String getAddress1() {
		return this.address1;
	}
	
	public Instant getCreatedAt() {
		return this.createdAt;
	}
	public void setCreatedAt(Instant createdAt) {
		this.createdAt=createdAt;
	}
}