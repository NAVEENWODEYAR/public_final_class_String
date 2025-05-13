package com.string.series;

/**
 * @author Naveen K Wodeyar
 * @date 12-May-2025
 */

public class PrimeFibonacciAlternate {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        int n = 10, count = 0, num = 2, a = 0, b = 1;
        while (count < n) {
            if (count % 2 == 0) {
                while (!isPrime(num)) num++;
                System.out.print(num + " ");
                num++;
            } else {
                System.out.print(a + " ");
                int temp = a + b;
                a = b;
                b = temp;
            }
            count++;
        }
    }
}

