package com.org.day5;
interface MyDemo {
	int y=200;
	   public void display();
	}
class Polygon {
	   public void display() {
	      System.out.println("Inside the Polygon class");
	   }
	   
	   MyDemo m=new MyDemo() {
		   public void display()
		   {
			   System.out.println("Interface Display method");
			   System.out.println(m.y);
		   }
	   };
	}

	class AnonymousDemo {
	   public void createClass() {

	      // creation of anonymous class extending class Polygon
	      Polygon p1 = new Polygon() {
	         public void display() {
	            System.out.println("Inside an anonymous class");
	         }
	      };
	      p1.display();
	   }
	}

	class AnonymousInnerClass {
	   public static void main(String[] args) {
	       AnonymousDemo an = new AnonymousDemo();
	       an.createClass();
	   }
	}
