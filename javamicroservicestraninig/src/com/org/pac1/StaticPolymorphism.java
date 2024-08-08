package com.org.pac1;

class Sp
{
	
	
}

public class StaticPolymorphism {
	int num1;
	int num2;
	int num3;
	int num4;
	
	public StaticPolymorphism(int num1,int num2,int num3,int num4)
	{
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
		this.num4=num4;
	}
	

	public StaticPolymorphism() {
		// TODO Auto-generated constructor stub
	}


	public int sum(int x,int y)
	{
		return x+y;
	}
	
	public int sum(int x,int y,int z)
	{
		return x+y+z;
	}
	public int sum(int x,int y,int z,int a)
	{
		return x+y+z+a;
	}
	public static void main(String[] args)
	{
		StaticPolymorphism s=new StaticPolymorphism();
		System.out.println(s.sum(10,20));
		System.out.println(s.sum(10,30,45));
		System.out.println(s.sum(10,20,30,45));
		
	}

}
