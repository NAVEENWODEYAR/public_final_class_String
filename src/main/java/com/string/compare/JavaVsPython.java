/**
 * @author Naveen K Wodeyar
 * @date 06-Jan-2026
 */
package com.string.compare;

/**
 * Demonstrates String comparison in Java
 * and compares it conceptually with Python.
 */
public class JavaVsPython {

    public static void main(String[] args) {

        // String literals (stored in String Constant Pool)
        String s1 = "Hello";
        String s2 = "Hello";

        // String objects (stored in Heap memory)
        String s3 = new String("Hello");
        String s4 = new String("Hello");

        System.out.println("=== Java String Comparison ===");

        // Reference comparison
        System.out.println("s1 == s2 : " + (s1 == s2)); // true (same SCP reference)
        System.out.println("s1 == s3 : " + (s1 == s3)); // false (SCP vs Heap)
        System.out.println("s3 == s4 : " + (s3 == s4)); // false (different Heap objects)

        // Content comparison
        System.out.println("s1.equals(s2) : " + s1.equals(s2)); // true
        System.out.println("s1.equals(s3) : " + s1.equals(s3)); // true
        System.out.println("s3.equals(s4) : " + s3.equals(s4)); // true

        System.out.println("\n=== Key Difference: Java vs Python ===");

        System.out.println("Java:");
        System.out.println("==       → compares references");
        System.out.println("equals() → compares content");

        System.out.println("\nPython:");
        System.out.println("==  → compares content");
        System.out.println("is  → compares references (identity)");

        /*
         * Python example (for understanding):
         *
         * a = "Hello"
         * b = "Hello"
         * c = str("Hello")
         *
         * a == b   # True  (content)
         * a is b   # True  (interning)
         * a is c   # May be False (different object)
         */
    }
}
