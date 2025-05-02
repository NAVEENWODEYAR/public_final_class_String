package com.string.thread;

import java.util.concurrent.*;

/**
 * @author Naveen K Wodeyar
 * @date 02-May-2025
 */

public class ConcurrentCharCounter {
    public static void main(String[] args) throws InterruptedException {
        String input = "multithreadinginjava";
        int numThreads = 10;
        int partSize = input.length() / numThreads;

        ConcurrentMap<Character, Integer> countMap = new ConcurrentHashMap<>();
        ExecutorService service = Executors.newFixedThreadPool(numThreads);

        for (int i = 0; i < numThreads; i++) {
            final int start = i * partSize;
            final int end = (i == numThreads - 1) ? input.length() : (i + 1) * partSize;
            service.submit(() -> {
                for (int j = start; j < end; j++) {
                    char c = input.charAt(j);
                    countMap.merge(c, 1, Integer::sum);
                }
            });
        }

        service.shutdown();
        service.awaitTermination(1, TimeUnit.MINUTES);

        System.out.println("Character Frequency: " + countMap);
    }
}

