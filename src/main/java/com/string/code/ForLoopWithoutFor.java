package com.string.code;

/**
 * @author Naveen K Wodeyar
 * @date 08-Nov-2025
 */

public class ForLoopWithoutFor {

    // Method to simulate a for loop using recursion
    static void simulateForLoop(int start, int end) {
        if (start > end)
            return; // base case
        System.out.println(start);
        simulateForLoop(start + 1, end); // recursive call (acts like increment)
    }

    // Method to test the loop simulation
    static void testSimulateForLoop(int testCaseNumber, int start, int end) {
        System.out.println("=== Test Case " + testCaseNumber + " ===");
        System.out.println("Range: " + start + " to " + end);
        System.out.println("Output:");
        simulateForLoop(start, end);
        System.out.println(); // blank line between test cases
    }

    public static void main(String[] args) {
        testSimulateForLoop(1, 1, 5);

        testSimulateForLoop(2, 7, 7);

        testSimulateForLoop(3, 10, 5);

        testSimulateForLoop(4, -3, 2);
    }
}
