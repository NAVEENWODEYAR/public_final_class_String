package com.string.code;

/**
 * @author Naveen K Wodeyar
 * @date 18-Jun-2025
 */

public class StringProcessor {

    public String processText(String input) {
        String cleaned = cleanInput(input);
        String reversed = reverseString(cleaned);
        return toUpperCase(reversed);
    }

    private String cleanInput(String input) {
        return input.trim().replaceAll("\\s+", " ");
    }

    private String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    private String toUpperCase(String input) {
        return input.toUpperCase();
    }
}
