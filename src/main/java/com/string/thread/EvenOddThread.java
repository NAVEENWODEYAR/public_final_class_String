package com.string.thread;

/**
 * @author Naveen K Wodeyar
 * @date 30-Apr-2025
 */

class Printer {
    private boolean isOdd = true;

    public synchronized void printOdd(int number) throws InterruptedException {
        while (!isOdd) wait();
        System.out.println("Odd: " + number);
        isOdd = false;
        notify();
    }

    public synchronized void printEven(int number) throws InterruptedException {
        while (isOdd) wait();
        System.out.println("Even: " + number);
        isOdd = true;
        notify();
    }
}

public class EvenOddThread {
    public static void main(String[] args) {
        Printer printer = new Printer();

        Thread oddThread = new Thread(() -> {
            for (int i = 1; i <= 100; i += 2) {
                try { 
                	printer.printOdd(i); 
                	} catch (InterruptedException e) {
                		System.out.printf("Exception occurred ",e);
                	}
            }
        });

        Thread evenThread = new Thread(() -> {
            for (int i = 2; i <= 100; i += 2) {
                try { 
                	printer.printEven(i); 
                	} catch (InterruptedException e) {
                		System.out.printf("Exception occurred ",e);
                	}
            }
        });

        oddThread.start();
        evenThread.start();
    }
}
