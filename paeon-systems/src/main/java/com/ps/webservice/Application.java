package com.ps.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class Application {
	
	 public static void main(String[] args) {
		 SpringApplication app = new SpringApplication(Application.class);
	        app.run(args);
//SpringApplication.run(Application.class, args);   
	 }

	   
	    
}
