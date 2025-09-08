package com.string.code;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Naveen K Wodeyar
 * @date 08-Sept-2025
 */

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ======= Part 1: Manual use of trim() and substring() =======
        System.out.println("Enter a string with leading/trailing spaces:");
        String userInput = scanner.nextLine();

        // Trim the input string (removes leading and trailing spaces)
        String trimmed = userInput.trim();

        System.out.println("\n[Manual Operation]");
        System.out.println("Original: \"" + userInput + "\""); // shows original input
        System.out.println("Trimmed:  \"" + trimmed + "\"");   // shows trimmed input

        // Check if the trimmed string has at least 5 characters to extract substring
        if (trimmed.length() >= 5) {
            // Extract substring from index 0 to 4 (5 characters)
            System.out.println("Substring (0, 5): \"" + trimmed.substring(0, 5) + "\"");
        } else {
            System.out.println("String too short for substring(0, 5)");
        }

        // Find and print the last word in the string
        int lastSpace = trimmed.lastIndexOf(" ");
        if (lastSpace != -1 && lastSpace < trimmed.length() - 1) {
            // Extract substring from character after last space to the end
            System.out.println("Last word: \"" + trimmed.substring(lastSpace + 1) + "\"");
        }

        // ======= Part 2: Java 8 Stream API for multiple strings =======
        System.out.println("\nEnter multiple strings (comma-separated):");
        String multiInput = scanner.nextLine();

        System.out.println("\n[Stream API Operation]");

        // Split the input string by comma and convert to Stream
        List<String> cleanedStrings = Arrays.stream(multiInput.split(","))
                .map(String::trim)                  // Trim each individual string
                .filter(s -> !s.isEmpty())          // Filter out any empty strings
                .collect(Collectors.toList());      // Collect into a List

        // Loop through each trimmed string
        cleanedStrings.forEach(str -> {
            System.out.println("Trimmed: \"" + str + "\"");

            // Extract and print first 4 characters if length allows
            if (str.length() >= 4) {
                System.out.println("Substring (0, 4): \"" + str.substring(0, 4) + "\"");
            }

            // Extract and print the last word
            int space = str.lastIndexOf(" ");
            if (space != -1 && space < str.length() - 1) {
                System.out.println("Last word: \"" + str.substring(space + 1) + "\"");
            }

            System.out.println("------"); // separator between strings
        });

        // Close the Scanner
        scanner.close();
    }
}

