package com.string.code;

import java.util.*;

/**
 * @author Naveen K Wodeyar
 * @date 05-Aug-2025
 * Bell Curve, a concept used in many areas, such as statistics, grading systems, employee evaluations, and more
 */

public class BellCurveDemo {

    public static void main(String[] args) {
System.out.println("Bell curve demo");
        Scanner scanner = new Scanner(System.in);

        // Input: Number of students
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        // Generate random scores (mean ~70, SD ~10)
        int[] scores = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            // Using Gaussian distribution (normal distribution)
            // mean = 70, std deviation = 10
            double score = 70 + 10 * random.nextGaussian();
            // Limit the score between 0 and 100
            scores[i] = (int) Math.max(0, Math.min(100, Math.round(score)));
        }

        // Calculate mean
        double sum = 0;
        for (int score : scores) {
            sum += score;
        }
        double mean = sum / n;

        // Calculate standard deviation
        double squaredDiffSum = 0;
        for (int score : scores) {
            squaredDiffSum += Math.pow(score - mean, 2);
        }
        double stdDev = Math.sqrt(squaredDiffSum / n);

        // Count how many fall within ±1σ, ±2σ, ±3σ
        int within1Sigma = 0, within2Sigma = 0, within3Sigma = 0;

        for (int score : scores) {
            double diff = Math.abs(score - mean);
            if (diff <= stdDev) within1Sigma++;
            if (diff <= 2 * stdDev) within2Sigma++;
            if (diff <= 3 * stdDev) within3Sigma++;
        }

        // Output results
        System.out.printf("\nMean Score: %.2f\n", mean);
        System.out.printf("Standard Deviation: %.2f\n", stdDev);

        System.out.printf("\nStudents within ±1σ: %d (%.2f%%)\n", within1Sigma, (within1Sigma * 100.0) / n);
        System.out.printf("Students within ±2σ: %d (%.2f%%)\n", within2Sigma, (within2Sigma * 100.0) / n);
        System.out.printf("Students within ±3σ: %d (%.2f%%)\n", within3Sigma, (within3Sigma * 100.0) / n);

        System.out.println("\nAll Student Scores:");
        System.out.println(Arrays.toString(scores));

        scanner.close();
    }
}
