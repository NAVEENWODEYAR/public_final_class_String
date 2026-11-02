package com.string.compare;

/**
 * @author Naveen K Wodeyar
 * @date 02-Nov-2026
 */

public class StringTrickyQuiz {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = s3.intern();

        System.out.println(s1 == s2);       // Statement 1
        System.out.println(s1 == s3);       // Statement 2
        System.out.println(s1 == s4);       // Statement 3
        System.out.println(s1.equals(s3));  // Statement 4
    }
}