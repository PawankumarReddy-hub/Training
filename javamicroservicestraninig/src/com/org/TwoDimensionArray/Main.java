package com.org.TwoDimensionArray;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		ProductManager productManager=new ProductManager(5);
		CartManager cartManager=new CartManager(3,5);
		DeliveryManager deliveryManager= new DeliveryManager();
		
		productManager.addProduct("Laptop", 1000);
		productManager.addProduct("Phone", 25000);
		productManager.addProduct("Tablet", 100);
		
		boolean exit=false;
		
		while(!exit)
		{
			System.out.println("\n1.Display Products \n2.Add to Cart \3.View Cart \n4.Purchase \n5.Deliver \n6.Exit");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			default:
				System.out.println("Invalid Choice.Enter the Correct Choice.");
			}
		}
	}

}
