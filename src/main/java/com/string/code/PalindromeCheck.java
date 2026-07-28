package com.string.code;

/**
 * @author Naveen K Wodeyar
 * @date 19-Dec-2025
 */

public class PalindromeCheck {

    // Method to check whether a string is palindrome
    static boolean isPalindrome(String s) {

        if (s == null)
            return false;

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

    // LeetCode-style test cases
    public static void main(String[] args) {

        String[] testCases = {
                "madam",
                "racecar",
                "level",
                "java",
                "hello",
                "a",
                "",
                "abba",
                "abcba",
                "abcd",
                "noon",
                "refer",
                "rotator",
                "palindrome",
                "1221"
        };

        boolean[] expected = {
                true,
                true,
                true,
                false,
                false,
                true,
                true,
                true,
                true,
                false,
                true,
                true,
                true,
                false,
                true
        };

        System.out.println("===== LeetCode Style Test Cases =====");

        int passed = 0;

        for (int i = 0; i < testCases.length; i++) {

            boolean actual = isPalindrome(testCases[i]);

            if (actual == expected[i]) {
                passed++;
            }

            System.out.printf(
                    "Test %2d: isPalindrome(\"%s\") -> Expected: %-5b Actual: %-5b %s%n",
                    i + 1,
                    testCases[i],
                    expected[i],
                    actual,
                    (actual == expected[i]) ? "✅ PASS" : "❌ FAIL");
        }

        System.out.println("--------------------------------------");
        System.out.println("Passed: " + passed + "/" + testCases.length);
    }
}
