package com.ps.webservice.data;

import java.lang.System.Logger;
import java.sql.*;

import org.springframework.stereotype.Component;

@Component
public class JDPCSqlLiteConnection {
	Connection connect = null;
	private final String urlConnection = "jdbc:sqlite:resources:paeonsystems.db";
	
	public Connection getDatabaseConnection() {
		try {
			if(!isRetryFailed(connect)) {
			connect = DriverManager.getConnection(urlConnection);
			}
			}
		catch(Exception e) {
		System.out.println(e.getCause().getClass()+ "" + e.getMessage());
		}
		return connect;
	}
	private boolean isRetryFailed(Connection connect) throws Exception {
		boolean isTimedOut = true;
		int timeOut = DriverManager.getLoginTimeout();
		if( connect == null || timeOut > 0) {
			connect = DriverManager.getConnection(urlConnection);
			isTimedOut = false;
		}
		
		return isTimedOut;
		
	}
	
	
}
