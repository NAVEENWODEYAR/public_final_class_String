package com.string;

/**
 * @author Naveen K Wodeyar
 * @date 07-Feb-2026
 */

public class StringPoolTest {

    public static void main(String[] args) {

        // String literals go to String Constant Pool
        String s1 = "Java";
        String s2 = "Java";

        // new keyword always creates a new object in heap
        String s3 = new String("Java");

        // Reference comparison
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false

        // Content comparison
        System.out.println(s1.equals(s3)); // true
    }
}
