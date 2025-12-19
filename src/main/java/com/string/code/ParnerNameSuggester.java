package com.string.code;

/**
 * @author Naveen K Wodeyar
 * @date 19-Dec-2025
 */

public class ParnerNameSuggester {

    public static String suggestPartner(String name, String gender) {
        if (name == null || gender == null) {
            return "Invalid input";
        }

        // Normalize gender input
        gender = gender.toLowerCase();

        String[] maleNames = {
            "Arjun", "Rahul", "Aman", "Rohit", "Karan"
        };

        String[] femaleNames = {
            "Ananya", "Priya", "Sneha", "Kavya", "Riya"
        };

        int index = name.length() % 5; // keeps index in range 0–4

        if (gender.equals("male")) {
            return femaleNames[index];
        } else if (gender.equals("female")) {
            return maleNames[index];
        } else {
            return "Invalid gender";
        }
    }

    // LeetCode-style test runner
    public static void main(String[] args) {
        System.out.println("Test Case 1:");
        System.out.println(suggestPartner("Rahul", "Male")); 
        // Expected: A female name

        System.out.println("\nTest Case 2:");
        System.out.println(suggestPartner("Anita", "Female")); 
        // Expected: A male name

        System.out.println("\nTest Case 3:");
        System.out.println(suggestPartner("Sam", "Male"));

        System.out.println("\nTest Case 4:");
        System.out.println(suggestPartner("Riya", "Female"));

        System.out.println("\nTest Case 5 (Invalid Gender):");
        System.out.println(suggestPartner("Alex", "Other"));

        System.out.println("\nTest Case 6 (Null Input):");
        System.out.println(suggestPartner(null, "Male"));
    }
}
