package com.string.code;

/**
 * @author Naveen K Wodeyar
 * @date 22-Dec-2025
 */

public class CountVowelsUsingStreams {


    // Method to count vowels using Streams
    static int countVowels(String s) {
        return (int) s.toLowerCase()
                      .chars() // IntStream of characters
                      .filter(c -> c == 'a' || c == 'e' || c == 'i'
                                || c == 'o' || c == 'u')
                      .count();
    }

    // Test cases
    public static void main(String[] args) {
        System.out.println(countVowels("Interview")); // 4
        System.out.println(countVowels("Java"));      // 2
    }
}
