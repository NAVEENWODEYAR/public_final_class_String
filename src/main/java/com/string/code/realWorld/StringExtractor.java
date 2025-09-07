package com.string.code.realWorld;

import java.util.Optional;

/**
 * @author Naveen K Wodeyar
 * @date 07-Sept-2025
 */

public class StringExtractor {

    // Method 1: Extract substring using start and end index
    public static Optional<String> extractByIndex(String input, int start, int end) {
        try {
            if (input == null) throw new IllegalArgumentException("Input string is null.");
            if (start < 0 || end > input.length() || start >= end) {
                throw new IndexOutOfBoundsException("Invalid start or end indices.");
            }

            return Optional.of(input.substring(start, end));
        } catch (Exception e) {
            System.err.println("Error extracting by index: " + e.getMessage());
            return Optional.empty();
        }
    }

    // Method 2: Extract substring between two keywords
    public static Optional<String> extractBetweenKeywords(String input, String startKeyword, String endKeyword) {
        try {
            if (input == null || startKeyword == null || endKeyword == null) {
                throw new IllegalArgumentException("Input or keywords cannot be null.");
            }

            int startIndex = input.indexOf(startKeyword);
            int endIndex = input.indexOf(endKeyword, startIndex + startKeyword.length());

            if (startIndex == -1 || endIndex == -1 || endIndex <= startIndex) {
                throw new IllegalStateException("Keywords not found or in incorrect order.");
            }

            // Extracting the substring between the keywords (excluding the keywords themselves)
            return Optional.of(input.substring(startIndex + startKeyword.length(), endIndex).trim());
        } catch (Exception e) {
            System.err.println("Error extracting between keywords: " + e.getMessage());
            return Optional.empty();
        }
    }

    public static void main(String[] args) {
        String original = "Hello, welcome to the world of Java programming!";

        // Example 1: Extract using indices
        Optional<String> byIndex = extractByIndex(original, 7, 14);
        byIndex.ifPresent(s -> System.out.println("Extracted by index: " + s));

        // Example 2: Extract between two keywords
        Optional<String> betweenKeywords = extractBetweenKeywords(original, "welcome", "world");
        betweenKeywords.ifPresent(s -> System.out.println("Extracted between keywords: " + s));
    }
}
