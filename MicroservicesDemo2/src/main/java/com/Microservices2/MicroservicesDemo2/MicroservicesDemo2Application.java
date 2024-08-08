package com.Microservices2.MicroservicesDemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroservicesDemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesDemo2Application.class, args);
	}

}
