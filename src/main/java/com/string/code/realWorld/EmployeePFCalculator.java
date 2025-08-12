package com.string.code.realWorld;

import java.util.Scanner;

/**
 * @author Naveen K Wodeyar
 * @date 12-Aug-2025
 */

public class EmployeePFCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Employee Name and Salary
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter basic salary: ");
        double salary = scanner.nextDouble();

        // PF calculation (12% of basic salary)
        double pf = 0.12 * salary;

        // Output
        System.out.println("\n--- PF Details ---");
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: ₹" + salary);
        System.out.println("Provident Fund (12%): ₹" + pf);

        scanner.close();
    }
}
