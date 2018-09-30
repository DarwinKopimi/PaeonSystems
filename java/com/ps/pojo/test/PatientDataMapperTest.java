package com.ps.pojo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import com.ps.webservice.data.mapper.PatientDataMapper;

class PatientDataMapperTest {
	PatientDataMapper pd = new PatientDataMapper();

	@Ignore
	void testGetSpecificPatients() {
		fail("Not yet implemented");
	}
	@Ignore
	void testCreateSpecificPatients() {
		fail("Not yet implemented");
	}
	@Ignore
	void testUpdateSpecificPatients() {
		fail("Not yet implemented");
	}
	@Test
	void testGetAllPatients() {
		assertNotNull(pd);
	}
	

}
