package com.string.code;

import java.util.Scanner;

/**
 * @author Naveen K Wodeyar
 * @date 09-Aug-2025
 */

public class BusFareCalculator {

    public static double calculateFare(double distance) {
        double fare = 0.0;

        if (distance <= 0) {
            System.out.println("Invalid distance entered.");
        } else if (distance <= 5) {
            fare = 10.0; // Flat fare
        } else if (distance <= 15) {
            fare = distance * 2.0;
        } else if (distance <= 40) {
            fare = distance * 1.8;
        } else {
            fare = distance * 1.5;
        }

        return fare;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance in kilometers: ");
        double distance = scanner.nextDouble();

        double fare = calculateFare(distance);

        if (distance > 0) {
            System.out.printf("Total bus fare for %.2f km is ₹%.2f\n", distance, fare);
        }

        scanner.close();
    }
}
