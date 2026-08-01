package com.string.code;

import java.util.stream.IntStream;

/**
 * LeetCode Style - Valid Palindrome using Java Streams
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 *
 * @author Naveen K Wodeyar
 * @date 17-Dec-2025
 */
public class PalindromeStream {

    /**
     * Checks whether the given string is a palindrome.
     */
    public static boolean isPalindrome(String str) {

        if (str == null) {
            return false;
        }

        return IntStream.range(0, str.length() / 2)
                .allMatch(i -> str.charAt(i) == str.charAt(str.length() - i - 1));
    }

    /**
     * Helper method for LeetCode-style testing.
     */
    private static void test(String input, boolean expected) {

        boolean actual = isPalindrome(input);

        System.out.println("-------------------------------------------");
        System.out.println("Input    : " + (input == null ? "null" : "\"" + input + "\""));
        System.out.println("Expected : " + expected);
        System.out.println("Output   : " + actual);
        System.out.println("Result   : " + (actual == expected ? "✅ PASS" : "❌ FAIL"));
    }

    public static void main(String[] args) {

        System.out.println("========== Palindrome Stream Test Cases ==========\n");

        // LeetCode-style test cases

        test("madam", true);

        test("racecar", true);

        test("level", true);

        test("abba", true);

        test("abcba", true);

        test("hello", false);

        test("java", false);

        test("abcd", false);

        test("", true);                // Empty string

        test("a", true);               // Single character

        test("aa", true);

        test("ab", false);

        test("aaaa", true);

        test("abcde", false);

        test("12321", true);

        test("12345", false);

        test("Able", false);           // Case-sensitive

        test("Madam", false);          // Case-sensitive

        test(" ", true);               // Single whitespace

        test(null, false);             // Null input

        System.out.println("\nAll test cases executed successfully.");
    }
}