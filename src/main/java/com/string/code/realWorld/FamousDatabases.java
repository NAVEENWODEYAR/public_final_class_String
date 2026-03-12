package com.string.code.realWorld;

/**
 * @author Naveen K Wodeyar
 * @date 12-Mar-2026
 */

public class FamousDatabases {

    public static void main(String[] args) {

        String[] databases = {
            "MySQL",
            "Oracle",
            "MongoDB",
            "PostgreSQL",
            "Microsoft SQL Server"
        };

        String[] advantages = {
            "Open-source, fast, widely supported",
            "Highly secure, powerful enterprise features",
            "Flexible schema, good for big data and JSON",
            "Advanced features, strong standards compliance",
            "Excellent integration with Microsoft tools"
        };

        String[] disadvantages = {
            "Limited advanced features compared to enterprise DBs",
            "Very expensive licensing",
            "Less suitable for complex transactions",
            "Slightly harder to manage for beginners",
            "Licensing cost and mostly Windows-based"
        };

        System.out.println("Famous Databases with Advantages and Disadvantages\n");

        for (int i = 0; i < databases.length; i++) {
            System.out.println("Database: " + databases[i]);
            System.out.println("Advantage: " + advantages[i]);
            System.out.println("Disadvantage: " + disadvantages[i]);
            System.out.println("------------------------------------");
        }
    }
}