package com.ps.webservice.data.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import com.ps.webservice.data.Patient;
import com.ps.webservice.data.PatientRetrievalRepository;



public class PatientDataMapper {

@Autowired
private PatientRetrievalRepository repository;

	public List<Patient> mappedPatientInformation() {
		List<Patient> listOfPatients = new ArrayList<>();
		Patient patient =  new Patient();
		if(repository!= null && !repository.findAll().isEmpty()) {
			for(Patient mapPat : repository.findAll()) {
				patient.setAge(mapPat.getAge());
				patient.setDateOfBirth(mapPat.getDateOfBirth());
				patient.setFirstName(mapPat.getFirstName());
				patient.setLastName(mapPat.getLastName());
				patient.setHealthInsurance(mapPat.getHealthInsurance());
				patient.setHealthRecords(mapPat.getHealthRecords());
				listOfPatients.add(patient);
			}
			
		}
		return listOfPatients;
	}
	
}
