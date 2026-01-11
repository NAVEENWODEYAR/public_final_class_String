package com.string.code;

/**
 * @author Naveen K Wodeyar
 * @date 11-Jan-2026
 */

public class StringCheck {
    public static void main(String[] args) {

        // String literals (stored in String Constant Pool)
        String s1 = "Hello";
        String s2 = "Hello";

        // String objects (stored in Heap memory)
        String s3 = new String("Hello");
        String s4 = new String("Hello");

        // Reference comparison
        System.out.println("Reference comparison:");
        System.out.println("s1 == s2 : " + (s1 == s2)); // true
        System.out.println("s1 == s3 : " + (s1 == s3)); // false
        System.out.println("s3 == s4 : " + (s3 == s4)); // false

        // Content comparison
        System.out.println("\nContent comparison:");
        System.out.println("s1.equals(s2) : " + s1.equals(s2)); // true
        System.out.println("s1.equals(s3) : " + s1.equals(s3)); // true
        System.out.println("s3.equals(s4) : " + s3.equals(s4)); // true
    }
}
