package com.org.day4;

class SBI
{
	double minBalance=3000;
	
	void display() {
		System.out.println("Minimum Balance set by SBI Bank is: "+minBalance);
	}
}

class HDFC extends SBI
{
	double rateOfInterest=2.5;
	
	void interestOfHdfc()
	{
		System.out.println("Hdfc Rate of Interest is: "+rateOfInterest);
	}
}

class ICICI extends SBI
{
double rateOfInterest=5.0;
	
	void interestOfICICI()
	{
		System.out.println("ICICI Rate of Interest is: "+rateOfInterest);
	}
}

class Union extends SBI
{
double rateOfInterest=10.0;
	
	void interestOfUnion()
	{
		System.out.println("Union Rate of Interest is: "+rateOfInterest);
	}
}

public class HierachalInheritance 
{
	public static void main(String[] args) 
	{
		HDFC hd=new HDFC();
		hd.interestOfHdfc();
		hd.display();
		ICICI ic=new ICICI();
		ic.interestOfICICI();
		ic.display();
		Union u=new Union();
		u.interestOfUnion();
		u.display();
		

	}
}
