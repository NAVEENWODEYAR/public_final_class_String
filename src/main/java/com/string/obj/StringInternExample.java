package com.string.obj;

/**
 * @author Naveen K Wodeyar
 * @date 08-Jun-2025
 */

public class StringInternExample {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = new String("hello");
        String s3 = s2.intern();

        System.out.println(s1 == s2); // false: s2 is a new object
        System.out.println(s1 == s3); // true: both point to the interned string in the pool
    }
}
