package com.string.thread;

import java.util.concurrent.CountDownLatch;

/**
 * @author Naveen K Wodeyar
 * @date 30-Apr-2025
 */

public class CountDownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);

        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " working...");
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
            latch.countDown();
        };

        new Thread(task).start();
        new Thread(task).start();
        new Thread(task).start();

        latch.await();
        System.out.println("All threads finished. Proceeding in main thread.");
    }
}

