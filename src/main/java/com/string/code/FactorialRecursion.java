package com.string.code;

/**
* @author Naveen K Wodeyar
* @date 16-Dec-2025
*/

public class FactorialRecursion {

    // Recursive function
    static int factorial(int n) {
        if (n < 0) {
            return -1; // indicates invalid input
        }
        if (n == 0 || n == 1) {
            return 1; // base case
        }
        return n * factorial(n - 1); // recursive call
    }

    // LeetCode-style test runner
    static void runTest(int input, int expected) {
        int result = factorial(input);
        System.out.println(
            "Input: " + input +
            " | Expected: " + expected +
            " | Output: " + result +
            " | " + (result == expected ? "PASS" : "FAIL")
        );
    }

    public static void main(String[] args) {

        // Test Case 1: Normal input
        runTest(5, 120);

        // Test Case 2: Base case (0)
        runTest(0, 1);

        // Test Case 3: Base case (1)
        runTest(1, 1);

        // Test Case 4: Small number
        runTest(3, 6);

        // Test Case 5: Invalid (negative input)
        runTest(-4, -1);
    }
}
