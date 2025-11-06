package com.string.code;

/**
 * @author Naveen K Wodeyar
 * @date 06-Nov-2025
 */

public class CheckStringContent {

    /**
     * Checks whether a string is not null and has length greater than 1.
     *
     * @param str The input string to check.
     * @return true if the string is not null and length > 1, false otherwise.
     */
    public static boolean hasContentGreaterThanOne(String str) {
        return str != null && str.length() > 1;
    }

    public static void main(String[] args) {
        String[] testStrings = {null, "", "A", "{}", "Hello"};

        for (String s : testStrings) {
            System.out.println("String: " + s + " => " + hasContentGreaterThanOne(s));
        }
    }
}
