package com.string.thread;

/**
 * @author Naveen K Wodeyar
 * @date 01-Jun-2025
 */

public class VowelConsonantPrinter {

    private final String input;
    private int index = 0;
    private final Object lock = new Object();

    public VowelConsonantPrinter(String input) {
        this.input = input;
    }

    private boolean isVowel(char ch) {
        return "AEIOUaeiou".indexOf(ch) >= 0;
    }

    public void printVowels() {
        while (true) {
            synchronized (lock) {
                if (index >= input.length()) break;
                char ch = input.charAt(index);
                if (isVowel(ch)) {
                    System.out.println("VowelThread: " + ch);
                    index++;
                    lock.notifyAll();
                } else {
                    try { lock.wait(); } catch (InterruptedException e) { e.printStackTrace(); }
                }
            }
        }
    }

    public void printConsonants() {
        while (true) {
            synchronized (lock) {
                if (index >= input.length()) break;
                char ch = input.charAt(index);
                if (!isVowel(ch)) {
                    System.out.println("ConsonantThread: " + ch);
                    index++;
                    lock.notifyAll();
                } else {
                    try { lock.wait(); } catch (InterruptedException e) { e.printStackTrace(); }
                }
            }
        }
    }

    public static void main(String[] args) {
        VowelConsonantPrinter printer = new VowelConsonantPrinter("Interview");
        Thread t1 = new Thread(printer::printVowels);
        Thread t2 = new Thread(printer::printConsonants);
        t1.start();
        t2.start();
    }
}
