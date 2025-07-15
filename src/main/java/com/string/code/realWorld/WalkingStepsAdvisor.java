package com.string.code.realWorld;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 * @author Naveen K Wodeyar
 * @date 14-Jul-2025
 */

public class WalkingStepsAdvisor {

    public static void main(String[] args) {
        System.out.println("========== Running Built-in Test Cases ==========");
        runTestCases();

        System.out.println("\n========== Interactive Mode ==========");
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your height in cm: ");
            double heightCm = Double.parseDouble(scanner.nextLine());
            validatePositive(heightCm, "Height");

            System.out.print("Enter your weight in kg: ");
            double weightKg = Double.parseDouble(scanner.nextLine());
            validatePositive(weightKg, "Weight");

            System.out.print("Enter your date of birth (yyyy-mm-dd): ");
            String dobInput = scanner.nextLine();
            LocalDate dob = LocalDate.parse(dobInput);
            validateDOB(dob);

            evaluate(heightCm, weightKg, dob);

        } catch (NumberFormatException e) {
            System.err.println("Invalid number input. Please enter numeric values.");
        } catch (DateTimeParseException e) {
            System.err.println("Invalid date format. Use yyyy-mm-dd.");
        } catch (IllegalArgumentException e) {
            System.err.println("Input error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static void runTestCases() {
        Object[][] testCases = {
                {170, 85, "1990-06-15"},
                {165, 60, "1995-01-10"},
                {160, 100, "1985-09-01"},
                {180, 55, "2000-05-22"},
                {175, 76.4, "1998-11-20"},
                {155, 70, "2010-07-14"},
                {160, 70, "1950-01-01"},
                {170, 70, "2030-01-01"},       // Invalid DOB
                {160, -60, "1995-05-05"},      // Invalid weight
                {150, 50, "1800-01-01"}        // Unrealistic age
        };

        for (int i = 0; i < testCases.length; i++) {
            System.out.println("\nTest Case " + (i + 1) + ":");
            try {
                double height = (double) testCases[i][0];
                double weight = (double) testCases[i][1];
                LocalDate dob = LocalDate.parse((String) testCases[i][2]);

                validatePositive(height, "Height");
                validatePositive(weight, "Weight");
                validateDOB(dob);

                evaluate(height, weight, dob);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private static void evaluate(double heightCm, double weightKg, LocalDate dob) {
        int age = calculateAge(dob);
        double idealWeight = calculateIdealWeight(heightCm);
        double weightToLose = weightKg - idealWeight;

        if (weightToLose <= 0) {
            System.out.println("You're already within a healthy weight range for your height.");
        } else {
            int dailySteps = calculateWalkingSteps(weightToLose);
            System.out.printf("Ideal weight: %.1f kg%n", idealWeight);
            System.out.printf("You need to lose approx %.1f kg%n", weightToLose);
            System.out.printf("Recommended walking steps/day: %d%n", dailySteps);
        }

        System.out.printf("Your age: %d years%n", age);
    }

    private static void validatePositive(double value, String fieldName) {
        if (value <= 0) {
            throw new IllegalArgumentException(fieldName + " must be a positive number.");
        }
    }

    private static void validateDOB(LocalDate dob) {
        LocalDate today = LocalDate.now();
        if (dob.isAfter(today)) {
            throw new IllegalArgumentException("Date of birth cannot be in the future.");
        }

        int age = Period.between(dob, today).getYears();
        if (age < 5 || age > 120) {
            throw new IllegalArgumentException("Age must be between 5 and 120 years.");
        }
    }

    private static int calculateAge(LocalDate dob) {
        return Period.between(dob, LocalDate.now()).getYears();
    }

    private static double calculateIdealWeight(double heightCm) {
        double heightM = heightCm / 100;
        double idealBMI = 22.0;
        return idealBMI * heightM * heightM;
    }

    private static int calculateWalkingSteps(double weightToLoseKg) {
        double totalCaloriesToBurn = weightToLoseKg * 7700; // kcal
        double days = 90; // 3 months
        double dailyCalories = totalCaloriesToBurn / days;
        return (int) Math.ceil(dailyCalories / 0.04); // ~40 kcal per 1000 steps = 0.04 kcal per step
    }
}
