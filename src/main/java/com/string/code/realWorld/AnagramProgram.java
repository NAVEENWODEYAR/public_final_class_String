/**
 * @author Naveen K Wodeyar
 * @date 04-Sept-2026
 */
package com.string.code.realWorld;

/*
 * ============================================================
 *              VALID ANAGRAM - JAVA INTERVIEW
 * ============================================================
 *
 * Problem:
 * Given two strings s and t, determine whether t is an
 * anagram of s.
 *
 * An anagram contains the same characters with the same
 * frequency, but the characters can be in a different order.
 *
 * Example:
 *
 * s = "anagram"
 * t = "nagaram"
 *
 * Output: true
 *
 * Example:
 *
 * s = "rat"
 * t = "car"
 *
 * Output: false
 *
 * ============================================================
 *
 * APPROACH:
 *
 * We use an integer array of size 26 to store the frequency
 * of lowercase English letters.
 *
 * For every character:
 *
 *     s character -> increase count
 *     t character -> decrease count
 *
 * If both strings are anagrams, every count will become 0.
 *
 * ============================================================
 *
 * TIME COMPLEXITY:
 *     O(n)
 *
 * SPACE COMPLEXITY:
 *     O(1)
 *
 * Because the frequency array always contains only 26
 * elements.
 *
 * ============================================================
 */

public class AnagramProgram {

    /*
     * --------------------------------------------------------
     * METHOD: isAnagram
     * --------------------------------------------------------
     *
     * Checks whether two strings are anagrams.
     *
     * Assumption:
     * The input contains only lowercase English letters (a-z).
     */
    public static boolean isAnagram(String s, String t) {

        // ----------------------------------------------------
        // Step 1: Check the length.
        //
        // If lengths are different, they cannot be anagrams.
        // ----------------------------------------------------

        if (s.length() != t.length()) {
            return false;
        }

        // ----------------------------------------------------
        // Step 2: Create a frequency array.
        //
        // Index 0  -> 'a'
        // Index 1  -> 'b'
        // ...
        // Index 25 -> 'z'
        // ----------------------------------------------------

        int[] count = new int[26];

        // ----------------------------------------------------
        // Step 3: Count characters.
        //
        // Add frequency for string s.
        // Subtract frequency for string t.
        //
        // Example:
        //
        // s = "aab"
        // t = "baa"
        //
        // The counts will eventually become zero.
        // ----------------------------------------------------

        for (int i = 0; i < s.length(); i++) {

            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        // ----------------------------------------------------
        // Step 4: Check all frequencies.
        //
        // If any value is not zero, the strings are not
        // anagrams.
        // ----------------------------------------------------

        for (int frequency : count) {

            if (frequency != 0) {
                return false;
            }
        }

        // All character frequencies matched.
        return true;
    }


    /*
     * --------------------------------------------------------
     * MAIN METHOD
     * --------------------------------------------------------
     *
     * Contains LeetCode-style test cases.
     * --------------------------------------------------------
     */
    public static void main(String[] args) {

        // Create test cases.
        String[][] testCases = {

                // Test Case 1
                {"anagram", "nagaram"},

                // Test Case 2
                {"rat", "car"},

                // Test Case 3
                {"listen", "silent"},

                // Test Case 4
                {"hello", "world"},

                // Test Case 5
                {"", ""},

                // Test Case 6
                {"a", "a"},

                // Test Case 7
                {"a", "b"},

                // Test Case 8
                {"abc", "cba"},

                // Test Case 9
                {"aabbcc", "ccbbaa"},

                // Test Case 10
                {"aabb", "abbb"}
        };


        // Expected answers for the test cases.
        boolean[] expected = {

                true,
                false,
                true,
                false,
                true,
                true,
                false,
                true,
                true,
                false
        };


        // ----------------------------------------------------
        // Run all test cases.
        // ----------------------------------------------------

        System.out.println("==============================================");
        System.out.println("          VALID ANAGRAM TEST CASES");
        System.out.println("==============================================");

        for (int i = 0; i < testCases.length; i++) {

            String s = testCases[i][0];
            String t = testCases[i][1];

            boolean result = isAnagram(s, t);

            System.out.println();
            System.out.println("Test Case " + (i + 1));
            System.out.println("s        = \"" + s + "\"");
            System.out.println("t        = \"" + t + "\"");
            System.out.println("Expected = " + expected[i]);
            System.out.println("Actual   = " + result);

            // Check whether the test passed.
            if (result == expected[i]) {
                System.out.println("Result   = PASS");
            } else {
                System.out.println("Result   = FAIL");
            }
        }


        System.out.println();
        System.out.println("==============================================");
        System.out.println("                 END");
        System.out.println("==============================================");
    }
}
