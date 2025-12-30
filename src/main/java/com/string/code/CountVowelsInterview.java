package com.string.code;

/**
 * @author Naveen K Wodeyar
 * @date 26-Dec-2025
 */

public class CountVowelsInterview {

    // Method to count vowels in a string
    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || 
            		ch == 'e' || 
            		ch == 'i' ||
                ch == 'o' || 
                ch == 'u') {
                count++;
            }
        }
        return count;
    }

    // Main method with test cases
    public static void main(String[] args) {

        String[] testCases = {
            "Hello World",
            "Java",
            "AEIOU",
            "bcdfg",
            "",
            "Interview Question",
            "Vowels"
        };

        for (int i = 0; i < testCases.length; i++) {
            System.out.println(
                "Input: \"" + testCases[i] + "\" -> Vowels: " +
                countVowels(testCases[i])
            );
        }
    }
}
