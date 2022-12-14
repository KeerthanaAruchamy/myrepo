package com.process.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsappTestApplication {

	
	public static Logger logger=LoggerFactory.getLogger(JenkinsappTestApplication.class);
	public static void main(String[] args) {
		logger.info("App executing....");
		SpringApplication.run(JenkinsappTestApplication.class, args);
	}

}
