package com.example.educ.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ExternalApi {

	@Id
	@Column
	private Long id;
	@Column
	private String first_name;
	@Column
	private String last_name;
	@Column
	private String email;
	@Column
	private String avatar;

//	@Id
//	@Column
//	private Long id;
//	@Column
//	private String name;
//	@Column
//	private String email;
//	@Column
//	private String gender;
//	@Column
//	private String status;

}
