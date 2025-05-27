package com.string.series;

/**
 * @author Naveen K Wodeyar
 * @date 27-May-2025
 */

public class FilterWords {
    public static void main(String[] args) {
        String[] words = {"apple", "application", "banana", "grape"};
        String filter = "app";

        for (String word : words) {
            if (word.contains(filter)) {
                System.out.println("Match: " + word);
            }
        }
    }
}

