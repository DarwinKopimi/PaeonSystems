package com.ps.webservice.data;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Doctor implements UserStrategy {
	private String firstName;
	private String lastName;
	private String DateOfBirth;
	private int age;
	private List<Patient> patients;
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


	public List<Patient> getPatientRecords() {
		return patients;
	}


	public void setPatientRecords(List<Patient> patients) {
		this.patients = patients;
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
