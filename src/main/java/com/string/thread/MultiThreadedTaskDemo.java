package com.string.thread;

/**
 * @author Naveen K Wodeyar
 * @date 01-May-2025
 */

public class MultiThreadedTaskDemo {

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();

        Thread[] threads = new Thread[5];

        for (int i = 0; i < 5; i++) {
            final int taskId = i + 1;
            threads[i] = new Thread(() -> simulateTask(taskId));
            threads[i].start();
        }

        // Wait for all threads to finish
        for (Thread t : threads) {
            t.join();
        }

        long end = System.currentTimeMillis();
        System.out.println("Multithreaded Execution Time: " + (end - start) + " ms");
    }

    static void simulateTask(int id) {
        System.out.println("Task " + id + " started (thread: " + Thread.currentThread().getName() + ")");
        try {
            Thread.sleep(1000);  // Simulate time-consuming work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task " + id + " completed");
    }
}

