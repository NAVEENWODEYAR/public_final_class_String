package com.string.code;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Naveen K Wodeyar
 * @date 24-Jun-2025
 */

public class CharCount {
    public static Map<Character, Integer> countCharacters(String str) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();
        boolean[] visited = new boolean[str.length()];

        for (int i = 0; i < str.length(); i++) {
            if (visited[i])
                continue;

            int count = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                    visited[j] = true;
                }
            }

            charCountMap.put(str.charAt(i), count);
        }

        return charCountMap;
    }

    public static void main(String[] args) {
        Map<Character, Integer> result = countCharacters("programming");
        result.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
