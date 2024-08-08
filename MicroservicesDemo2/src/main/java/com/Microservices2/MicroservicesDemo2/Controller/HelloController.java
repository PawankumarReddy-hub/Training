package com.Microservices2.MicroservicesDemo2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Microservices2.MicroservicesDemo2.model.HelloService;

@RestController
public class HelloController 
{
	@GetMapping("/showLimit")
	public HelloService retrieveLimit()
	{
		return new HelloService(5000,9999);
	}

}
