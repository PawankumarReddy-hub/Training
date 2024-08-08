package com.org.md.SpringbootApiMongoDbApplication;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class BookController 
{
	@Autowired
	private BookService repo;
	
	@PostMapping("/addBook")
	public String saveBook(@RequestBody Book book)
	{
		repo.CreateBook(book);
		return"Added Successfully";
	}
	
	@GetMapping("/findAllBooks")
	public List<Book> getBooks()
	{
		return repo.ShowAllBooks();
	}
	@GetMapping("/findById/{id}")
	public Optional<Book> getBookById(@PathVariable int id)
	{
		return repo.ShowBookById(id);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable int id)
	{
		repo.deleteById(id);
		return "Deleted Successfully";
	}
	
	@PutMapping("/updateBook/{id}")
	public String updateBook(@PathVariable int id,@RequestBody Book book)
	{
		repo.UpdateBook(id, book);
		return "Book Updated Successfully";
	}
}
