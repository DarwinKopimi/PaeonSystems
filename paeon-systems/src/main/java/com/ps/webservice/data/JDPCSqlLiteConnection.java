package com.ps.webservice.data;

import java.lang.System.Logger;
import java.sql.*;

import org.springframework.stereotype.Component;

@Component
public class JDPCSqlLiteConnection {
	Connection connect = null;
	
	//"jdbc:mysql:https://s3.amazonaws.com/paeonsystemdb/paeonsystems.db";
	//private final String urlConnection = "jdbc:mysql://paeonsystemsdb.c7vhptgacbd2.us-east-1.rds.amazonaws.com:3306/paeonsystemsdb?user=psdb&password=paeonsystems12345";
	//jdbc:awsathena://AwsRegion=[Region];UID=[AccessKey];PWD=		[SecretKey];S3OutputLocation=[Output];[Property1]=[Value1];		[Property2]=[Value2]
	
	public Connection getDatabaseConnection() {
		final String urlHost = "//paeonsystemsdb.c7vhptgacbd2.us-east-1.rds.amazonaws.com";
		final String userName = "psdb";
		final String password = "cookie92"; 
		final String database = "paeonsystemsdb";
		try { 
			if(!isRetryFailed(connect)) {
			connect = DriverManager.getConnection("jdbc:mysql:"+urlHost+":3306/"+database+"?user="+userName+"&password="+password
					+"?characterEncoding=utf8");
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
			//connect = DriverManager.getConnection(urlConnection);
			isTimedOut = false;
		}
		
		return isTimedOut;
		
	}
	
	
}
