package com.ps.webservice.data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;

public class DataRetrievalPerRequest {
	
	@Autowired
	JDPCSqlLiteConnection connect;
	@Autowired
	Statement state;
	
	public ResultSet retrieveAllDataBasedOnRequest(String requestInfo) throws SQLException {
		Connection dataConnection = connect.getDatabaseConnection();
		dataConnection.setAutoCommit(false);
		state = dataConnection.createStatement();
		ResultSet gatheredData = state.executeQuery("SELECT * FROM "+ requestInfo);
		return gatheredData;
	}
}
