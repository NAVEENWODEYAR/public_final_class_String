package com.string.thread;

/**
 * @author Naveen K Wodeyar
 * @date 30-Apr-2025
 */

class NumberPrinter {
    private int number = 1;
    private final int MAX = 100;

    public synchronized void printNumber() {
        while (number <= MAX) {
            System.out.println(Thread.currentThread().getName() + ": " + number++);
            notify();
            try {
                if (number <= MAX) wait();
            } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}

public class AlternateNumberThread {
    public static void main(String[] args) {
        NumberPrinter printer = new NumberPrinter();

        Thread t1 = new Thread(printer::printNumber, "Thread-1");
        Thread t2 = new Thread(printer::printNumber, "Thread-2");
        Thread t3 = new Thread(printer::printNumber, "Thread-3");
        Thread t4 = new Thread(printer::printNumber, "Thread-4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
