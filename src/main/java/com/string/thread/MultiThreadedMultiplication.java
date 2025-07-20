package com.string.thread;

/**
 * @author Naveen K Wodeyar
 * @date 20-Jul-2025
 */

public class MultiThreadedMultiplication {

    static class MultiplicationTask implements Runnable {
        private final int number;
        private final int multiplier;

        public MultiplicationTask(int number, int multiplier) {
            this.number = number;
            this.multiplier = multiplier;
        }

        @Override
        public void run() {
            long start = System.nanoTime();
            int result = number * multiplier;
            long end = System.nanoTime();
            System.out.println("Thread " + Thread.currentThread().getName() +
                    ": " + number + " * " + multiplier + " = " + result +
                    " | Time taken: " + (end - start) + " ns");
        }
    }

    public static void main(String[] args) {
        int baseNumber = 2;
        int threadCount = 10;
        Thread[] threads = new Thread[threadCount];

        long totalStart = System.nanoTime();

        for (int i = 0; i < threadCount; i++) {
            int multiplier = i + 1;
            threads[i] = new Thread(new MultiplicationTask(baseNumber, multiplier), "T" + (i + 1));
            threads[i].start();
        }

        for (int i = 0; i < threadCount; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                System.err.println("Thread interrupted: " + threads[i].getName());
            }
        }

        long totalEnd = System.nanoTime();
        System.out.println("Total Time Taken (Multithreaded): " + (totalEnd - totalStart) + " ns");
    }
}
