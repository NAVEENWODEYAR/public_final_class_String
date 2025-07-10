package com.string.code;

import java.util.*;
import java.util.stream.*;

/**
 * Temperature converter from Fahrenheit to Celsius with fever level classification.
 * Handles invalid input gracefully using exception handling.
 * 
 * Author: Naveen K Wodeyar
 * Date: 09-Jul-2025
 */

public class TemperatureConverterWithStreams {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Fahrenheit temperatures separated by spaces:");

        String input = scanner.nextLine();

        List<String> results = Arrays.stream(input.trim().split("\\s+"))
            .map(tempStr -> {
                try {
                    double f = Double.parseDouble(tempStr);
                    double celsius = (f - 32) * 5 / 9;
                    String level = getFeverLevel(celsius);
                    return String.format("%.2f°F = %.2f°C → %s", f, celsius, level);
                } catch (NumberFormatException e) {
                    return "Invalid input: '" + tempStr + "' is not a valid number.";
                }
            })
            .collect(Collectors.toList());

        results.forEach(System.out::println);
        scanner.close();
    }

    /**
     * Determines fever level based on Celsius temperature.
     */
    private static String getFeverLevel(double celsius) {
        if (celsius < 37.5) return "Normal temperature.";
        else if (celsius <= 38.3) return "Mild fever.";
        else if (celsius < 40.0) return "Moderate fever.";
        else return "High fever. Seek medical attention.";
    }
}
