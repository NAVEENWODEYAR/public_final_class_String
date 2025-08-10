package com.string.code.realWorld;

import java.util.Scanner;

/**
 * @author Naveen K Wodeyar
 * @date 10-Aug-2025
 */

public class LaptopPerformancePredictor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input RAM in GB
        System.out.print("Enter RAM size (in GB): ");
        int ram = scanner.nextInt();

        // Input Storage in GB
        System.out.print("Enter Storage size (in GB): ");
        int storage = scanner.nextInt();

        // Input Processor Type
        System.out.print("Enter Processor type (i3, i5, i7, Ryzen3, Ryzen5, Ryzen7): ");
        String processor = scanner.next();

        // Calculate performance score
        int performanceScore = calculatePerformanceScore(ram, storage, processor);

        // Predict performance level
        String performanceLevel = getPerformanceLevel(performanceScore);

        System.out.println("\nPredicted Laptop Performance: " + performanceLevel);
        System.out.println("Performance Score: " + performanceScore);

        scanner.close();
    }

    // Calculate a basic performance score
    public static int calculatePerformanceScore(int ram, int storage, String processor) {
        int score = 0;

        // RAM contribution
        if (ram >= 32) {
            score += 40;
        } else if (ram >= 16) {
            score += 30;
        } else if (ram >= 8) {
            score += 20;
        } else {
            score += 10;
        }

        // Storage contribution
        if (storage >= 1024) {
            score += 30;
        } else if (storage >= 512) {
            score += 20;
        } else {
            score += 10;
        }

        // Processor contribution
        switch (processor.toLowerCase()) {
            case "i7":
            case "ryzen7":
                score += 30;
                break;
            case "i5":
            case "ryzen5":
                score += 20;
                break;
            case "i3":
            case "ryzen3":
                score += 10;
                break;
            default:
                System.out.println("Unknown processor, assuming basic performance.");
                score += 5;
        }

        return score;
    }

    // Determine performance level based on score
    public static String getPerformanceLevel(int score) {
        if (score >= 80) {
            return "High";
        } else if (score >= 50) {
            return "Medium";
        } else {
            return "Low";
        }
    }
}
