package com.string.code.realWorld;

public class PalindromeNumber {

    /*
     * @author Naveen K Wodeyar
     * @date 28-Aug-2026
     * Problem:
     * Given an integer, check whether it is a palindrome.
     *
     * A palindrome reads the same from left to right
     * and right to left.
     *
     * Examples:
     * 121  -> true
     * 123  -> false
     * -121 -> false
     * 10   -> false
     */

    public static boolean isPalindrome(int number) {

        // Negative numbers cannot be palindromes.
        if (number < 0) {
            return false;
        }

        // Store the original number for comparison later.
        int originalNumber = number;

        // This will store the reversed number.
        int reversedNumber = 0;

        /*
         * Extract each digit from the end of the number
         * and build the reversed number.
         *
         * Example: number = 121
         *
         * 1st digit = 1  -> reversed = 1
         * 2nd digit = 2  -> reversed = 12
         * 3rd digit = 1  -> reversed = 121
         */
        while (number > 0) {

            // Get the last digit.
            int digit = number % 10;

            // Add the digit to the reversed number.
            reversedNumber = reversedNumber * 10 + digit;

            // Remove the last digit.
            number = number / 10;
        }

        // If original and reversed numbers are equal,
        // the number is a palindrome.
        return originalNumber == reversedNumber;
    }
    

    public static void main(String[] args) {

        // LeetCode-style test cases
        int[] testCases = {121, -121, 10, 0, 1221, 12321, 123};

        for (int number : testCases) {
            System.out.println(
                "Input: " + number +
                " -> Output: " + isPalindrome(number)
            );
        }
    }
    
}
