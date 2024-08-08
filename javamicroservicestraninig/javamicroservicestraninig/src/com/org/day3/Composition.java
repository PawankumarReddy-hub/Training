package com.org.day3;

class Books
{
	private String name;
	private String author;
	private String isbn;
	
	public Books(String name, String author, String isbn) {
		super();
		this.name = name;
		this.author = author;
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public void displayBookDetails()
	{
		System.out.println("Title: "+name);
		System.out.println("Author Name: "+author);
		System.out.println("ISBN Number: "+isbn);
		System.out.println("\n");
	}
}

class Library
{
	private Books[] books;
	private int bookCapacity;
	public Library(int capacity)
	{
		books=new Books[capacity];
		bookCapacity=0;
	}
	
	public boolean add(Books book)
	{
		if(bookCapacity<books.length) 
		{
			books[bookCapacity++]=book;
			return true;
		}
		else
		{
			System.out.println("Library is Full.No Space left for Books\n");
			return false;
		}	
	}
	
	public void display()
	{
		System.out.println("Library Books:\n");
		for(int i=0;i<bookCapacity;i++)
		{
			System.out.println("Book: "+(i+1)+"\n");
			books[i].displayBookDetails();
		}
	}
}
public class Composition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library myLibrary=new Library(3);
		
		Books book1=new Books("The Catcher in the Rye"," J.D.Salinger"," 654-5448484");
		Books book2=new Books("To Kill a MockingBird"," Harper Lee"," 492-9848974");
		Books book3=new Books("1984"," Gerorge orwell"," 419-94984944");
		Books book4=new Books("Pride and Prejudice"," Jane Austen"," 496-189549846");
		
		myLibrary.add(book1);
		myLibrary.add(book2);
		myLibrary.add(book3);
		
		myLibrary.add(book4);
		
		myLibrary.display();
		
	}

}
