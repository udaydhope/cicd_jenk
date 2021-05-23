package com.jenkins.TestJenkins;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class TestJenkinsApplication {

	public static Logger logger = LoggerFactory.getLogger(TestJenkinsApplication.class);

	@PostConstruct
	public void init(){
		logger.info("Application Startred");
		logger.info("Application Startred New");
	}

	public static void main(String[] args) {
		logger.info("Application Executed........");
		SpringApplication.run(TestJenkinsApplication.class, args);
	}

}
