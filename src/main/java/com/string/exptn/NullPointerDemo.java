package com.string.exptn;

/**
 * @author Naveen K Wodeyar
 * @date 02-Aug-2025
 */

public class NullPointerDemo {

    public static void main(String[] args) {

        String text = null; // Intentionally set to null

        try {
            // This line will throw NullPointerException
            int length = text.length();
            System.out.println("Length of the string: " + length);

        } catch (NullPointerException e) {
            // Handling the exception
            System.out.println("Caught a NullPointerException!");
            System.out.println("Message: " + e.getMessage());
        }

        // Continue with rest of the program
        System.out.println("Program continues after exception handling.");
    }
}
