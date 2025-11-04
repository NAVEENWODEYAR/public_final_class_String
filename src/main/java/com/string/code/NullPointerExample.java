package com.string.code;

/**
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

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        String output = example.processString(null);  // Passing null
        System.out.println(output);

        System.out.println("Program continues after method call...");
    }
}
