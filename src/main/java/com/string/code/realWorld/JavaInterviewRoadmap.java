package com.string.code.realWorld;

/**
 * @author Naveen K Wodeyar
 * @date 17-Feb-2026
 */

public class JavaInterviewRoadmap {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("     JAVA INTERVIEW PREPARATION ROADMAP   ");
        System.out.println("==========================================\n");

        printSection("1. Core Java Fundamentals");
        printPoint("Data Types & Variables");
        printPoint("Operators");
        printPoint("Control Statements (if-else, loops, switch)");
        printPoint("Arrays & Strings");
        printPoint("OOP Concepts (Encapsulation, Inheritance, Polymorphism, Abstraction)");

        printSection("2. Collections Framework");
        printPoint("List (ArrayList, LinkedList)");
        printPoint("Set (HashSet, TreeSet)");
        printPoint("Map (HashMap, TreeMap, LinkedHashMap)");
        printPoint("Comparable vs Comparator");
        printPoint("HashMap vs ConcurrentHashMap");

        printSection("3. Exception Handling");
        printPoint("try-catch-finally");
        printPoint("throw vs throws");
        printPoint("Checked vs Unchecked Exceptions");
        printPoint("Custom Exceptions");

        printSection("4. Multithreading & Concurrency");
        printPoint("Thread class vs Runnable interface");
        printPoint("Synchronization");
        printPoint("wait(), notify(), notifyAll()");
        printPoint("ExecutorService");
        printPoint("Deadlock");
        printPoint("Volatile keyword");

        printSection("5. Java 8 Features");
        printPoint("Lambda Expressions");
        printPoint("Functional Interfaces");
        printPoint("Stream API");
        printPoint("Optional Class");
        printPoint("Method References");

        printSection("6. JVM Internals");
        printPoint("JVM Architecture");
        printPoint("Heap vs Stack Memory");
        printPoint("Garbage Collection");
        printPoint("ClassLoader");

        printSection("7. Design Patterns");
        printPoint("Singleton Pattern");
        printPoint("Factory Pattern");
        printPoint("Builder Pattern");
        printPoint("Observer Pattern");
        printPoint("Strategy Pattern");

        printSection("8. Data Structures & Algorithms");
        printPoint("Arrays & Strings");
        printPoint("Linked List");
        printPoint("Stack & Queue");
        printPoint("Recursion");
        printPoint("Sorting & Searching");
        printPoint("Trees & Graphs");
        printPoint("Dynamic Programming");

        printSection("9. Database & SQL");
        printPoint("Basic SQL Queries");
        printPoint("Joins & Indexing");
        printPoint("Normalization");
        printPoint("Transactions");

        printSection("10. Spring Boot (For Backend Roles)");
        printPoint("Dependency Injection");
        printPoint("REST APIs");
        printPoint("Spring Boot Basics");
        printPoint("JPA & Hibernate");
        printPoint("Microservices Basics");

        System.out.println("\n==========================================");
        System.out.println("      Suggested 8-Week Preparation Plan   ");
        System.out.println("==========================================");

        System.out.println("Week 1-2 : Core Java + OOP + Collections");
        System.out.println("Week 3-4 : Multithreading + Java 8 + JVM");
        System.out.println("Week 5-6 : DSA Practice (2-3 problems daily)");
        System.out.println("Week 7   : Spring Boot + SQL");
        System.out.println("Week 8   : Mock Interviews + Revision");

        System.out.println("\nAll the best for your Java Interview Preparation!");
    }

    public static void printSection(String title) {
        System.out.println("\n------------------------------------------");
        System.out.println(title);
        System.out.println("------------------------------------------");
    }

    public static void printPoint(String point) {
        System.out.println(" - " + point);
    }
}
