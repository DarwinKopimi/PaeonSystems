package com.ps.webservice.data.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ps.webservice.data.DataRetrievalPerRequest;
import com.ps.webservice.data.Doctor;

public class DoctorDataMapper {

	//@Autowired
	DataRetrievalPerRequest data = new DataRetrievalPerRequest();

	public List<Doctor> mappedDoctorInformation() throws SQLException {
		ResultSet retrievedDataFromDatabase;
		List<Doctor> listOfDoctors = new ArrayList<>();
		if (data != null) {
			retrievedDataFromDatabase = data.retrieveAllDataBasedOnRequest("Doctors");
			while (retrievedDataFromDatabase.next()) {
				Doctor Doctor = new Doctor();
				String pid = retrievedDataFromDatabase.getString("PID");
				String firstName = retrievedDataFromDatabase.getString("FIRST_NAME");
				String lastName = retrievedDataFromDatabase.getString("LAST_NAME");
				int age = retrievedDataFromDatabase.getInt("AGE");
				createMappedObject(pid, firstName, lastName, age, Doctor);
				listOfDoctors.add(Doctor);
				
			}
			
		}
		if (listOfDoctors.isEmpty()) {
			testClient(listOfDoctors);
		}
		return listOfDoctors;
	}

	public Doctor retrieveDoctorRecord(String requestInfo, String requestUserId) throws SQLException {
		ResultSet retrievedDataFromDatabase;
		Doctor Doctor = new Doctor();
		retrievedDataFromDatabase = data.retrieveSpecificUser(requestInfo, requestUserId);
		while (retrievedDataFromDatabase.next()) {
			String pid = retrievedDataFromDatabase.getString("PID");
			String firstName = retrievedDataFromDatabase.getString("FIRST_NAME");
			String lastName = retrievedDataFromDatabase.getString("LAST_NAME");
			int age = retrievedDataFromDatabase.getInt("AGE");

			createMappedObject(pid, firstName, lastName, age, Doctor);
		}

		return Doctor;
	}

	private void testClient(List<Doctor> listOfDoctors) {
		Doctor Doctor = new Doctor();
		Doctor.setAge(51);
		Doctor.setFirstName("Robert");
		Doctor.setLastName("Block");
		listOfDoctors.add(Doctor);
	}

	private void createMappedObject(String pid, String firstName, String lastName, int age, Doctor Doctor) {
		Doctor.setFirstName(firstName);
		Doctor.setLastName(lastName);
		Doctor.setAge(age);
	}

}