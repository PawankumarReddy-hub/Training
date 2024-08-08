package com.example.StudentConsumerService;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="ProducerService")
public interface BookRestConsumer {
	@GetMapping("/book/book")
	public String getBook();
	
	@GetMapping("/book/{id}")
	public Book getById(@PathVariable int id);
	
	@GetMapping("/book/all")
	public List<Book> getBooks();
	
}
