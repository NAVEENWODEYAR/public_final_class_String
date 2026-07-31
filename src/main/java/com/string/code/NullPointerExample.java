package com.string.code;

/**
 * NullPointerException Handling Example
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 *
 * @author Naveen K Wodeyar
 * @date 04-Nov-2025
 */
public class NullPointerExample {

    // Method that handles NullPointerException and continues execution
    public String processString(String text) {
        String result;

        try {
            int length = text.length();
            result = "Length of string: " + length;
        } catch (NullPointerException e) {
            result = "Caught a NullPointerException! The string was null.";
        }

        // Continue execution after exception handling
        System.out.println("Continuing execution inside the method...");
        return result;
    }

    // Helper method for LeetCode-style testing
    private static void test(NullPointerExample example, String input, String expected) {
        String actual = example.processString(input);

        boolean passed = actual.equals(expected);

        System.out.println("----------------------------------------");
        System.out.println("Input    : " + (input == null ? "null" : "\"" + input + "\""));
        System.out.println("Expected : " + expected);
        System.out.println("Output   : " + actual);
        System.out.println("Result   : " + (passed ? "✅ PASS" : "❌ FAIL"));
    }

    public static void main(String[] args) {

        NullPointerExample example = new NullPointerExample();

        System.out.println("========== NullPointerException Test Cases ==========\n");

        // Test Case 1: Null input
        test(example,
                null,
                "Caught a NullPointerException! The string was null.");

        // Test Case 2: Empty string
        test(example,
                "",
                "Length of string: 0");

        // Test Case 3: Single character
        test(example,
                "A",
                "Length of string: 1");

        // Test Case 4: Normal string
        test(example,
                "Hello",
                "Length of string: 5");

        // Test Case 5: String with spaces
        test(example,
                "Hello World",
                "Length of string: 11");

        // Test Case 6: Numbers
        test(example,
                "123456789",
                "Length of string: 9");

        // Test Case 7: Special characters
        test(example,
                "@#$%^&*",
                "Length of string: 7");

        // Test Case 8: Whitespace only
        test(example,
                "   ",
                "Length of string: 3");

        // Test Case 9: Long string
        test(example,
                "abcdefghijklmnopqrstuvwxyz",
                "Length of string: 26");

        // Test Case 10: Mixed characters
        test(example,
                "Java@2025!",
                "Length of string: 10");

        System.out.println("\nProgram continues after all test cases...");
    }
}