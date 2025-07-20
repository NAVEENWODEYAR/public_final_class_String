package com.string.err;

import java.io.*;

/**
 * @author Naveen K Wodeyar
 * @date 17-Jul-2025
 */

public class ErrorVsExceptionDemo {

    public static void main(String[] args) {

        // 1. Unchecked Exception (RuntimeException)
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Accessing index 5: " + numbers[5]); // Causes ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Unchecked Exception: " + e);
        }

        // 2. Checked Exception
        try {
            readFile("non_existing_file.txt"); // Might throw FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.println("Caught Checked Exception: " + e);
        }

        // 3. Error (not usually caught, but can be)
        try {
            causeStackOverflow(); // Causes StackOverflowError
        } catch (StackOverflowError e) {
            System.out.println("Caught Error (not recommended to catch in real code): " + e);
        }

        System.out.println("Program continues after handling exceptions and errors.");
    }

    // Method to demonstrate Checked Exception
    public static void readFile(String fileName) throws FileNotFoundException {
        FileReader file = new FileReader(fileName);
    }

    // Method to demonstrate Error
    public static void causeStackOverflow() {
        causeStackOverflow(); // Infinite recursion
    }
}
