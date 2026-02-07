package com.string;

/**
 * @author Naveen K Wodeyar
 * @date 07-Feb-2026
 */

public class PalindromeNumber {

    public static boolean isPalindrome(int number) {
        // Negative numbers are not palindrome
        if (number < 0) {
            return false;
        }

        int original = number;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        int[] testCases = {121, 12321, 123, -121, 10, 0};

        for (int num : testCases) {
            System.out.println(num + " -> " + isPalindrome(num));
        }
    }
}
