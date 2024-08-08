package com.org.day5;
class Bicycle
{
	private String model;
	private int weight;

	   public Bicycle(String model, int weight) {
	       this.model = model;
	       this.weight = weight;
	   }

	   public void start() {
	       System.out.println("Go!");
	   }

	   public class HandleBar {
		   

	       public void right() {
	           System.out.println("Steering wheel to the right!"+ model);
	       }

	       public void left() {

	           System.out.println("Steering wheel to the left!"+weight);
	       }
	   }

	   public class Seat {

	       public void up() {

	           System.out.println("The seat is up!");
	       }

	       public void down() {

	           System.out.println("The seat is down!");
	       }
	   }
}
public class InnerClassExample {
	public static void main(String[] args)
	{
		Bicycle bc=new Bicycle("Peugeot", 120);
		Bicycle.HandleBar hb=bc.new HandleBar();
		Bicycle.Seat seat=bc.new Seat();
		hb.left();
		hb.right();
		seat.up();
		seat.down();
	}

	   
	}

