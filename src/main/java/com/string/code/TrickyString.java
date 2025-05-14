package com.string.code;

/**
 * @author Naveen K Wodeyar
 * @date 14-May-2025
 */

public class TrickyString {
    public static void main(String[] args) {
        // String literal "hello" is placed in the string pool
        String a = "hello";

        // This is the same literal, so 'b' points to the same object in the pool as 'a'
        String b = "hello";

        // This creates a new String object in the heap, not from the string pool
        String c = new String("hello");

        // 'intern()' returns the reference from the string pool (same as "hello")
        String d = c.intern();

        // a and b both refer to the same object in the string pool -> true
        System.out.println("a == b: " + (a == b));        // Line 1

        // a (pool) and c (new object in heap) are not the same reference -> false
        System.out.println("a == c: " + (a == c));        // Line 2

        // d is interned from c, so now points to the pool version ("hello"), same as a -> true
        System.out.println("a == d: " + (a == d));        // Line 3

        // c (heap) and d (pool) are different references -> false
        System.out.println("c == d: " + (c == d));        // Line 4
    }
}

