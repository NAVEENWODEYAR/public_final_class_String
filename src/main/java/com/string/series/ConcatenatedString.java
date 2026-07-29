package com.string.series;

/**
 * @author Naveen K Wodeyar
 * @date 26-May-2025
 *
 * Problem:
 * Given an integer n, generate a concatenated string pattern.
 *
 * Example:
 * Input: 3
 * Output: "A AB ABC"
 *
 * Explanation:
 * n = 1 -> A
 * n = 2 -> A AB
 * n = 3 -> A AB ABC
 */

class Solution {

    public String concatenatedString(int n) {
        if (n <= 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            char ch = 'A';

            for (int j = 1; j <= i; j++) {
                result.append(ch++);
            }

            if (i != n) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}

public class ConcatenatedString {

    private static void runTest(int n, String expected) {
        Solution solution = new Solution();

        String actual = solution.concatenatedString(n);

        System.out.println("----------------------------------------");
        System.out.println("Input    : n = " + n);
        System.out.println("Expected : \"" + expected + "\"");
        System.out.println("Actual   : \"" + actual + "\"");

        if (expected.equals(actual)) {
            System.out.println("Result   : PASS");
        } else {
            System.out.println("Result   : FAIL");
        }
    }

    public static void main(String[] args) {

        // LeetCode Style Test Cases

        runTest(1, "A");

        runTest(2, "A AB");

        runTest(3, "A AB ABC");

        runTest(4, "A AB ABC ABCD");

        runTest(5, "A AB ABC ABCD ABCDE");

        runTest(6, "A AB ABC ABCD ABCDE ABCDEF");

        // Edge Case
        runTest(0, "");

        // Negative Input
        runTest(-2, "");

        // Larger Input
        runTest(8, "A AB ABC ABCD ABCDE ABCDEF ABCDEFG ABCDEFGH");
    }
}
