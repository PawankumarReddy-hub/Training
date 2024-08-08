package com.org.pac1;

class Utilities
{
	int id;
	String name;
	String city;
	String Company;
	
	private Utilities(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	 Utilities(int id, String name, String city)
	{
		this.id=id;
		this.name=name;
		this.city=city;
	}
	
	public void display()
	{
		System.out.println("Hello world");
	}
	
	public static int add(int x,int y)
	{
		return x+y;
	}
}

public class Demo {

	public static void main(String[] args) {
		
		int result=Utilities.add(56, 54);
		System.out.println(result);
		Utilities ut=new Utilities(56, "dfnnfd", "bfb");
		ut.display();
		
				

	}

}
