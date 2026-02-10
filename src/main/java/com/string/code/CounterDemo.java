package com.string.code;

import java.util.Arrays;

/**
 * @author Naveen K Wodeyar
 * @date 10-Feb-2026
 */

public class CounterDemo {

    // LeetCode-style method
    public static int[] counter(int n) {
        int[] result = new int[n];
        int count = 1;

        for (int i = 0; i < n; i++) {
            result[i] = count;
            count++;
        }

        return result;
    }

    // Main method with test cases
    public static void main(String[] args) {

        // Test Case 1
        int n1 = 5;
        System.out.println("Input: n = " + n1);
        System.out.println("Output: " + Arrays.toString(counter(n1)));

        // Test Case 2
        int n2 = 1;
        System.out.println("\nInput: n = " + n2);
        System.out.println("Output: " + Arrays.toString(counter(n2)));

        // Test Case 3
        int n3 = 0;
        System.out.println("\nInput: n = " + n3);
        System.out.println("Output: " + Arrays.toString(counter(n3)));
    }
}
