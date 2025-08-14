package com.string.code.realWorld;

import java.util.Scanner;

/**
 * @author Naveen K Wodeyar
 * @date 14-Aug-2025
 */

public class MarriageMaturityChecker {

    public static boolean checkAgeCriteria(int age, String gender) {
        if (gender.equalsIgnoreCase("male")) {
            return age >= 21;
        } else if (gender.equalsIgnoreCase("female")) {
            return age >= 18;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Marriage Maturity Checker ===");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();  // consume newline

        System.out.print("Enter your gender (male/female): ");
        String gender = scanner.nextLine();

        System.out.println("\nAnswer the following questions with 'yes' or 'no':");

        System.out.print("Are you emotionally ready for long-term commitment? ");
        String emotionalInput = scanner.nextLine().trim().toLowerCase();
        boolean emotionalReady = emotionalInput.equals("yes");

        System.out.print("Do you have a stable source of income? ");
        String financialInput = scanner.nextLine().trim().toLowerCase();
        boolean financiallyStable = financialInput.equals("yes");

        System.out.print("Can you take responsibility for a family? ");
        String responsibilityInput = scanner.nextLine().trim().toLowerCase();
        boolean responsible = responsibilityInput.equals("yes");

        boolean ageOk = checkAgeCriteria(age, gender);

        int maturityScore = 0;
        if (ageOk) maturityScore++;
        if (emotionalReady) maturityScore++;
        if (financiallyStable) maturityScore++;
        if (responsible) maturityScore++;

        System.out.println("\n--- Evaluation Result ---");
        if (maturityScore == 4) {
            System.out.println("✅ You appear mature and ready for marriage.");
        } else if (maturityScore >= 2) {
            System.out.println("⚠️ You may need to work on some areas before considering marriage.");
        } else {
            System.out.println("❌ You might not be ready for marriage yet.");
        }

        scanner.close();
    }
}
