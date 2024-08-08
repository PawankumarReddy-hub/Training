package com.org.day4;
class TL
{
	int PID;
	String name;
	int emid;
	public TL(int pID, String name, int emid) {
		super();
		PID = pID;
		this.name = name;
		this.emid = emid;
	}
	void display()
	{
		System.out.println("Team is working");
	}
}
class Team extends TL
{
	String Tname;
	String Pname;
	int numberOfDevelopers;
	public Team(int pID, String name, int emid, String tname, String pname, int numberOfDevelopers) {
		super(pID, name, emid);
		Tname = tname;
		Pname = pname;
		this.numberOfDevelopers = numberOfDevelopers;
	}
	@Override
	void display()
	{
		System.out.println("We are done");
	}
}
public class SingleInheritance {
	public static void main(String[] args)
	{
		Team tm=new Team(256,"pawan",248298,"rohan","citiBank",50);
		System.out.println("PID: "+tm.PID+",Name: "+tm.name+",TeamName: "+tm.Tname+",ProjectName: "+tm.Pname+",NoOfDevelopers: "+tm.numberOfDevelopers);
		tm.display();
	}
}
