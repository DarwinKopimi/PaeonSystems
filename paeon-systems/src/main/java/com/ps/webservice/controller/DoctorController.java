package com.ps.webservice.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ps.webservice.data.Doctor;
import com.ps.webservice.data.mapper.DoctorDataMapper;



@RestController
public class DoctorController {
	
	
	DoctorDataMapper dp = new DoctorDataMapper();
	@RequestMapping(value="/users",method = RequestMethod.GET)
	    public List<Doctor> allDoctor() {
	     List<Doctor> Doctors = null;
		try {
			Doctors = dp.mappedDoctorInformation();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     if(Doctors ==null || Doctors.isEmpty()) {
	    	 System.out.println(HttpStatus.BAD_REQUEST + "Hit Endpoint"); ;
	     }
		 return Doctors;
	    }

	 @RequestMapping(value="/hello", method = RequestMethod.GET)
	 public String helloWorld() {
	 	  return  "Hello World";
	 }
	 
	 @RequestMapping(value="/users/{id}/{name}",method = RequestMethod.GET)
	    public Doctor findSpecifcDoctor(@PathVariable String id, @PathVariable String name) {
		 Doctor Doctor = null;
		 try {
			 Doctor = dp.retrieveDoctorRecord( id, name);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 return Doctor;
		    }
	 
	 @RequestMapping(value="/Doctor/add",method = RequestMethod.GET)
	    public Doctor addDoctor() {
		 
		 
		 return null;
	 }
}
