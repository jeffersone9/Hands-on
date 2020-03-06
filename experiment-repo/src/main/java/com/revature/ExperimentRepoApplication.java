package com.revature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ExperimentRepoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExperimentRepoApplication.class, args);
	}

}
