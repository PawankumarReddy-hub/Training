 package com.cts.EBanking;

 import java.text.DecimalFormat;
 import java.util.List;

 public abstract class BankAccount {
     private static int customerId=100;
     private static String name="Joe";
     private static double balance=10000;
     private List<String> accounts;

     public BankAccount(int customerId, String name, double balance, List<String> accounts) {
         this.customerId = customerId;
         this.name = name;
         this.balance = balance;
         this.accounts = accounts;
     }

     public BankAccount() {
		// TODO Auto-generated constructor stub
	}

	public static int getCustomerId() {
         return customerId;
     }

     public void setCustomerId(int customerId) {
         this.customerId = customerId;
     }

     public static String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public double getBalance() {
         return balance;
     }

     public void setBalance(double balance) {
         this.balance = balance;
     }

     public List<String> getAccounts() {
         return accounts;
     }

     public void setAccounts(List<String> accounts) {
         this.accounts = accounts;
     }

     public static double doDeposit(double amount) {
         balance += amount;
         DecimalFormat df = new DecimalFormat("#.##");
         return Double.parseDouble(df.format(balance));
     }

     public static double doWithdraw(double amount) {
         balance -= amount;
         DecimalFormat df = new DecimalFormat("#.##");
         return Double.parseDouble(df.format(balance));
     }

     public abstract double calculateFixedAccount(double amount, int months);

     public abstract double calculateRecurringAccount(double amount, int months);
 }
