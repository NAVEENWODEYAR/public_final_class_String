package com.string.code;

/**
 * @author Naveen K Wodeyar
 * @date 18-Jun-2025
 */

public class UserInputProcessor {

    public String processInput(String input) {
        if (input == null || input.isEmpty()) {
            return "INVALID_INPUT";
        }

        String sanitized = sanitize(input);
        String formatted = formatCase(sanitized);
        return addPrefixIfNeeded(formatted);
    }

    private String sanitize(String input) {
        return input.trim().replaceAll("[^a-zA-Z0-9 ]", "");
    }

    private String formatCase(String input) {
        if (input.equals(input.toUpperCase())) {
            return input.toLowerCase();
        } else {
            return input.toUpperCase();
        }
    }

    private String addPrefixIfNeeded(String input) {
        if (input.length() > 10) {
            return "LONG_" + input;
        } else {
            return "SHORT_" + input;
        }
    }
}
