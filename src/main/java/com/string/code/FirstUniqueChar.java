package com.string.code;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Naveen K Wodeyar
 * @date 31-Jul-2025
 */

public class FirstUniqueChar {
    public static Character findFirstNonRepeatedChar(String str) {
        if (str == null || str.isEmpty()) return null;

        Map<Character, Integer> countMap = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println(findFirstNonRepeatedChar("swiss"));     // w
        System.out.println(findFirstNonRepeatedChar("aabbcc"));    // null
        System.out.println(findFirstNonRepeatedChar(""));          // null
    }
}

