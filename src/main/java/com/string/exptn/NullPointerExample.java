package com.string.exptn;

import java.util.Optional;

/**
 * @author Naveen K Wodeyar
 * @date 16-Jul-2025
 */

public class NullPointerExample {

    // Method that might return null
    static String getUserName(boolean returnNull) {
        return returnNull ? null : "Alice";
    }

    public static void main(String[] args) {
        // CASE 1: Causes NullPointerException
        try {
            String name1 = getUserName(true);
            System.out.println("Name length: " + name1.length()); // NPE here
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException in Case 1!");
        }

        // CASE 2: Handling with null check
        String name2 = getUserName(true);
        if (name2 != null) {
            System.out.println("Name length: " + name2.length());
        } else {
            System.out.println("Name is null in Case 2.");
        }

        // CASE 3: Using Optional to avoid NPE
        Optional<String> optionalName = Optional.ofNullable(getUserName(true));
        int length = optionalName.map(String::length).orElse(0);
        System.out.println("Name length using Optional: " + length);

        // CASE 4: Default fallback using ternary
        String name4 = getUserName(true);
        int len = (name4 != null) ? name4.length() : -1;
        System.out.println("Name length using ternary: " + len);
    }
}
