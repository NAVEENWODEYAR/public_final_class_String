package com.string.code;

import java.util.Scanner;

/**
 * @author Naveen K Wodeyar
 * @date 09-Jul-2025
 */

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Convert Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Display the result
        System.out.printf("%.2f Fahrenheit is %.2f Celsius.%n", fahrenheit, celsius);
        
        scanner.close();
    }
}

