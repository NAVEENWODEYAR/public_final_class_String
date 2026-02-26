package com.string.code.realWorld;

/**
 * @author Naveen K Wodeyar
 * @date 25-Feb-2026
 */

public class MethodOverridingNull {


	    // Method 1: Accepts String parameter
	    public static void print(String s) {
	        System.out.println("String");
	    }

	    // Method 2: Accepts Object parameter
	    public static void print(Object o) {
	        System.out.println("Object");
	    }

	    public static void main(String[] args) {

	        // null can be assigned to any reference type (String, Object, etc.)
	        // So BOTH methods are technically applicable here.

	        // But Java chooses the MOST SPECIFIC method during compile-time.
	        // Since String is a subclass of Object,
	        // print(String) is more specific than print(Object).

	        print(null);   // Output: String
	    }
	
	
}
