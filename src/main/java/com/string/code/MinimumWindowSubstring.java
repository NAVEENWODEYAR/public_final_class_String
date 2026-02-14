package com.string.code;

import java.util.*;

/**
 * @author Naveen K Wodeyar
 * @date 13-Feb-2026
 */

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";

        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        int left = 0, count = t.length();
        int minLen = Integer.MAX_VALUE, start = 0;

        for (int right = 0; right < s.length(); right++) {
            char r = s.charAt(right);
            if (map.containsKey(r)) {
                if (map.get(r) > 0) count--;
                map.put(r, map.get(r) - 1);
            }

            while (count == 0) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char l = s.charAt(left);
                if (map.containsKey(l)) {
                    map.put(l, map.get(l) + 1);
                    if (map.get(l) > 0) count++;
                }
                left++;
            }
        }

        System.out.println("Minimum Window: " + 
            (minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen)));
    }
}
