package com.string.thread;

/**
 * @author Naveen K Wodeyar
 * @date 03-May-2025
 */

public class CharByTypePrinter {
    private static final String input = "a1#b2@c3$";
    private static final Object lock = new Object();
    private static int index = 0;

    public static void main(String[] args) {
        new Thread(() -> printChar(Character::isLetter, "Letter-Thread")).start();
        new Thread(() -> printChar(Character::isDigit, "Digit-Thread")).start();
        new Thread(() -> printChar(c -> !Character.isLetterOrDigit(c), "Special-Thread")).start();
    }

    private static void printChar(java.util.function.Predicate<Character> condition, String name) {
        while (true) {
            synchronized (lock) {
                if (index >= input.length()) break;
                char ch = input.charAt(index);
                if (condition.test(ch)) {
                    System.out.println(name + ": " + ch);
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
