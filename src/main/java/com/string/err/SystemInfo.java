package com.string.err;

/**
 * @author Naveen K Wodeyar
 * @date 29-Jun-2025
 */

public class SystemInfo {

    public static void main(String[] args) {
        // Number of available processors (cores)
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Available CPU cores: " + cores);

        // OS and system properties
        System.out.println("OS Name: " + System.getProperty("os.name"));
        System.out.println("OS Architecture: " + System.getProperty("os.arch"));
        System.out.println("OS Version: " + System.getProperty("os.version"));

        // Java version details
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));

        // Memory details
        long totalMemory = Runtime.getRuntime().totalMemory(); // Total memory currently available to JVM
        long freeMemory = Runtime.getRuntime().freeMemory();   // Free memory in JVM
        long maxMemory = Runtime.getRuntime().maxMemory();     // Max memory JVM can use

        System.out.println("Total Memory (bytes): " + totalMemory);
        System.out.println("Free Memory (bytes): " + freeMemory);
        System.out.println("Max Memory (bytes): " + maxMemory);
    }
}
