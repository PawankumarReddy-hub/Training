package com.org.day3;
abstract class Car
{
	abstract void accelerate();
	abstract void horn();
	public void wheels()
	{
		System.out.println("Car has four wheels");
	}
	
}
class Honda extends Car
{

	@Override
	void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("Honda is accelerating......");
	}

	@Override
	void horn() {
		// TODO Auto-generated method stub
		System.out.println("Horn sound.......");
	}
	
}

class Lamborgini extends Car
{

	@Override
	void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("Lamborgini is accelerating......");
	}

	@Override
	void horn() {
		// TODO Auto-generated method stub
		System.out.println("Lamborgini's horn sound......");
	}
	
}
public abstract class abstr {

	public static void main(String[] args) 
	{
		Honda h=new Honda();
		Lamborgini lam=new Lamborgini();
		h.accelerate();
		h.horn();
		h.wheels();
		lam.accelerate();
		lam.horn();
		lam.wheels();

	}

}
