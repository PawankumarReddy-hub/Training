package com.org.day17;

import java.util.Scanner;
public class JavaTimePackageExample 
{ 
    public static void main(String[] args) 
    {
        long start;
        long end;
        double time; 
 
        start = System.currentTimeMillis();     
        System.out.print("Enter the Name : ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
 
        System.out.println("Thanks "+ name +" ! "); 
        end = System.currentTimeMillis();
        time = (end - start) / 1000.0;   //time difference
 
        System.out.println("Elapsed Time is :  " + time);
    } 
}
