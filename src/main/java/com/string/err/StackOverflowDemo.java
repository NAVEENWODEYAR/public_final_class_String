package com.string.err;

/**
 * @author Naveen K Wodeyar
 * @date 20-Aug-2026
 */

public class StackOverflowDemo {

    // This method calls itself again and again.
    // Since there is no stopping condition, recursion continues forever.
    static void recursiveMethod() {
        System.out.println("Method is being called...");

        // Recursive call
        // StackOverflowError occurs when the stack memory is exhausted, usually due to excessive or infinite recursion
        recursiveMethod();
    }

    public static void main(String[] args) {

        try {
            // Start the recursive method
            recursiveMethod();

        } catch (StackOverflowError e) {

            // This block executes when the stack memory becomes full.
            System.out.println("\nStackOverflowError occurred!");
            System.out.println("Reason: Too many recursive method calls.");
        }
    }
}