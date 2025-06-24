package com.string.code;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Naveen K Wodeyar
 * @date 24-Jun-2025
 */

public class CharCountTest {

    // Core logic to count characters
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

    // Manual test cases
    public static void main(String[] args) {
        runTests();
    }

    private static void runTests() {
        test("programming", Map.of(
            'p', 1,
            'r', 2,
            'o', 1,
            'g', 2,
            'a', 1,
            'm', 2,
            'i', 1,
            'n', 1
        ));

        test("", Map.of());
        test("a", Map.of('a', 1));
        test("aaaa", Map.of('a', 4));
    }

    private static void test(String input, Map<Character, Integer> expected) {
        Map<Character, Integer> result = countCharacters(input);
        boolean passed = result.equals(expected);

        System.out.println("Test with input: \"" + input + "\"");
        if (passed) {
            System.out.println("✅ Passed");
        } else {
            System.out.println("❌ Failed");
            System.out.println("Expected: " + expected);
            System.out.println("Got     : " + result);
        }
        System.out.println("---------------");
    }
}
