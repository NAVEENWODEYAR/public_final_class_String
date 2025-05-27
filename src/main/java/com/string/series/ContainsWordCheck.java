package com.string.series;

/**
 * @author Naveen K Wodeyar
 * @date 27-May-2025
 */

public class ContainsWordCheck {
    public static void main(String[] args) {
        String sentence = "Java is a powerful programming language";
        String word = "POWERFUL";

        boolean result = sentence.toLowerCase().contains(word.toLowerCase());
        System.out.println("Contains word: " + result); // Output: true
    }
}

