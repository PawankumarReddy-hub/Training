package com.example.ProducerService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
	@Autowired
	Environment env;
	
	@GetMapping("/book")
	public String getBook() {
		return env.getProperty("local.server.port");
	}
	
	@GetMapping("/{id}")
	public Book getById(@PathVariable int id)
	{
		return new Book(100,"venky",50000);
	}
	
	@GetMapping("/all")
	public List<Book> getBooks()
	{
		ArrayList<Book> list=new ArrayList<Book>();
		list.add(new Book(101,"pawan",1000000)) ;
		list.add(new  Book(102,"wings of fire",1000));
		list.add(new Book(103,"stay hungry and stay foolish",10000));
		
		return list;
		
	}
	

}
