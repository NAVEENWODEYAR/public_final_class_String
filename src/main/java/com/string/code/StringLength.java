package com.string.code;

/**
 * @author Naveen K Wodeyar
 * @date 19-Dec-2025
 */

public class StringLength {

    // Function to calculate string length
    public static int stringLength(String s) {
        if (s == null) {
            return 0;
        }
        return s.length();
    }

    // Test cases (LeetCode-style main method)
    public static void main(String[] args) {

        System.out.println("Test Case 1:");
        System.out.println(stringLength("Hello"));
        // Expected Output: 5

        System.out.println("\nTest Case 2:");
        System.out.println(stringLength("Java Programming"));
        // Expected Output: 16

        System.out.println("\nTest Case 3:");
        System.out.println(stringLength(""));
        // Expected Output: 0

        System.out.println("\nTest Case 4:");
        System.out.println(stringLength("A"));
        // Expected Output: 1

        System.out.println("\nTest Case 5:");
        System.out.println(stringLength(null));
        // Expected Output: 0
    }
}
