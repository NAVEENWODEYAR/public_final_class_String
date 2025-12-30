package com.string.code;

/**
 * @author Naveen K Wodeyar
 * @date 27-Dec-2025
 */

public class CountVowelsInterviewStreams {

    // Method to count vowels using streams
    public static long countVowels(String str) {
        return str.toLowerCase()
                  .chars() // converts String to IntStream
                  .filter(ch -> ch == 'a' || ch == 'e' || ch == 'i'
                             || ch == 'o' || ch == 'u')
                  .count();
    }

    // Main method with test cases
    public static void main(String[] args) {

        String[] testCases = {
            "Hello World",
            "Java",
            "AEIOU",
            "bcdfg",
            "",
            "Interview Question"
        };

        for (String test : testCases) {
            System.out.println(
                "Input: \"" + test + "\" -> Vowels: " + countVowels(test)
            );
        }
    }
}
