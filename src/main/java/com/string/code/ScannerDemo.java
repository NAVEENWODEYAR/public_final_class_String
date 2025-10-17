package com.string.code;

import java.util.Scanner;

/**
 * @author Naveen K Wodeyar
 * @date 16-Oct-2025
 */

public class ScannerDemo {
    public static void main(String[] args) {
        // Create a Scanner object to read input from keyboard
        Scanner scanner = new Scanner(System.in);

        // Read a string
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Read an integer
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Read a double
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        // Read a boolean
        System.out.print("Do you like Java? (true/false): ");
        boolean likesJava = scanner.nextBoolean();

        // Display the input
        System.out.println("\n--- User Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");
        System.out.println("Likes Java: " + likesJava);

        // Close the scanner
        scanner.close();
    }
}
