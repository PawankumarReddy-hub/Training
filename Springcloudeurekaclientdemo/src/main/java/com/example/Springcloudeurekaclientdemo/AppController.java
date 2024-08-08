package com.example.Springcloudeurekaclientdemo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/app")
public class AppController {
	
	@GetMapping(path="/products")
	public Response getProducts()
	{
		Product p1=new Product("Apple iphone",70000);
		Product p2=new Product("Samsung LED TV",80000);
		Product p3=new Product("Hidtrate Water Bottle",5000);
		Product p4=new Product("Apple watch",30000);
		Product p5=new Product("Apple MacBook",170000);
		
		ArrayList<Product> products=new ArrayList<Product>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		
		Response response = new Response(101,"Products Fetched Successfully.",products);
		return response;
	}

}
