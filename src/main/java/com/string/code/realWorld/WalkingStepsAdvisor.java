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

            int age = calculateAge(dob);
            double idealWeight = calculateIdealWeight(heightCm);
            double weightToLose = weightKg - idealWeight;

            if (weightToLose <= 0) {
                System.out.println("You're already within a healthy weight range for your height.");
            } else {
                int dailySteps = calculateWalkingSteps(weightToLose);
                System.out.printf("To reach a healthy weight (%.1f kg), you need to lose approximately %.1f kg.%n", idealWeight, weightToLose);
                System.out.printf("You should walk about %d steps per day (along with a proper diet) to lose weight safely.%n", dailySteps);
            }

            System.out.printf("Your age: %d years%n", age);

        } catch (NumberFormatException e) {
            System.err.println("Invalid number input. Please enter numeric values for height and weight.");
        } catch (DateTimeParseException e) {
            System.err.println("Invalid date format. Please use yyyy-mm-dd.");
        } catch (IllegalArgumentException e) {
            System.err.println("Input error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Validates that a number is positive
    private static void validatePositive(double value, String fieldName) {
        if (value <= 0) {
            throw new IllegalArgumentException(fieldName + " must be a positive number.");
        }
    }

    // Validates DOB is in the past and age is realistic
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

    // Calculate age
    private static int calculateAge(LocalDate dob) {
        return Period.between(dob, LocalDate.now()).getYears();
    }

    // Calculate ideal weight using BMI = 22 (a mid-value of healthy range)
    private static double calculateIdealWeight(double heightCm) {
        double heightM = heightCm / 100;
        double idealBMI = 22.0;
        return idealBMI * heightM * heightM;
    }

    // Calculate recommended steps per day based on weight loss goal
    private static int calculateWalkingSteps(double weightToLoseKg) {
        double totalCaloriesToBurn = weightToLoseKg * 7700; // kcal
        double days = 90; // Target to lose weight in 3 months
        double dailyCalories = totalCaloriesToBurn / days;
        return (int) Math.ceil(dailyCalories / 0.04); // 0.04 kcal per step
    }
}
