package com.string.series;

/**
 * @author Naveen K Wodeyar
 * @date 12-May-2025
 */

public class TriangularSeries {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            int t = i * (i + 1) / 2;
            System.out.print(t + " ");
        }
    }
}
