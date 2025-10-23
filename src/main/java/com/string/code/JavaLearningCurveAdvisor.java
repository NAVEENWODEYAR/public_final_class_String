package com.string.code;

import java.util.Scanner;

/**
 * @author Naveen K Wodeyar
 * @date 23-Oct-2025
 */

public class JavaLearningCurveAdvisor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===========================================");
        System.out.println("     Java Developer Learning Curve Guide    ");
        System.out.println("===========================================");
        System.out.println("Select your current experience level:");
        System.out.println("1. Beginner");
        System.out.println("2. Intermediate");
        System.out.println("3. Advanced");
        System.out.print("Enter your choice (1-3): ");

        int choice = scanner.nextInt();
        System.out.println();

        switch (choice) {
            case 1:
                showBeginnerPath();
                break;
            case 2:
                showIntermediatePath();
                break;
            case 3:
                showAdvancedPath();
                break;
            default:
                System.out.println("Invalid choice! Please restart and enter a valid option.");
        }

        scanner.close();
    }

    private static void showBeginnerPath() {
        System.out.println("🔰 BEGINNER LEARNING PATH 🔰");
        System.out.println("-------------------------------------------");
        System.out.println("1. Learn Java Basics:");
        System.out.println("   - Syntax, Variables, Data Types, Operators");
        System.out.println("   - Control Statements (if, switch, loops)");
        System.out.println("   - Methods and Functions");
        System.out.println();
        System.out.println("2. Object-Oriented Programming (OOP):");
        System.out.println("   - Classes, Objects, Constructors");
        System.out.println("   - Inheritance, Polymorphism, Encapsulation, Abstraction");
        System.out.println();
        System.out.println("3. Practice with small projects:");
        System.out.println("   - Calculator, Banking System, or Library Management");
        System.out.println();
        System.out.println("4. Learn IDE & Tools:");
        System.out.println("   - IntelliJ IDEA / Eclipse / VS Code");
        System.out.println("   - Git & GitHub basics");
    }

    private static void showIntermediatePath() {
        System.out.println("⚙️ INTERMEDIATE LEARNING PATH ⚙️");
        System.out.println("-------------------------------------------");
        System.out.println("1. Java Collections Framework");
        System.out.println("2. Exception Handling & Java I/O");
        System.out.println("3. Generics, Enums, and Annotations");
        System.out.println("4. Java 8+ Features:");
        System.out.println("   - Streams, Lambda Expressions, Functional Interfaces");
        System.out.println("5. JDBC and Database Connectivity");
        System.out.println("6. Unit Testing (JUnit, Mockito)");
        System.out.println("7. Build Tools: Maven or Gradle");
        System.out.println();
        System.out.println("💡 Project Ideas:");
        System.out.println("   - REST API using Java");
        System.out.println("   - CRUD Application with JDBC/MySQL");
    }

    private static void showAdvancedPath() {
        System.out.println("🚀 ADVANCED LEARNING PATH 🚀");
        System.out.println("-------------------------------------------");
        System.out.println("1. Advanced Java Topics:");
        System.out.println("   - Multithreading & Concurrency");
        System.out.println("   - Design Patterns (Singleton, Factory, Builder, etc.)");
        System.out.println("   - JVM Internals, Garbage Collection, Performance Tuning");
        System.out.println();
        System.out.println("2. Frameworks & Tools:");
        System.out.println("   - Spring, Spring Boot, Hibernate");
        System.out.println("   - RESTful and Microservices Architecture");
        System.out.println("   - Security (JWT, OAuth2)");
        System.out.println();
        System.out.println("3. DevOps & Deployment:");
        System.out.println("   - Docker, Kubernetes, CI/CD basics");
        System.out.println("   - Cloud (AWS, Azure, GCP)");
        System.out.println();
        System.out.println("4. System Design & Architecture:");
        System.out.println("   - SOLID Principles, Design Thinking, Scalable Systems");
        System.out.println();
        System.out.println("💡 Advanced Project Ideas:");
        System.out.println("   - E-commerce Microservices Backend");
        System.out.println("   - Real-time Chat or Booking System");
    }
}
