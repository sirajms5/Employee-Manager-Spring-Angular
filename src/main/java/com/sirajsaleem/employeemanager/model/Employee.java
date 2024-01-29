package com.sirajsaleem.employeemanager.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private long id;
	private String name;
	private String email;
	private String jobTitle;
	private String phoneNumber;
	private String imageUrl;
	@Column(nullable = false, updatable = false)
	private String employeeCode;
	
	public Employee() {}
	
	public Employee(long id, String name, String email, String jobTitle, String phoneNumber, String imageUrl,
			String employeeCode) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.jobTitle = jobTitle;
		this.phoneNumber = phoneNumber;
		this.imageUrl = imageUrl;
		this.employeeCode = employeeCode;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	
}
