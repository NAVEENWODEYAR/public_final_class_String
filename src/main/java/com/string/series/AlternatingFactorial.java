package com.string.series;

/**
 * @author Naveen K Wodeyar
 * @date 12-May-2025
 */

public class AlternatingFactorial {
    public static void main(String[] args) {
        int n = 6;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int fact = 1;
            for (int j = 1; j <= i; j++) fact *= j;
            if (i % 2 == 0) sum -= fact;
            else sum += fact;
        }
        System.out.println("Result: " + sum);
    }
}
