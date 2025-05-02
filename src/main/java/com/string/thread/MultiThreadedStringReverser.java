package com.string.thread;

/**
 * @author Naveen K Wodeyar
 * @date 02-May-2025
 */

import java.util.concurrent.*;

public class MultiThreadedStringReverser {
    public static void main(String[] args) throws Exception {
        String input = "ABCDEFGHIJKL";
        int numThreads = 3;
        int partSize = input.length() / numThreads;

        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        Future<String>[] results = new Future[numThreads];

        for (int i = 0; i < numThreads; i++) {
            final int start = i * partSize;
            final int end = (i == numThreads - 1) ? input.length() : (i + 1) * partSize;
            results[i] = executor.submit(() -> new StringBuilder(input.substring(start, end)).reverse().toString());
        }

        StringBuilder reversed = new StringBuilder();
        for (int i = numThreads - 1; i >= 0; i--) {
            reversed.append(results[i].get());
        }

        executor.shutdown();
        System.out.println("Reversed: " + reversed);
    }
}
