package com.string.series;

/**
 * Longest Palindromic Substring
 *
 * LeetCode 5:
 * https://leetcode.com/problems/longest-palindromic-substring/
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 *
 * @author Naveen K Wodeyar
 * @date 27-May-2025
 */
public class LongestPalindrome {

    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1)
            return "";

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {

            // Odd length palindrome
            int len1 = expandAroundCenter(s, i, i);

            // Even length palindrome
            int len2 = expandAroundCenter(s, i, i + 1);

            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {

        while (left >= 0 &&
               right < s.length() &&
               s.charAt(left) == s.charAt(right)) {

            left--;
            right++;
        }

        return right - left - 1;
    }

    // Helper method for testing
    private static void test(String input, String expected) {
        String result = longestPalindrome(input);

        // Some LeetCode test cases have multiple valid answers
        boolean passed;

        if (expected.contains("/")) {
            String[] valid = expected.split("/");
            passed = false;
            for (String s : valid) {
                if (result.equals(s)) {
                    passed = true;
                    break;
                }
            }
        } else {
            passed = result.equals(expected);
        }

        System.out.printf(
                "Input: %-20s Expected: %-10s Output: %-10s %s%n",
                "\"" + input + "\"",
                expected,
                result,
                passed ? "✅ PASS" : "❌ FAIL"
        );
    }

    public static void main(String[] args) {

        System.out.println("========== Longest Palindromic Substring (LeetCode Style) ==========\n");

        // LeetCode Example 1
        test("babad", "bab/aba");

        // LeetCode Example 2
        test("cbbd", "bb");

        // Single character
        test("a", "a");

        // Two different characters
        test("ac", "a/c");

        // Entire string is palindrome
        test("racecar", "racecar");

        // Even length palindrome
        test("abba", "abba");

        // Odd length palindrome
        test("madam", "madam");

        // Repeated characters
        test("aaaa", "aaaa");

        // No palindrome longer than 1
        test("abcde", "a/b/c/d/e");

        // Palindrome in the middle
        test("forgeeksskeegfor", "geeksskeeg");

        // Long palindrome
        test("bananas", "anana");

        // Mixed palindrome
        test("abacdfgdcaba", "aba");

        // Empty string
        test("", "");

        // One repeated character
        test("zzzzzz", "zzzzzz");

        // Palindrome at beginning
        test("aabcc", "aa");

        // Palindrome at end
        test("ccbaa", "aa");

        // Complex example
        test("abaxyzzyxf", "xyzzyx");

        // Another LeetCode-style example
        test("abb", "bb");

        // Long odd palindrome
        test("abcba", "abcba");

        // Large repeated pattern
        test("abababababa", "abababababa");
    }
}
