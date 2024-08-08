package com.Microservices.MicroservicesDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroservicesDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesDemoApplication.class, args);
	}

}


/*we use @EnableEurekaServer: when we annotate this it will be a central instance where all other services 
will get restricted
@EnableEurekaClient: this will enable service registration and discovery with central eureka server.*/