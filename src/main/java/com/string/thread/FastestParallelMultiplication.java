package com.string.thread;

import java.util.concurrent.*;

/**
 * @author Naveen K Wodeyar
 * @date 20-Jul-2025
 */

public class FastestParallelMultiplication {

    public static void main(String[] args) throws InterruptedException {
        int baseNumber = 2;
        int count = 10;

        // Create a fixed thread pool
        ExecutorService executor = Executors.newFixedThreadPool(count);

        // Countdown latch to wait for all tasks to complete
        CountDownLatch latch = new CountDownLatch(count);

        // Track total execution time
        long totalStart = System.nanoTime();

        // Submit 10 parallel tasks
        for (int i = 1; i <= count; i++) {
            final int multiplier = i;
            executor.execute(() -> {
                long startTime = System.nanoTime();
                int result = baseNumber * multiplier;
                long endTime = System.nanoTime();

                System.out.println("Thread " + Thread.currentThread().getName() +
                        " -> " + baseNumber + " * " + multiplier + " = " + result +
                        " | Task Time: " + (endTime - startTime) + " ns");

                latch.countDown();  // Mark task as done
            });
        }

        // Wait for all tasks to complete
        latch.await();

        long totalEnd = System.nanoTime();

        // Shut down executor
        executor.shutdown();

        // Print total time
        System.out.println("\nTotal Time Taken (Parallel): " + (totalEnd - totalStart) + " ns");

        // Optional: print memory usage
        Runtime runtime = Runtime.getRuntime();
        runtime.gc(); // Suggest garbage collection before measuring

        long usedMemory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Approximate Memory Used: " + usedMemory / 1024 + " KB");
    }
}
