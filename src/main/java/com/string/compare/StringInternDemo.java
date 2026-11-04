package com.string.compare;

/**
 * Simple demonstration of how String.intern() works in Java.
 * 
 * @author Naveen K Wodeyar
 * @date 04-Nov-2026
 */
public class StringInternDemo {

    public static void main(String[] args) {
        
        // 1. String Literals
        // Java automatically reuses string literals in the String Constant Pool.
        String s1 = "Hello";
        String s2 = "Hello";
        
        System.out.println("--- 1. String Literals ---");
        System.out.println("s1 == s2 : " + (s1 == s2)); // true (points to the same pooled object)
        System.out.println();

        
        // 2. Heap Objects using 'new'
        // 'new' creates a brand new object in the heap memory every time.
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        
        System.out.println("--- 2. Heap Strings (without intern) ---");
        System.out.println("s3 == s4 : " + (s3 == s4)); // false (two different heap objects)
        System.out.println();

        
        // 3. Using intern()
        // intern() checks the String Pool. If the string exists, it returns that reference.
        String s5 = s3.intern();
        
        System.out.println("--- 3. Using intern() ---");
        System.out.println("s1 == s5 : " + (s1 == s5)); // true (s5 now points to the pooled object)
        System.out.println("s3 == s5 : " + (s3 == s5)); // false (s3 is still in the general heap)
    }
}