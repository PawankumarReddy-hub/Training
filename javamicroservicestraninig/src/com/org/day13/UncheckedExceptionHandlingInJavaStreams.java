package com.org.day13;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class UncheckedExceptionHandlingInJavaStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<String> integers = Arrays.asList("44", "373", "xyz", "145");
//		integers.forEach(str -> {
//		    try {
//		        System.out.println(Integer.parseInt(str));
//		    }catch (NumberFormatException ex) {
//		        System.err.println("Can't format this string");
//		    }
//		}
//		);
//
//		List<String> integers = Arrays.asList("44", "xyz", "145");
//	    integers.forEach(exceptionHandledConsumer(str -> System.out.println(Integer.parseInt(str))));
		
//		List<String> integers = Arrays.asList("44", "373", "xyz", "145");
//		integers.forEach(
//		        handledConsumer(str -> System.out.println(Integer.parseInt(str)), 
//		        NumberFormatException.class));
		
		List<Integer> ints = Arrays.asList(5, 10, 0, 15, 20, 30, 0, 9);
		ints.forEach(
		        handledConsumer(
		                i -> System.out.println(1000 / i),
		                ArithmeticException.class));
	}
	
	static <Target, ExObj extends Exception> Consumer<Target> handledConsumer(Consumer<Target> targetConsumer, Class<ExObj> exceptionClazz) {
	    return obj -> {
	        try {
	            targetConsumer.accept(obj);
	        } catch (Exception ex) {
	            try {
	                ExObj exCast = exceptionClazz.cast(ex);
	                System.err.println(
	                        "Exception occured : " + exCast.getMessage());
	            } catch (ClassCastException ccEx) {
	                throw ex;
	            }
	        }
	    };
	}
//	static Consumer<String> exceptionHandledConsumer(Consumer<String> unhandledConsumer) {
//	    return obj -> {
//	        try {
//	            unhandledConsumer.accept(obj);
//	        } catch (NumberFormatException e) {
//	            System.err.println(
//	                    "Can't format this string");
//	        }
//	    };
//	}

}
