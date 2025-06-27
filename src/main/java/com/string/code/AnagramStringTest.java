package com.string.code;

import java.util.Arrays;

/**
 * Program to check if two strings are anagrams and test various scenarios.
 * @author Naveen
 * @date 01-Oct-2024
 */

public class AnagramStringTest {

    public static boolean areAnagrams(String str1, String str2) {
        // Null or empty checks
        if (str1 == null || str2 == null) return false;
        if (str1.length() != str2.length()) return false;

        // Convert to lowercase char arrays, sort, and compare
        char[] charArray1 = str1.toLowerCase().toCharArray();
        char[] charArray2 = str2.toLowerCase().toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        // Test cases
        testAnagram("listen", "silent");       // true
        testAnagram("Triangle", "Integral");   // true
        testAnagram("hello", "world");         // false
        testAnagram("abc", "ab");              // false
        testAnagram(null, "abc");              // false
        testAnagram("abc", null);              // false
        testAnagram(null, null);               // false
        testAnagram("", "");                   // true
        testAnagram("aabb", "ab");             // false
    }

    public static void testAnagram(String str1, String str2) {
        boolean result = areAnagrams(str1, str2);
        System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" anagrams? -> " + result);
    }
}
