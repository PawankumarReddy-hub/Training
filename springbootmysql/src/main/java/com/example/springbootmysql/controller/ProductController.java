package com.example.springbootmysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootmysql.model.Product;
import com.example.springbootmysql.model.Response;
import com.example.springbootmysql.repository.ProductRepository;

@RestController
@RequestMapping(path="/products")
public class ProductController {
	@Autowired
	ProductRepository repository;
	
	@PostMapping(path="/add")
	public ResponseEntity<Response> addProduct(@RequestParam String name,@RequestParam String brandName,@RequestParam Integer price)
	{
		Product product=new Product(null,name,brandName,price);
		System.out.println("Product: "+product);
		
		try
		{
			repository.save(product);
			Response response=new Response(101,"Product" +name+"Saved Successfully");
			return new ResponseEntity<Response>(response,HttpStatus.OK);
		}
		catch(Exception exception){
			Response response=new Response(701,"Product"+name+"Not Saved Successfully. Exception: "+exception.getMessage());
			return new ResponseEntity<Response>(response,HttpStatus.OK);
		}
	}

}
