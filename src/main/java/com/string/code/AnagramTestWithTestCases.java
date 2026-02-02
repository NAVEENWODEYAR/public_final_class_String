/**
 * @author Naveen K Wodeyar
 * @date 02-Feb-2026
 */
package com.string.code;

import java.util.*;

class AnagramTestWithTestCases {

	public static void main(String[] args) {
        AnagramTestWithTestCases solution = new AnagramTestWithTestCases();

        // LeetCode-like test cases
        System.out.println(solution.isAnagram("anagram", "nagaram")); // true
        System.out.println(solution.isAnagram("rat", "car"));         // false
        System.out.println(solution.isAnagram("listen", "silent"));   // true
        System.out.println(solution.isAnagram("aacc", "ccac"));       // false
        System.out.println(solution.isAnagram("", ""));               // true
    }
	
    // LeetCode-style method
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}


