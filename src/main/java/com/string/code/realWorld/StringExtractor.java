package com.string.code.realWorld;

import java.util.Optional;

/**
 * Program: String Extractor with LeetCode-Style Test Cases
 *
 * @author Naveen K Wodeyar
 * @date 07-Sept-2025
 */

public class StringExtractor {

    // Method 1: Extract substring using start and end index
    public static Optional<String> extractByIndex(String input, int start, int end) {
        try {
            if (input == null)
                throw new IllegalArgumentException("Input string is null.");

            if (start < 0 || end > input.length() || start >= end)
                throw new IndexOutOfBoundsException("Invalid start or end indices.");

            return Optional.of(input.substring(start, end));

        } catch (Exception e) {
            System.err.println("Error extracting by index: " + e.getMessage());
            return Optional.empty();
        }
    }

    // Method 2: Extract substring between two keywords
    public static Optional<String> extractBetweenKeywords(String input,
                                                          String startKeyword,
                                                          String endKeyword) {
        try {
            if (input == null || startKeyword == null || endKeyword == null)
                throw new IllegalArgumentException("Input or keywords cannot be null.");

            int startIndex = input.indexOf(startKeyword);
            int endIndex = input.indexOf(endKeyword,
                    startIndex + startKeyword.length());

            if (startIndex == -1 || endIndex == -1 || endIndex <= startIndex)
                throw new IllegalStateException("Keywords not found or in incorrect order.");

            return Optional.of(
                    input.substring(startIndex + startKeyword.length(), endIndex).trim());

        } catch (Exception e) {
            System.err.println("Error extracting between keywords: " + e.getMessage());
            return Optional.empty();
        }
    }

    public static void main(String[] args) {

        String original = "Hello, welcome to the world of Java programming!";

        // ==========================================================
        // Example Execution
        // ==========================================================
        System.out.println("Example Execution");
        System.out.println("---------------------------------------");

        Optional<String> byIndex = extractByIndex(original, 7, 14);
        byIndex.ifPresent(s -> System.out.println("Extracted by index: " + s));

        Optional<String> betweenKeywords =
                extractBetweenKeywords(original, "welcome", "world");
        betweenKeywords.ifPresent(s ->
                System.out.println("Extracted between keywords: " + s));

        // ==========================================================
        // LeetCode Style Test Cases
        // ==========================================================
        System.out.println("\n========================================");
        System.out.println("Running Test Cases");
        System.out.println("========================================");

        int passed = 0;
        int total = 8;

        // ---------------- Test Case 1 ----------------
        Optional<String> result1 = extractByIndex(original, 7, 14);
        String expected1 = "welcome";
        boolean pass1 = result1.isPresent() && result1.get().equals(expected1);
        System.out.println("Test Case 1");
        System.out.println("Method   : extractByIndex");
        System.out.println("Expected : " + expected1);
        System.out.println("Output   : " + result1.orElse("Empty"));
        System.out.println("Status   : " + (pass1 ? "PASS" : "FAIL"));
        System.out.println("----------------------------------------");
        if (pass1) passed++;

        // ---------------- Test Case 2 ----------------
        Optional<String> result2 = extractByIndex(original, 0, 5);
        String expected2 = "Hello";
        boolean pass2 = result2.isPresent() && result2.get().equals(expected2);
        System.out.println("Test Case 2");
        System.out.println("Method   : extractByIndex");
        System.out.println("Expected : " + expected2);
        System.out.println("Output   : " + result2.orElse("Empty"));
        System.out.println("Status   : " + (pass2 ? "PASS" : "FAIL"));
        System.out.println("----------------------------------------");
        if (pass2) passed++;

        // ---------------- Test Case 3 ----------------
        Optional<String> result3 = extractByIndex(original, -1, 5);
        boolean pass3 = result3.isEmpty();
        System.out.println("Test Case 3");
        System.out.println("Method   : extractByIndex");
        System.out.println("Expected : Empty");
        System.out.println("Output   : " + result3.orElse("Empty"));
        System.out.println("Status   : " + (pass3 ? "PASS" : "FAIL"));
        System.out.println("----------------------------------------");
        if (pass3) passed++;

        // ---------------- Test Case 4 ----------------
        Optional<String> result4 =
                extractBetweenKeywords(original, "welcome", "world");
        String expected4 = "to the";
        boolean pass4 = result4.isPresent() && result4.get().equals(expected4);
        System.out.println("Test Case 4");
        System.out.println("Method   : extractBetweenKeywords");
        System.out.println("Expected : " + expected4);
        System.out.println("Output   : " + result4.orElse("Empty"));
        System.out.println("Status   : " + (pass4 ? "PASS" : "FAIL"));
        System.out.println("----------------------------------------");
        if (pass4) passed++;

        // ---------------- Test Case 5 ----------------
        Optional<String> result5 =
                extractBetweenKeywords(original, "Hello,", "Java");
        String expected5 = "welcome to the world of";
        boolean pass5 = result5.isPresent() && result5.get().equals(expected5);
        System.out.println("Test Case 5");
        System.out.println("Method   : extractBetweenKeywords");
        System.out.println("Expected : " + expected5);
        System.out.println("Output   : " + result5.orElse("Empty"));
        System.out.println("Status   : " + (pass5 ? "PASS" : "FAIL"));
        System.out.println("----------------------------------------");
        if (pass5) passed++;

        // ---------------- Test Case 6 ----------------
        Optional<String> result6 =
                extractBetweenKeywords(original, "Python", "Java");
        boolean pass6 = result6.isEmpty();
        System.out.println("Test Case 6");
        System.out.println("Method   : extractBetweenKeywords");
        System.out.println("Expected : Empty");
        System.out.println("Output   : " + result6.orElse("Empty"));
        System.out.println("Status   : " + (pass6 ? "PASS" : "FAIL"));
        System.out.println("----------------------------------------");
        if (pass6) passed++;

        // ---------------- Test Case 7 ----------------
        Optional<String> result7 =
                extractBetweenKeywords(original, "Java", "welcome");
        boolean pass7 = result7.isEmpty();
        System.out.println("Test Case 7");
        System.out.println("Method   : extractBetweenKeywords");
        System.out.println("Expected : Empty");
        System.out.println("Output   : " + result7.orElse("Empty"));
        System.out.println("Status   : " + (pass7 ? "PASS" : "FAIL"));
        System.out.println("----------------------------------------");
        if (pass7) passed++;

        // ---------------- Test Case 8 ----------------
        Optional<String> result8 = extractByIndex(null, 0, 5);
        boolean pass8 = result8.isEmpty();
        System.out.println("Test Case 8");
        System.out.println("Method   : extractByIndex");
        System.out.println("Expected : Empty");
        System.out.println("Output   : " + result8.orElse("Empty"));
        System.out.println("Status   : " + (pass8 ? "PASS" : "FAIL"));
        System.out.println("----------------------------------------");
        if (pass8) passed++;

        // ==========================================================
        // Summary
        // ==========================================================
        System.out.println("\n========================================");
        System.out.println("Summary");
        System.out.println("========================================");
        System.out.println("Passed: " + passed + "/" + total + " Test Cases");
    }
}