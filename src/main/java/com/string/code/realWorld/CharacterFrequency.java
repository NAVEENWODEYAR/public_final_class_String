/**
 * @author Naveen K Wodeyar
 * @date 01-Sept-2026
 */
package com.string.code.realWorld;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {

    /**
     * Returns the frequency of each character in the given string.
     *
     * @param s input string
     * @return map containing each character and its frequency
     */
    public static Map<Character, Integer> charFrequency(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Count each character
        for (char ch : s.toCharArray()) {

            // Ignore spaces
            if (ch == ' ') {
                continue;
            }

            // Increment the character count
            frequencyMap.put(
                ch,
                frequencyMap.getOrDefault(ch, 0) + 1
            );
        }

        return frequencyMap;
    }

    public static void main(String[] args) {

        // Test Case 1
        String input1 = "hello";
        System.out.println(charFrequency(input1));
        // Expected: {h=1, e=1, l=2, o=1}

        // Test Case 2
        String input2 = "programming";
        System.out.println(charFrequency(input2));
        // Expected: {p=1, r=2, o=1, g=2, a=1, m=2, i=1, n=1}

        // Test Case 3: Ignore spaces
        String input3 = "hello world";
        System.out.println(charFrequency(input3));
        // Expected: {h=1, e=1, l=3, o=2, w=1, r=1, d=1}

        // Test Case 4: Empty string
        String input4 = "";
        System.out.println(charFrequency(input4));
        // Expected: {}

        // Test Case 5: Repeated character
        String input5 = "aaaaa";
        System.out.println(charFrequency(input5));
        // Expected: {a=5}
    }
}

