package com.org.day3;
abstract class BankAccount
{
	protected String accountNumber;
	protected double balance;
	public BankAccount(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public String getAccountNumber()
	{
		return accountNumber;
	}
	public double getBalance()
	{
		return balance;
	}
	
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	public abstract void transfer(BankAccount targetAccount,double amount);
	
	public void displayAccountDetails()
	{
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Balance: $"+balance);
	}
}
class Acc extends BankAccount
{

	public Acc(String accountNumber, double balance) {
		super(accountNumber, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transfer(BankAccount targetAccount, double amount) {
		// TODO Auto-generated method stub
		
	}
	
}
public class Abstraction{ 
	
	public static void main(String[] args) 
	{
		Acc a=new Acc("123456796",10000000000.00);
		a.displayAccountDetails();
		

	}

}
