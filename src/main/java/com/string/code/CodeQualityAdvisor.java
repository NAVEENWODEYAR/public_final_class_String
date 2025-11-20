package com.string.code;

import java.util.Scanner;

/**
 * @author Naveen K Wodeyar
 * @date 21-Nov-2025
 */

public class CodeQualityAdvisor {

    public static String advise(String topic) {
        switch (topic.toLowerCase()) {
            case "method length":
            case "function length":
                return "Keep methods short (ideally 20–30 lines). One method should do one thing (SRP). Split long methods into smaller reusable helpers.";

            case "class size":
                return "A class should remain focused and cohesive. Prefer keeping classes under ~300 lines and ensure they have a single responsibility.";

            case "cyclomatic complexity":
                return "Avoid high complexity (>10). Reduce nested loops/conditions by refactoring into smaller methods or using polymorphism.";

            case "naming":
                return "Use clear, descriptive names. Classes: nouns. Methods: verbs. Avoid abbreviations.";

            default:
                return "Unknown topic. Try: method length, class size, cyclomatic complexity, naming.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Code Quality Best Practices Advisor ===");
        System.out.print("Enter a topic (method length, class size, cyclomatic complexity, naming): ");

        String topic = scanner.nextLine();
        System.out.println("\nAdvice: " + advise(topic));

        scanner.close();
    }
}
