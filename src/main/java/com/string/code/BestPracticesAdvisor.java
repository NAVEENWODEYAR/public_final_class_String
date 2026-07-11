package com.string.code;

import java.util.Scanner;

/**
 * @author Naveen K Wodeyar
 * @date 20-Nov-2025
 */

public class BestPracticesAdvisor {

    public static String getBestPractice(String topic) {
        switch (topic.toLowerCase()) {
            case "clean code":
                return "Use meaningful variable names, write small methods, and avoid duplication.";
            case "testing":
                return "Write unit tests, follow AAA (Arrange-Act-Assert), and test edge cases.";
            case "performance":
                return "Use efficient data structures, avoid unnecessary computations, and profile your code.";
            case "security":
                return "Validate inputs, use encryption, and avoid hard-coding credentials.";
            case "oop":
                return "Follow SOLID principles, encapsulation, and prefer composition over inheritance.";
            default:
                return "Unknown topic. Try: clean code, testing, performance, security, oop.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Best/Standard Programming Practices Advisor ===");
        System.out.print("Enter a topic (clean code, testing, performance, security, oop): ");
        String topic = scanner.nextLine();

        String suggestion = getBestPractice(topic);
        System.out.println("\nSuggestion: " + suggestion);

        scanner.close();
    }
}
