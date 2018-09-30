package com.ps.webservice.data;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PatientRetrievalRepository extends MongoRepository<Patient, String> {
	public Patient findByLastName(String lastname);
	
	
}
