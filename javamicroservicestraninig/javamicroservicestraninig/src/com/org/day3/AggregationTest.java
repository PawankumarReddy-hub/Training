package com.org.day3;

class Employe
{
	String name;
	int id;
	String dept;
	public Employe(String name, int id, String dept) {
		super();
		this.name = name;
		this.id = id;
		this.dept = dept;
	}
}

class Department
{
	String dName;
	String organisationName;
}

class Organisation
{
	String officeName;
    String dep;
}
public class AggregationTest {
	
	public static void main(String[] args)
	{
		Employe e=new Employe("pawan",12,"eee");
		System.out.println(e.name+" "+e.id+" "+e.dept);
	}

}
