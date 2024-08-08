package com.org.md.SpringbootApiMongoDbApplication;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService 
{
	@Autowired
	private BookRepo bookrepo;
	
	public List<Book> ShowAllBooks()
	{
		return bookrepo.findAll();
	}
	
	public Optional<Book> ShowBookById(int id)
	{
		return bookrepo.findById(id);
	}
	
	public Book UpdateBook(int id,Book book)
	{
		if(bookrepo.existsById(id))
		{
			book.setId(id);
			return bookrepo.save(book);
		}
		return null;
	}
	
	public void CreateBook(Book book)
	{
		bookrepo.insert(book);
	}

	public void deleteById(int id) {
		// TODO Auto-generated method stub
		bookrepo.deleteById(id);
	}
	
	

}
