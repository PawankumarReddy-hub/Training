package com.org.day5;

import java.util.function.Predicate;

public class FunctionalInterfaceDemo {
	
	public static int getSum(int[] arr,Predicate<Integer> condition)
	{
		int sum=0;
		for(int num:arr)
		{
			if(condition.test(num))
			{
				sum+=num;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr= {1,2,3,6,5,55};
		int evenSum=getSum(intArr ,x->x%2==0);
		System.out.println("Sum of even numbers: "+evenSum);
		System.out.println("Sum of odd numbesrs: "+getSum(intArr, x->x%2!=0));

	}

}
