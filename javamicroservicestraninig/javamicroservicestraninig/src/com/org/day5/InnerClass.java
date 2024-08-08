package com.org.day5;
//class CPU
//{
//	double price;
//	class Processor
//	{
//		double cores;//member of the nested class
//		String manufacturer;
//		
//		double getCash()
//		{
//			return 53.0;
//		}
//		
//		void display()
//		{
//			System.out.println("Processor inner class.......");
//		}
//	}
//	protected class Ram
//	{
//		double memory;
//		double getClockSpeed()
//		{
//			return 5.6;
//		}
//	}
//}
//
//public class InnerClass {
//
//	public static void main(String[] args) 
//	{
//		CPU cpu=new CPU();
//		CPU.Processor cpu1=cpu.new Processor();
//		cpu1.display();
//		
//	}
//
//}

class CPU {
    double price;
    // nested class
    class Processor{

        // members of nested class
        double cores;
        String manufacturer;

        double getCache(){
            return 4.3;
        }
    }

    // nested protected class
    protected class RAM{

        // members of protected nested class
        double memory;
        String manufacturer;

        double getClockSpeed(){
            return 5.5;
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {

        // create object of Outer class CPU
        CPU cpu = new CPU();

       // create an object of inner class Processor using outer class
        CPU.Processor processor = cpu.new Processor();

        // create an object of inner class RAM using outer class CPU
        CPU.RAM ram = cpu.new RAM();
        System.out.println("Processor Cache = " + processor.getCache());
        System.out.println("Ram Clock speed = " + ram.getClockSpeed());
    }
}
