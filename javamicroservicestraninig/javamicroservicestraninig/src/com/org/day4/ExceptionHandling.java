package com.org.day4;

import java.util.Scanner;

class Demo
{
	String name;
	int id;
	public Demo(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	 void add(int x,int y)
	{
		try
		{
			System.out.println(x/y);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	 
	 void display(String nam,int val)
	 {
		 System.out.println(nam+" "+val);
	 }
	
}

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Demo d=new Demo("venkatesh",334);
		d.add(5, 0);
		d.display(sc.nextLine(), sc.nextInt());

	}

}
