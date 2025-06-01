package com.string.thread;

/**
 * @author Naveen K Wodeyar
 * @date 01-Jun-2025
 */

public class ReverseStringWithThreads {

    private String input;
    private String reversed;

    public synchronized void setInput(String input) {
        this.input = input;
        notify();
    }

    public synchronized void reverseString() {
        while (input == null) {
            try { wait(); } catch (InterruptedException e) { e.printStackTrace(); }
        }
        reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed: " + reversed);
    }

    public static void main(String[] args) {
        ReverseStringWithThreads obj = new ReverseStringWithThreads();

        Thread inputThread = new Thread(() -> obj.setInput("HelloWorld"));
        Thread reverseThread = new Thread(obj::reverseString);

        reverseThread.start();
        inputThread.start();
    }
}

