package com.string.series;

/**
 * @author Naveen K Wodeyar
 * @date 12-May-2025
 */

public class FibonacciSquare {
    public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 1, fib;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print((i * i) + " ");
            } else {
                System.out.print(a + " ");
                fib = a + b;
                a = b;
                b = fib;
            }
        }
    }
}

