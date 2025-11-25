package com.string.code;

import java.nio.charset.StandardCharsets;

/**
 * @author Naveen K Wodeyar
 * @date 25-Nov-2025
 */

public class StringStorageCalculator {

    /**
     * Returns the number of bytes required to store a given string in UTF-8.
     *
     * @param input the string whose storage size is calculated
     * @return size in bytes
     */
    public static int getStorageSizeInBytes(String input) {
        if (input == null) {
            return 0;
        }
        return input.getBytes(StandardCharsets.UTF_8).length;
    }

    public static void main(String[] args) {
        String text = "String"; 
        int size = getStorageSizeInBytes(text);

        System.out.println("String: " + text);
        System.out.println("Storage required (UTF-8 bytes): " + size);
    }
}
