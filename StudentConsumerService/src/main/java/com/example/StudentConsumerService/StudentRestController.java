package com.example.StudentConsumerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentRestController {
	@Autowired
	private BookRestConsumer consumer;
	
	@GetMapping("/data")
	public String getStudentInfo()
	{
		System.out.println(consumer.getClass().getName());
		return "Accessing from STUDENT-SERVICE ==> "+consumer.getBook();
	}
	
	
	@GetMapping("/allBooks")
	public String getBooksInfo()
	{
		return "Accessing from STUDENT-SERVICE ==> "+consumer.getBooks();
	}
	
	@GetMapping("/getonebook/{id}")
	public String getOneBookForStd(@PathVariable Integer id)
	{
		return "Accessing from STUDENT-SERVICE ==> "+consumer.getById(id);
	}
}
