package com.string.compare;

/**
 * @author Naveen K Wodeyar
 * @date 02-Nov-2026
 */

public class InternDemo {
	
    public static void main(String[] args) {
    	
        // Created with 'new' - lives in regular heap, NOT the String Pool
        String s1 = new String("Welcome"); 
        
        // Created with literal - lives in the String Pool
        String s2 = "Welcome"; 

        // At this point, they point to different memory addresses
        System.out.println(s1 == s2); // false

        // Call .intern() on s1
        String s3 = s1.intern();

        // s3 now points to the literal version in the String Pool (which is s2)
        System.out.println(s2 == s3); // true
    }
}