package com.string.code;

/**
 * @author Naveen K Wodeyar
 * @date 10-Mar-2026
 */

public class Calculator {

    public static double calculate(double a, double b, char op) {

        switch (op) {
            case '+':
                return a + b;

            case '-':
                return a - b;

            case '*':
                return a * b;

            case '/':
                if (b == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return a / b;

            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }

    public static void main(String[] args) {

        // Test Case 1
        System.out.println("Test 1: " + calculate(10, 5, '+')); // Expected: 15

        // Test Case 2
        System.out.println("Test 2: " + calculate(20, 8, '-')); // Expected: 12

        // Test Case 3
        System.out.println("Test 3: " + calculate(7, 6, '*')); // Expected: 42

        // Test Case 4
        System.out.println("Test 4: " + calculate(15, 3, '/')); // Expected: 5

        // Test Case 5 (decimal values)
        System.out.println("Test 5: " + calculate(8, 9, '/')); // Expected: 0.888...
    }
}