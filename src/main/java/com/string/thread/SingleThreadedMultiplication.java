package com.string.thread;

/**
 * @author Naveen K Wodeyar
 * @date 20-Jul-2025
 */

public class SingleThreadedMultiplication {

    public static void main(String[] args) {
        int baseNumber = 2;

        long totalStart = System.nanoTime();

        for (int i = 1; i <= 10; i++) {
            long start = System.nanoTime();
            int result = baseNumber * i;
            long end = System.nanoTime();
            System.out.println("2 * " + i + " = " + result +
                    " | Time taken: " + (end - start) + " ns");
        }

        long totalEnd = System.nanoTime();
        System.out.println("Total Time Taken (Single-threaded): " + (totalEnd - totalStart) + " ns");
    }
}
