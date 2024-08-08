package com.org.day5;

import java.util.*;

public class Player {
	String name;
	int id;
	String skill;
	String country;
	

	public Player(String name, int id, String skill, String country) {
		super();
		this.name = name;
		this.id = id;
		this.skill = skill;
		this.country = country;
	}
	
	


	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getSkill() {
		return skill;
	}




	public void setSkill(String skill) {
		this.skill = skill;
	}




	public String getCountry() {
		return country;
	}




	public void setCountry(String country) {
		this.country = country;
	}
	
	




	@Override
	public String toString() {
		return "Player [name=" + name + ", id=" + id + ", skill=" + skill + ", country=" + country + "]";
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Enter how many players you want to add -");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Player[] arr=new Player[n];
//		Player pl=new Player("Pawan",56,"Batsman","India");
//		System.out.println(pl.toString());
		for(int i=0;i<n;i++)
		{
			sc.nextLine();
			System.out.println("Enter the Player name: ");
			String name=sc.nextLine();
			System.out.println("Enter the Player id: ");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Player skill: ");
			String skill=sc.nextLine();
			System.out.println("Enter the Player Country: ");
			String country=sc.nextLine();
			arr[i]=new Player(name,id,skill,country);
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("\n");
			System.out.println(arr[i].getName());
			System.out.println(arr[i].getId());
			System.out.println(arr[i].getSkill());
			System.out.println(arr[i].getCountry());
			System.out.println("\n");

			
		}
	}
}
