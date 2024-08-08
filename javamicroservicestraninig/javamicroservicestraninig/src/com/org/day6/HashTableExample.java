package com.org.day6;
import java.util.*;
public class HashTableExample {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(42);
		arr.add(42);
		arr.add(57);
		arr.add(59);
		HashSet<Integer> hs=new HashSet<>(arr);
		Iterator<Integer> it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
