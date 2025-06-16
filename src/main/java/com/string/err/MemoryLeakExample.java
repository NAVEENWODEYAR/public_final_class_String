package com.string.err;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Naveen K Wodeyar
 * @date 15-Jun-2025
 */

public class MemoryLeakExample {
    public static void main(String[] args) {
        List<int[]> list = new ArrayList<>();
        try {
            while (true) {
                // Continuously allocate 1MB arrays
                list.add(new int[256 * 1024]); // Roughly 1MB (256K ints)
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Caught OutOfMemoryError during object creation!");
        }

        System.out.println("Program continues after memory exhaustion.");
    }
}
