package com.string.code.realWorld;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Naveen K Wodeyar
 * @date 11-Sept-2025
 */

public class StringCombiner {
    public static void main(String[] args) {
        try {
            // Sample list of strings (could be dynamic input)
            List<String> strings = Arrays.asList("Java", "Stream", "API", "Example");

            // Combine strings using stream and collect
            String combined = strings.stream()
                                     .filter(s -> s != null && !s.isEmpty()) // Filter null or empty strings
                                     .collect(Collectors.joining(" ")); // Join with space

            System.out.println("Combined String: " + combined);
        } catch (Exception e) {
            System.err.println("An error occurred while combining strings: " + e.getMessage());
            e.printStackTrace(); // Optional: For debugging
        }
    }
}
