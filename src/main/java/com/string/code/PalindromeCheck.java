package com.string.code;

/**
 * @author Naveen K Wodeyar
 * @date 19-Dec-2025
 */

public class PalindromeCheck {

    // Method to check whether a string is palindrome
    static boolean isPalindrome(String s) {

        int start = 0;
        int end = s.length() - 1;

        // Compare characters from start and end
        while (start < end) {
            if (s.charAt(start) != s.charAt(end))
                return false;

            start++;
            end--;
        }
        return true;
    }

    // Test cases
    public static void main(String[] args) {
        System.out.println(isPalindrome("madam")); // true
        System.out.println(isPalindrome("java"));  // false
        System.out.println(isPalindrome("a"));     // true
    }
}
