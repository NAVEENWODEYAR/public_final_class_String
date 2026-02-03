package com.string.code;

import java.util.*;

/**
 * @author Naveen K Wodeyar
 * @date 02-Feb-2026
 */

class AnagramTestWithTestCases {

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


