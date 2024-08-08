package com.org.day13;

import java.util.Optional;

public class OptionalClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 // creating a string array
//        String[] str = new String[5];
//
//        // Setting value for 2nd index
//        str[2] = "Geeks Classes are coming soon";
//
//        // It returns an empty instance of Optional class
//        Optional<String> empty = Optional.empty();
//        System.out.println(empty);
//
//        // It returns a non-empty Optional
//        Optional<String> value = Optional.of(str[2]);
//        System.out.println(value);

        // creating a string array
        String[] str = new String[5];

        // Setting value for 2nd index
        str[2] = "Geeks Classes are coming soon";
        str[3]=null;
        Employe em=new Employe("59-385-1088","Zacharias","Schwerin","zchwerin@gmail.com","Male","True",101146,0);

        // It returns a non-empty Optional
        Optional<String> value = Optional.of(str[2]);
        Optional<Employe> val=Optional.ofNullable(em);
//        if(val.isPresent())
//        {
//        	String v=str[3];
//        	
//        }
//        else
//        {
//        	System.out.println("not found");
//        }
        val.ifPresent(p->System.out.println("value is: "+val.get()));//if present is checking for existing values in the code

        // It returns value of an Optional.
        // If value is not present, it throws
        // an NoSuchElementException
        System.out.println(value.get());

        // It returns hashCode of the value
        System.out.println(value.hashCode());

        // It returns true if value is present,
        // otherwise false
        System.out.println(value.isPresent());

}
}