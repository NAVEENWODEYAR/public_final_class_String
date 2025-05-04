package com.string.thread;

/**
 * @author Naveen K Wodeyar
 * @date 03-May-2025
 */

public class EvenOddCharPrinter {
    private static final String text = "HELLOJAVA";
    private static final Object lock = new Object();
    private static int index = 0;

    public static void main(String[] args) {
        Thread evenThread = new Thread(() -> printChar(true), "Even-Thread");
        Thread oddThread = new Thread(() -> printChar(false), "Odd-Thread");

        evenThread.start();
        oddThread.start();
    }

    private static void printChar(boolean isEvenThread) {
        while (true) {
            synchronized (lock) {
                if (index >= text.length()) break;
                if ((index % 2 == 0 && isEvenThread) || (index % 2 == 1 && !isEvenThread)) {
                    System.out.println(Thread.currentThread().getName() + ": " + text.charAt(index));
                    index++;
                    lock.notifyAll();
                } else {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }
}

