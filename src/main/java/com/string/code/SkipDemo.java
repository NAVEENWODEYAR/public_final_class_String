package com.string.code;

/**
 * @author Naveen K Wodeyar
 * @date 12-Mar-2026
 */

public class SkipDemo {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            // Skip number 3
            if (i == 3) {
                continue; // skip this iteration
            }

            System.out.println(i);
        }
    }
}