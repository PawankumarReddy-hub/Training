package com.org.day4;
class SBIBank
{
	double minBalance=3000;
	
	void display() {
		System.out.println("Minimum Balance set by SBI Bank is: "+minBalance);
	}
}

class HDFCBank extends SBIBank
{
	double rateOfInterest=2.5;
	
	void interestOfHdfc()
	{
		System.out.println("Hdfc Rate of Interest is: "+rateOfInterest);
	}
}

class ICICIBank extends HDFCBank
{
double rateOfInterest=5.0;
	
	void interestOfICICI()
	{
		System.out.println("ICICI Rate of Interest is: "+rateOfInterest);
	}
}

class UnionBank extends ICICIBank
{
double rateOfInterest=10.0;
	
	void interestOfUnion()
	{
		System.out.println("Union Rate of Interest is: "+rateOfInterest);
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) 
	{
		UnionBank ub=new UnionBank();
		ub.interestOfUnion();
		ub.interestOfICICI();
		ub.interestOfHdfc();
		ub.display();
	}
}
