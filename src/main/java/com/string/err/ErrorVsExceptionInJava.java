package com.string.err;

/**
 * @author Naveen K Wodeyar
 * @date 06-Sept-2025
 */

public class ErrorVsExceptionInJava {

	    public static void main(String[] args) {

	        // 1. Handle an Exception (ArithmeticException)
	        try {
	            int a = 10;
	            int b = 0;
	            int result = a / b; // This will throw ArithmeticException
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Caught Exception: " + e);
	        }

	        // 2. Cause an Error (StackOverflowError)
	        try {
	            System.out.println("Calling method that causes StackOverflowError...");
	            recursiveCall(); // This will eventually throw StackOverflowError
	        } catch (StackOverflowError e) {
	            System.out.println("Caught Error: " + e);
	        }

	        System.out.println("Program continues after handling exception and error.");
	    }

	    // Method that causes StackOverflowError by infinite recursion
	    public static void recursiveCall() {
	        recursiveCall(); // No base condition → infinite recursion
	    }
	}

