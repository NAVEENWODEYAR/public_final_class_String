package com.string.thread;

/**
 * @author Naveen K Wodeyar
 * @date 03-May-2025
 */

public class AlternateCharPrinter {
    private static final String text = "ABCDEFGH";
    private static final Object lock = new Object();
    private static int index = 0;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> printChar(true), "Thread-1");
        Thread t2 = new Thread(() -> printChar(false), "Thread-2");

        t1.start();
        t2.start();
    }

    private static void printChar(boolean isThreadOne) {
        while (true) {
            synchronized (lock) {
                if (index >= text.length()) break;
                if ((index % 2 == 0 && isThreadOne) || (index % 2 == 1 && !isThreadOne)) {
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

