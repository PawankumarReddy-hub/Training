package com.org.day6;

import java.util.*;
import java.util.Map.Entry;  
public class HashMapDemo   
{  
private static final int Entry = 0;
private static final int Integer = 0;
private static final int String = 0;

//    /* Function to create HashMap from array */  
//    static void HashMapCreation(int arr[])  
//    {  
//        /* Creates an empty HashMap */  
//        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();  
//        for (int i = 0; i < arr.length; i++)   
//        {  
//            /* Get if the element is present */  
//            Integer n = hashmap.get(arr[i]);  
//            /* If this is first occurrence of element Insert the element */  
//            if (hashmap.get(arr[i]) == null)   
//            {  
//                hashmap.put(arr[i], 1);  
//            }  
//            /* If element is already present in hash map Increment the count of element by 1 */  
//            else   
//            {  
//                hashmap.put(arr[i], ++n);  
//            }  
//        }  
//        /* Display HashMap */  
//        System.out.println(hashmap);  
//    }  
//    /* Driver Code */  
//    public static void main(String[] args)  
//    {  
//        int arr[] = { 1, 6, 5, 10, 6, 6, 10 };  
//        HashMapCreation(arr);  
//    }  
	  /* Driver Code */  
    public static void main(String args[])  
    {  
       /* Create a HashTable to store String values corresponding to integer keys */  
        Hashtable<Integer, String> hm = new Hashtable<Integer, String>();  
        /* Input the values */  
        hm.put(3, "You are visiting");  
        hm.put(5, "Hello");  
        hm.put(1, "website");   
        hm.put(2, "Javatoint"); 
        hm.put(6, "Javatpoint");
        hm.putIfAbsent(202, "How");  
        hm.put(8,"hy");
        String p=hm.getOrDefault(8, "no");
        /* Display the Hashtable */  
        System.out.println(hm);  
        System.out.println("Get or Default: "+p);
        Vector<String> Enum = new Vector<String>();         
        Enum.add("JAVA");  
        Enum.add("JSP");  
        Enum.add("SERVLET");  
        Enum.add("C");  
        Enum.add("PHP");  
        Enum.add("PERL");  
        //Create Enumeration  
        Enumeration<String> en = Collections.enumeration(Enum);  
        System.out.println("The Enumeration List are: ");  
        while(en.hasMoreElements()){  
             System.out.println(en.nextElement());  
        }          
        Set<Entry<Integer,String>> se=hm.entrySet();
        for(Entry<Integer,String>s:se)
        {
        	System.out.println(s);
        }
//        se.stream().forEach(Entry<Integer,String> e::se);
    }  
} 