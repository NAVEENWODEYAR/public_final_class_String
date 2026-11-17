package com.string.exptn;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Naveen K Wodeyar
 * @date 17-Nov-2026
 */

public class ExceptionAndErrorDemo {

    public static void main(String[] args) {
        System.out.println("=== 1. UNCHECKED EXCEPTION (Runtime Exception) ===");
        // ArithmeticException is a RuntimeException. The compiler doesn't force you to catch it.
        try {
            int result = 10 / 0; // Throws ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught Unchecked Exception: " + e.getMessage());
        }

        System.out.println("\n=== 2. CHECKED EXCEPTION (Compile-time Exception) ===");
        // FileNotFoundException is a Checked Exception. The compiler forces handling (try-catch or throws).
        try {
            File nonExistentFile = new File("non_existent_file.txt");
            Scanner scanner = new Scanner(nonExistentFile);
        } catch (FileNotFoundException e) {
            System.out.println("Caught Checked Exception: File not found!");
        }

        System.out.println("\n=== 3. ERROR (Serious System Problem) ===");
        // Errors indicate serious problems (like running out of memory) that normal apps shouldn't try to catch.
        try {
            causeStackOverflow(1);
        } catch (StackOverflowError e) {
            System.out.println("Caught Error: Stack Overflow! (Though typically, you shouldn't try to catch Errors).");
        }

        System.out.println("\nProgram finished successfully without crashing.");
    }

    // A recursive method with no base case to intentionally trigger a StackOverflowError
    public static void causeStackOverflow(int i) {
        causeStackOverflow(i + 1);
    }
}