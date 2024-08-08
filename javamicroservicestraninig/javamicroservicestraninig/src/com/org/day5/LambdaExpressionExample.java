package com.org.day5;
interface MyName
{
	public void SayMyName();
}
public class LambdaExpressionExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyName person=new MyName() {
			public void SayMyName()
			{
				System.out.println("Himanshu");
			}
		};
		person.SayMyName();
	}

}
