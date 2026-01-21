package com.string.code;

/**
 * @author Naveen K Wodeyar
 * @date 21-Jan-2026
 */

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentHashMapDemo {

    public static void main(String[] args) {

        // Create ConcurrentHashMap
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        // Thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Writer task
        Runnable writerTask = () -> {
            for (int i = 1; i <= 5; i++) {
                map.put(i, "Value-" + i);
                System.out.println(Thread.currentThread().getName()
                        + " put: " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        // Reader task
        Runnable readerTask = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName()
                        + " read: " + map.get(i));
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        // Submit tasks
        executor.submit(writerTask);
        executor.submit(readerTask);
        executor.submit(readerTask);

        // Shutdown executor
        executor.shutdown();
    }
}

