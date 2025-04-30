package com.string.thread;

/**
 * @author Naveen K Wodeyar
 * @date 01-May-2025
 */

public class SequentialTaskDemo {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        for (int i = 1; i <= 5; i++) {
            simulateTask(i);
        }

        long end = System.currentTimeMillis();
        System.out.println("Sequential Execution Time: " + (end - start) + " ms");
    }

    static void simulateTask(int id) {
        System.out.println("Task " + id + " started (no threads)");
        try {
            Thread.sleep(1000);  // Simulate time-consuming work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task " + id + " completed");
    }
}

