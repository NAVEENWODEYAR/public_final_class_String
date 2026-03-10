package com.string.code;

/**
 * @author Naveen K Wodeyar
 * @date 10-Mar-2026
 */

public class Calculator {

    public static double calculate(double a, double b, char op) {

        double result;

        switch (op) {
            case '+':
                result = a + b;
                break;

            case '-':
                result = a - b;
                break;

            case '*':
                result = a * b;
                break;

            case '/':
                if (b == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                result = a / b;
                break;

            default:
                throw new IllegalArgumentException("Invalid operator");
        }

        return round(result);
    }

    // Method to restrict precision to 2 decimal places
    private static double round(double value) {
        return Math.round(value * 100.0) / 100.0;
    }

    public static void main(String[] args) {

        // Test Case 1
        System.out.println("Test 1: " + calculate(10, 5, '+')); // 15.0

        // Test Case 2
        System.out.println("Test 2: " + calculate(20, 8, '-')); // 12.0

        // Test Case 3
        System.out.println("Test 3: " + calculate(7, 6, '*')); // 42.0

        // Test Case 4
        System.out.println("Test 4: " + calculate(15, 3, '/')); // 5.0

        // Test Case 5 (decimal values)
        System.out.println("Test 5: " + calculate(8, 9, '/')); // 0.89
    }
}