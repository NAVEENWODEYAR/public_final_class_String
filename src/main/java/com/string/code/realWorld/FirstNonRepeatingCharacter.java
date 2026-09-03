/**
 * @author Naveen K Wodeyar
 * @date 03-Sept-2026
 */
package com.string.code.realWorld;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    /*
     * Method to find the first non-repeating character.
     *
     * @param s - input string
     * @return index of the first non-repeating character
     *         or -1 if no such character exists
     */
    public static int firstUniqChar(String s) {

        // HashMap stores:
        // Character -> Number of times it appears
        Map<Character, Integer> frequency = new HashMap<>();

        /*
         * STEP 1:
         * Count the frequency of every character.
         *
         * Example:
         * s = "leetcode"
         *
         * l -> 1
         * e -> 3
         * t -> 1
         * c -> 1
         * o -> 1
         * d -> 1
         */
        for (char c : s.toCharArray()) {

            // getOrDefault returns the existing count.
            // If the character doesn't exist, it returns 0.
            frequency.put(
                c,
                frequency.getOrDefault(c, 0) + 1
            );
        }

        /*
         * STEP 2:
         * Traverse the string from left to right.
         *
         * We check the frequency of each character.
         * The first character with frequency == 1
         * is our answer.
         */
        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (frequency.get(c) == 1) {
                return i;
            }
        }

        /*
         * If we reach here, every character appears
         * more than once.
         */
        return -1;
    }

    public static void main(String[] args) {

        // LeetCode-style test cases

        String[] testCases = {
            "leetcode",
            "loveleetcode",
            "aabb",
            "a",
            "aabbc",
            "swiss"
        };

        // Run every test case
        for (String input : testCases) {

            int result = firstUniqChar(input);

            System.out.println(
                "Input: \"" + input + "\""
                + " -> Output: " + result
            );
        }
    }
}