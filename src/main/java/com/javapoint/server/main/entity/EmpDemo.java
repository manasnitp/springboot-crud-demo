package com.javapoint.server.main.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class EmpDemo {

	@Id
	@GeneratedValue
	private int id;
	
	@NotBlank(message = "Name cannot will empty")
	private String name;
	
	@NotBlank(message = "Email cannot will empty")
	private String email;
	
	@NotBlank(message = "Mobile Number is compulsory")
	private String mobileNo;
	
	@NotBlank(message = "DOB**")
	private String dob;
	
	public EmpDemo() {
		
	}

	public int getId() {
		return id;
	}

	public EmpDemo(int id, String name, String email, String mobileNo, String dob) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobileNo = mobileNo;
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
