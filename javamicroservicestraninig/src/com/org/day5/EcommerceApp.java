package com.org.day5;

class PaymentException extends Exception
{
	public PaymentException (String message)
	{
		super(message);
	}
}

class PaymentService
{
	public void processPayment(double amount)throws PaymentException
	{
		if(amount<=0)
		{
			throw new PaymentException("Invalid Payment amount.."+amount);
		}
	}
}
public class EcommerceApp {
	public static void main(String[] args)
	{
		PaymentService ps=new PaymentService();
		try {
			ps.processPayment(-100);
		}
		catch(PaymentException e)
		{
			System.out.println("Payment processing failed: "+e.getMessage());
		}
	}

}
