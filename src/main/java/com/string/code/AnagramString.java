package com.string.code;

import java.util.Arrays;

/**
 * @author Naveen K Wodeyar
 * @date 01-Oct-2024
 */

public class AnagramString {

    public static boolean areAnagrams(String str1, String str2) {

        // Null checks
        if (str1 == null || str2 == null)
            return false;

        // Length check
        if (str1.length() != str2.length())
            return false;

        // Convert to lowercase and sort
        char[] charArray1 = str1.toLowerCase().toCharArray();
        char[] charArray2 = str2.toLowerCase().toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {

        String[][] testCases = {
                {"listen", "silent"},
                {"triangle", "integral"},
                {"anagram", "nagaram"},
                {"rat", "car"},
                {"hello", "world"},
                {"a", "a"},
                {"ab", "ba"},
                {"abc", "abcd"},
                {"", ""},
                {"Dormitory", "DirtyRoom"},
                {"School", "Chools"},
                {"apple", "papel"},
                {"java", "avaj"},
                {"test", "ttew"},
                {"abcd", "dcba"}
        };

        boolean[] expected = {
                true,
                true,
                true,
                false,
                false,
                true,
                true,
                false,
                true,
                true,
                true,
                true,
                true,
                false,
                true
        };

        System.out.println("===== LeetCode Style Test Cases =====");

        int passed = 0;

        for (int i = 0; i < testCases.length; i++) {

            String str1 = testCases[i][0];
            String str2 = testCases[i][1];

            boolean actual = areAnagrams(str1, str2);

            if (actual == expected[i]) {
                passed++;
            }

            System.out.printf(
                    "Test %2d: areAnagrams(\"%s\", \"%s\") -> Expected: %-5b Actual: %-5b %s%n",
                    i + 1,
                    str1,
                    str2,
                    expected[i],
                    actual,
                    (actual == expected[i]) ? "✅ PASS" : "❌ FAIL");
        }

        System.out.println("--------------------------------------");
        System.out.println("Passed: " + passed + "/" + testCases.length);
    }
}
