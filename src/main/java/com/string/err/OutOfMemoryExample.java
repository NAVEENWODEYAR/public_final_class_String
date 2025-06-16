package com.string.err;

/**
 * @author Naveen K Wodeyar
 * @date 15-Jun-2025
 */

public class OutOfMemoryExample {
    public static void main(String[] args) {
        try {
            // Try to allocate a huge array (adjust the size to exceed your heap)
            int[] memoryFillIntVar = new int[Integer.MAX_VALUE];
        } catch (OutOfMemoryError e) {
            System.out.println("Caught OutOfMemoryError!");
            e.printStackTrace();
        }

        System.out.println("Program continues after handling OutOfMemoryError.");
    }
}

