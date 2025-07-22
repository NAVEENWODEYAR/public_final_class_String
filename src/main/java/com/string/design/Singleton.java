package com.string.design;

/**
 * @author Naveen K Wodeyar
 * @date 22-Jul-2025
 */

public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        s.showMessage();
    }
}
