package com.string.series;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Naveen K Wodeyar
 * @date 12-May-2025
 */

public class FibonacciSquare {

    public static List<Integer> generateSeries(int n) {
        List<Integer> result = new ArrayList<>();
        int a = 0, b = 1, fib;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                result.add(i * i);
            } else {
                result.add(a);
                fib = a + b;
                a = b;
                b = fib;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> series = generateSeries(10);
        for (int val : series) {
            System.out.print(val + " ");
        }
    }
}
