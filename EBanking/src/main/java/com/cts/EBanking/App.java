package com.cts.EBanking;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// CODE SKELETON - VALIDATION STARTS
		// DO NOT 1CHANGE THIS CODE

		new SkeletonValidator();

		// CODE SKELETON - VALIDATION ENDS

		// Please start your code from here
		//Configuration and Input data read here
		//Refer sample input details
		List<String> accounts = Arrays.asList("CurrentAccount", "RecurringAccount", "FixedAccount");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome Mr/Ms: " + BankAccount.getName());
       System.out.println("Your customer id is :" + BankAccount.getCustomerId());
       
       System.out.println("Please Select Account Type");
       System.out.println("1. Current Account");
       System.out.println("2. Recurring Account");
       System.out.println("3. Fixed Deposit");

		switch (scanner.nextInt()) {

		case 1:
			System.out.println("Select transaction type \n 1.Deposit \n 2.Withdraw");
			int choice = scanner.nextInt();
			if (choice == 1) {
				//Do call deposit
				System.out.println("Enter the amount to be Deposited: ");
				double amt=scanner.nextDouble();
				System.out.println("Your Balance Amount is: "+BankAccount.doDeposit(amt));
			} else if (choice == 2) {
				//Do call Withdraw	
				System.out.println("Enter the amount to WithDraw: ");
				double amt=scanner.nextDouble();
				System.out.println("Your Balance Amount is: "+BankAccount.doWithdraw(amt));

			} else {
				System.out.println("Wrong choice");
			}
			break;
		case 2:
			//Code for recurringAccount
			System.out.println("Enter Monthly Installment: ");
			double am=scanner.nextDouble();
			System.out.println("Enter the tenure in months: ");
			int m=scanner.nextInt();
			SmartBankAccount sba=new SmartBankAccount();
			double res=sba.calculateRecurringAccount(am, m);
			System.out.println("Your Balance after "+m+" months will be "+res);
			break;
		case 3:
			//Code for FD 
			System.out.println("Enter FD Amount: ");
			double amt=scanner.nextDouble();
			System.out.println("Enter the tenure in months: ");
			int m1=scanner.nextInt();
			SmartBankAccount sba1=new SmartBankAccount();
			double res1=sba1.calculateFixedAccount(amt, m1);
			System.out.println("Your Balance after "+m1+" months will be "+res1);
			break;
		default:
			System.out.println("Wrong Choice");

		}

	}
}
