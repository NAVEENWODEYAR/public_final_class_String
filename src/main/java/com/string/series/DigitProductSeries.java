package com.string.series;

/**
 * @author Naveen K Wodeyar
 * @date 12-May-2025
 */

public class DigitProductSeries {
    static int digitProduct(int n) {
        int prod = 1;
        while (n > 0) {
            prod *= n % 10;
            n /= 10;
        }
        return prod;
    }

    public static void main(String[] args) {
        int n = 86;
        int count = 5;
        while (count-- > 0 && n > 0) {
            System.out.print(n + " ");
            n = digitProduct(n);
        }
    }
}

