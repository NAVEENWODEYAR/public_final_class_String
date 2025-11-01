package com.string.code.realWorld;

import java.util.*;

/**
 * @author Naveen K Wodeyar
 * @date 29-Oct-2025
 */

public class ResumeKeywordSuggester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get user input
        System.out.println("=== Java Developer Resume Keyword Suggester ===");
        System.out.print("Enter your experience level (junior/mid/senior): ");
        String level = scanner.nextLine().toLowerCase();

        System.out.print("Enter your areas of expertise (comma-separated, e.g. Spring, Microservices, REST): ");
        String[] skillsInput = scanner.nextLine().toLowerCase().split(",");

        Set<String> skills = new HashSet<>();
        for (String skill : skillsInput) {
            skills.add(skill.trim());
        }

        // Step 2: Define keyword database
        Map<String, List<String>> baseKeywords = new HashMap<>();
        baseKeywords.put("common", Arrays.asList(
                "Java", "OOP", "Data Structures", "Algorithms", "Version Control", "Git",
                "Agile", "REST APIs", "Unit Testing", "Debugging", "Clean Code"
        ));
        baseKeywords.put("junior", Arrays.asList(
                "Core Java", "Collections Framework", "Multithreading", "Eclipse/IntelliJ",
                "JUnit", "Maven/Gradle", "SQL Basics"
        ));
        baseKeywords.put("mid", Arrays.asList(
                "Spring Framework", "Spring Boot", "Hibernate/JPA", "Microservices",
                "Design Patterns", "Docker", "CI/CD", "Cloud Fundamentals"
        ));
        baseKeywords.put("senior", Arrays.asList(
                "System Design", "Architecture", "Performance Optimization", "Scalability",
                "Team Leadership", "Mentoring", "DevOps", "AWS/Azure/GCP"
        ));

        // Skill-specific keywords
        Map<String, List<String>> skillKeywords = new HashMap<>();
        skillKeywords.put("spring", Arrays.asList("Spring Boot", "Spring MVC", "Spring Security"));
        skillKeywords.put("microservices", Arrays.asList("Microservices Architecture", "RESTful APIs", "Service Discovery"));
        skillKeywords.put("hibernate", Arrays.asList("Hibernate ORM", "JPA", "Entity Relationships"));
        skillKeywords.put("cloud", Arrays.asList("AWS", "Azure", "GCP", "Cloud Deployment"));
        skillKeywords.put("database", Arrays.asList("MySQL", "PostgreSQL", "MongoDB", "SQL Optimization"));
        skillKeywords.put("testing", Arrays.asList("JUnit", "Mockito", "Integration Testing"));

        // Step 3: Collect relevant keywords
        Set<String> suggestedKeywords = new LinkedHashSet<>(baseKeywords.get("common"));
        if (baseKeywords.containsKey(level)) {
            suggestedKeywords.addAll(baseKeywords.get(level));
        }

        for (String skill : skills) {
            for (Map.Entry<String, List<String>> entry : skillKeywords.entrySet()) {
                if (skill.contains(entry.getKey())) {
                    suggestedKeywords.addAll(entry.getValue());
                }
            }
        }

        // Step 4: Display results
        System.out.println("\n=== Suggested Resume Keywords ===");
        suggestedKeywords.forEach(keyword -> System.out.println("- " + keyword));

        System.out.println("\n Tip: Use these keywords naturally in your resume under 'Skills', 'Projects', and 'Experience'.");
        scanner.close();
    }
}
