package com.org.day5;
import java.util.*;
public class DemoCollections {
	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<>();
		list.add("Mango");
		list.add("Pomegranate");
		ArrayList<String> arr=new ArrayList<>();
		arr.add("apple");
		arr.add("Banana");
		arr.add("Strawberry");
		list.add(1, "pineapple");
		list.addAll(arr);
		list.remove(2);
		arr.remove(0);
		System.out.println(list);
		System.out.println(arr);
		System.out.println(list.contains("pomegranate"));
		System.out.println(arr.contains("Mango"));
		if(arr.contains("Banana"))
		{
			arr.remove("Banana");
		}
		System.out.println(arr);
	}
}
