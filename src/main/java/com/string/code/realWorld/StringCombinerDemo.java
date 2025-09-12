/**
 * @author Naveen K Wodeyar
 * @date 12-Sept-2025
 */
package com.string.code.realWorld;

import java.util.*;
import java.util.stream.Collectors;

public class StringCombinerDemo {

    public static void main(String[] args) {
        List<String> sampleStrings = Arrays.asList("Java", "", null, "Stream", "API", "");

        System.out.println("=== Combine using Collectors.joining() ===");
        combineUsingCollectors(sampleStrings);

        System.out.println("\n=== Combine using reduce with identity ===");
        combineUsingReduceIdentity(sampleStrings);

        System.out.println("\n=== Combine using Optional.reduce (no identity) ===");
        combineUsingOptionalReduce(sampleStrings);

        System.out.println("\n=== Combine using StringBuilder and forEach ===");
        combineUsingStringBuilder(sampleStrings);

        System.out.println("\n=== Combine using custom delimiter ===");
        combineWithCustomDelimiter(sampleStrings, " | ");

        System.out.println("\n=== Combine from nested list using flatMap ===");
        combineFromNestedList();
    }

    private static void combineUsingCollectors(List<String> strings) {
        try {
            String result = strings.stream()
                    .filter(s -> s != null && !s.isEmpty())
                    .collect(Collectors.joining(" "));
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.err.println("Error in combineUsingCollectors: " + e.getMessage());
        }
    }

    private static void combineUsingReduceIdentity(List<String> strings) {
        try {
            String result = strings.stream()
                    .filter(s -> s != null && !s.isEmpty())
                    .reduce("", (a, b) -> a + (a.isEmpty() ? "" : " ") + b);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.err.println("Error in combineUsingReduceIdentity: " + e.getMessage());
        }
    }

    private static void combineUsingOptionalReduce(List<String> strings) {
        try {
            Optional<String> result = strings.stream()
                    .filter(s -> s != null && !s.isEmpty())
                    .reduce((a, b) -> a + " " + b);
            System.out.println("Result: " + result.orElse("No valid strings"));
        } catch (Exception e) {
            System.err.println("Error in combineUsingOptionalReduce: " + e.getMessage());
        }
    }

    private static void combineUsingStringBuilder(List<String> strings) {
        try {
            StringBuilder sb = new StringBuilder();
            strings.stream()
                    .filter(s -> s != null && !s.isEmpty())
                    .forEach(s -> sb.append(s).append(" "));
            String result = sb.toString().trim();
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.err.println("Error in combineUsingStringBuilder: " + e.getMessage());
        }
    }

    private static void combineWithCustomDelimiter(List<String> strings, String delimiter) {
        try {
            String result = strings.stream()
                    .filter(s -> s != null && !s.isEmpty())
                    .collect(Collectors.joining(delimiter));
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.err.println("Error in combineWithCustomDelimiter: " + e.getMessage());
        }
    }

    private static void combineFromNestedList() {
        try {
            List<List<String>> nested = Arrays.asList(
                    Arrays.asList("Java", null),
                    Arrays.asList("Streams", ""),
                    Arrays.asList("FlatMap", "Example")
            );

            String result = nested.stream()
                    .flatMap(Collection::stream)
                    .filter(s -> s != null && !s.isEmpty())
                    .collect(Collectors.joining(" "));
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.err.println("Error in combineFromNestedList: " + e.getMessage());
        }
    }
}
