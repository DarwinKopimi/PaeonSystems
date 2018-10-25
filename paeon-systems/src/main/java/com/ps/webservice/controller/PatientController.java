package com.ps.webservice.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ps.webservice.data.Patient;
import com.ps.webservice.data.mapper.PatientDataMapper;



@RestController
public class PatientController {
	
	
	PatientDataMapper dp = new PatientDataMapper();
	@RequestMapping(value="/users",method = RequestMethod.GET)
	    public List<Patient> allPatient() {
	     List<Patient> patients = null;
		try {
			patients = dp.mappedPatientInformation();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     if(patients ==null || patients.isEmpty()) {
	    	 System.out.println(HttpStatus.BAD_REQUEST + "Hit Endpoint"); ;
	     }
		 return patients;
	    }

	 @RequestMapping(value="/hello", method = RequestMethod.GET)
	 public String helloWorld() {
	 	  return  "Hello World";
	 }
	 
	 @RequestMapping(value="/users",method = RequestMethod.GET)
	    public List<Patient> findSpecifcPatient() {
	     List<Patient> patients = null;
		try {
			patients = dp.mappedPatientInformation();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     if(patients ==null || patients.isEmpty()) {
	    	 System.out.println(HttpStatus.BAD_REQUEST + "Hit Endpoint"); ;
	     }
		 return patients;
	    }
}
