package com.string.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Naveen K Wodeyar
 * @date 14-Aug-2026
 */

public class FirstNonRepeating {

    public static Character findFirstNonRepeating(String str) {

        Map<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Find first character with frequency 1
        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println(findFirstNonRepeating("swiss"));
        System.out.println(findFirstNonRepeating("aabbcc"));
        System.out.println(findFirstNonRepeating("programming"));
    }
}