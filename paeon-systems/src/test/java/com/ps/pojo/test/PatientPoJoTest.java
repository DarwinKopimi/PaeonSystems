package com.ps.pojo.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.ps.webservice.data.HealthRecord;
import com.ps.webservice.data.InsuranceProviders;
import com.ps.webservice.data.Patient;

public class PatientPoJoTest {
	Patient patient = new Patient();
	
	
	@Test
	public void testGetAndSetHealthRecords() {
		List<HealthRecord> healthRecords = new ArrayList<>();
		patient.setHealthRecords(healthRecords );
		assertEquals(patient.getHealthRecords(), healthRecords);
	}
	@Test
	public void testGetAndSetDOB() {
		String dateOfBirth = "10091992";
		patient.setDateOfBirth(dateOfBirth );
		assertEquals(patient.getDateOfBirth(), dateOfBirth);
	}
	@Test
	public void testGetAndSetFirstName() {
		patient.setFirstName("Alan" );
		assertEquals(patient.getFirstName(), "Alan");
	}
	@Test
	public void testGetAndSetLastName() {
		patient.setLastName("Alan");
		assertEquals(patient.getLastName(), "Alan");
	}
	@Test
	public void testGetAndSetInsurance() {
		patient.setHealthInsurance(InsuranceProviders.AETNA.toString());
		assertEquals(patient.getHealthInsurance(), InsuranceProviders.AETNA.toString());
	}
	@Test
	public void testGetAndSetAge() {
		patient.setAge(10);
		assertEquals(patient.getAge(), 10);
	}

}
