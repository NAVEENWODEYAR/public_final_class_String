package com.string.code;

import java.time.LocalDate;
import java.time.Period;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Naveen K Wodeyar
 * @date 12-Jul-2025
 */

public class PhysicalPredictor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Collect and validate input
            int year = getInput(scanner, "Enter your birth year (e.g. 2000): ", 1900, LocalDate.now().getYear());
            int month = getInput(scanner, "Enter your birth month (1-12): ", 1, 12);
            int day = getInput(scanner, "Enter your birth day (1-31): ", 1, 31); // Basic validation

            // Validate full date
            LocalDate dob;
            try {
                dob = LocalDate.of(year, month, day);
                if (dob.isAfter(LocalDate.now())) {
                    throw new IllegalArgumentException("Date of birth cannot be in the future.");
                }
            } catch (Exception e) {
                throw new IllegalArgumentException("Invalid date entered: " + e.getMessage());
            }

            // Calculate age
            int age = Period.between(dob, LocalDate.now()).getYears();

            // Generate mock physical traits
            int height = 150 + (year % 50) + (day % 10); // in cm
            int weight = 50 + (month * 2) + (day % 5);   // in kg

            String[] eyeColors = {"Brown", "Blue", "Green", "Hazel", "Gray"};
            String[] bodyTypes = {"Athletic", "Slim", "Average", "Heavy", "Muscular"};

            String eyeColor = eyeColors[year % eyeColors.length];
            String bodyType = bodyTypes[month % bodyTypes.length];

            // Output
            System.out.println("\n--- Mock Physical Prediction ---");
            System.out.println("Age: " + age + " years");
            System.out.println("Estimated Height: " + height + " cm");
            System.out.println("Estimated Weight: " + weight + " kg");
            System.out.println("Eye Color: " + eyeColor);
            System.out.println("Body Type: " + bodyType);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter numeric values only.");
        } catch (IllegalArgumentException e) {
            System.out.println("Input error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    /**
     * Get validated integer input within a range.
     */
    private static int getInput(Scanner scanner, String prompt, int min, int max) {
        int input;
        while (true) {
            try {
                System.out.print(prompt);
                input = scanner.nextInt();

                if (input < min || input > max) {
                    System.out.println("Please enter a value between " + min + " and " + max + ".");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next(); // Clear invalid input
            }
        }
        return input;
    }
}
