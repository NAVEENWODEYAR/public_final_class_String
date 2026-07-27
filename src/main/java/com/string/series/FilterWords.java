package com.string.series;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Naveen K Wodeyar
 * @date 27-May-2025
 */

public class FilterWords {

    // LeetCode-style function
    public static List<String> filterWords(String[] words, String filter) {
        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (word.contains(filter)) {
                result.add(word);
            }
        }

        return result;
    }


    // Test cases
    public static void main(String[] args) {

        // Test Case 1
        String[] words1 = {"apple", "application", "banana", "grape"};
        List<String> expected1 = List.of("apple", "application");

        assert filterWords(words1, "app").equals(expected1);
        System.out.println("Test Case 1 Passed ✅");


        // Test Case 2
        String[] words2 = {"cat", "dog", "bird"};
        List<String> expected2 = List.of();

        assert filterWords(words2, "app").equals(expected2);
        System.out.println("Test Case 2 Passed ✅");


        // Test Case 3
        String[] words3 = {"java", "javascript", "python", "kotlin"};
        List<String> expected3 = List.of("java", "javascript");

        assert filterWords(words3, "java").equals(expected3);
        System.out.println("Test Case 3 Passed ✅");


        // Test Case 4
        String[] words4 = {"Apple", "apple", "APP"};
        List<String> expected4 = List.of("apple");

        assert filterWords(words4, "apple").equals(expected4);
        System.out.println("Test Case 4 Passed ✅");


        System.out.println("\nAll test cases passed 🎉");
    }
}
