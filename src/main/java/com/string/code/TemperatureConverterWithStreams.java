package com.string.code;

import java.util.*;
import java.util.stream.*;

/**
 * @author Naveen K Wodeyar
 * @date 09-Jul-2025
 */

public class TemperatureConverterWithStreams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for multiple temperatures
        System.out.println("Enter Fahrenheit temperatures separated by spaces:");
        String input = scanner.nextLine();

        // Split input and process using streams
        List<String> results = Arrays.stream(input.split("\\s+"))
            .map(Double::parseDouble)
            .map(f -> {
                double celsius = (f - 32) * 5 / 9;
                String level = getFeverLevel(celsius);
                return String.format("%.2f°F = %.2f°C → %s", f, celsius, level);
            })
            .collect(Collectors.toList());

        // Display results
        results.forEach(System.out::println);

        scanner.close();
    }

    // Fever level logic
    private static String getFeverLevel(double celsius) {
        if (celsius < 37.5) return "Normal temperature.";
        else if (celsius <= 38.3) return "Mild fever.";
        else if (celsius < 40.0) return "Moderate fever.";
        else return "High fever. Seek medical attention.";
    }
}

