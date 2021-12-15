package com.contact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceContactServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceContactServiceApplication.class, args);
		
		
	}

}
