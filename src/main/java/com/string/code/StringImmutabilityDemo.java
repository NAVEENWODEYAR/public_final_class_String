package com.string.code;

/**
 * @author Naveen K Wodeyar
 * @date 28-Aug-2025
 */

public class StringImmutabilityDemo {
    public static void main(String[] args) {
        String original = "Hello";
        System.out.println("Original String: " + original);

        // Attempt to change the string using concatenation
        String modified = original.concat(" World");

        // Display results
        System.out.println("After Concatenation:");
        System.out.println("Original String: " + original);
        System.out.println("Modified String: " + modified);

        // Check if both strings refer to the same object
        if (original == modified) {
            System.out.println("Both strings are the same object.");
        } else {
            System.out.println("Original and Modified strings are different objects.");
        }
    }
}
