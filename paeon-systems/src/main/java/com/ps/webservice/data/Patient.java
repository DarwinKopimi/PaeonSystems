package com.ps.webservice.data;

import java.util.List;



public class Patient implements UserStrategy {
	
	private String Id;
	private String firstName;
	private String lastName;
	private String DateOfBirth;
	private int age;
	private List<HealthRecord> healthRecords;
	private String HealthInsurance;
	private String userName;
	private String password;
	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getDateOfBirth() {
		return DateOfBirth;
	}


	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public List<HealthRecord> getHealthRecords() {
		return healthRecords;
	}


	public void setHealthRecords(List<HealthRecord> healthRecords) {
		this.healthRecords = healthRecords;
	}


	public String getHealthInsurance() {
		return HealthInsurance;
	}


	public void setHealthInsurance(String healthInsurance) {
		HealthInsurance = healthInsurance;
	}


	
	

	public void login(String userName, String password) {
		// TODO Auto-generated method stub
		
	}

}
