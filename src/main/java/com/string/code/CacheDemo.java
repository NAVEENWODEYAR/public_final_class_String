package com.string.code;

import java.util.HashMap;

/**
 * @author Naveen K Wodeyar
 * @date 09-Dec-2025
 */

class DataCache {

    private HashMap<Integer, String> cache = new HashMap<>();

    // Simulate expensive operation
    private String expensiveOperation(int id) {
        System.out.println("  [Expensive operation executed]");
        return "Data_for_" + id;
    }

    public String getData(int id) {
        if (cache.containsKey(id)) {
            System.out.println("  [Returned from cache]");
            return cache.get(id);
        }
        String data = expensiveOperation(id);
        cache.put(id, data);
        return data;
    }
}

public class CacheDemo {

    public static void main(String[] args) {

        DataCache cache = new DataCache();

        System.out.println("===== TEST CASE 1: First Access (Not Cached) =====");
        System.out.println("Input: getData(1)");
        System.out.println("Expected: Expensive operation executed");
        System.out.println("Actual:");
        String out1 = cache.getData(1);
        System.out.println("Output: " + out1);
        System.out.println();

        System.out.println("===== TEST CASE 2: Second Access (Cached) =====");
        System.out.println("Input: getData(1)");
        System.out.println("Expected: Returned from cache");
        System.out.println("Actual:");
        String out2 = cache.getData(1);
        System.out.println("Output: " + out2);
        System.out.println();

        System.out.println("===== TEST CASE 3: Multiple Keys =====");
        System.out.println("Input: getData(2), getData(3)");
        System.out.println("Expected: Expensive operation for both");
        System.out.println("Actual:");
        String out3 = cache.getData(2);
        System.out.println("Output 1: " + out3);
        String out4 = cache.getData(3);
        System.out.println("Output 2: " + out4);
        System.out.println();

        System.out.println("===== TEST CASE 4: Mixed Order Cache Reuse =====");
        System.out.println("Input: getData(1), getData(2)");
        System.out.println("Expected: Both should be returned from cache");
        System.out.println("Actual:");
        String out5 = cache.getData(1);
        System.out.println("Output 1: " + out5);
        String out6 = cache.getData(2);
        System.out.println("Output 2: " + out6);
        System.out.println();

        System.out.println("===== TEST CASE 5: Large Key =====");
        System.out.println("Input: getData(100)");
        System.out.println("Expected: Expensive operation");
        System.out.println("Actual:");
        String out7 = cache.getData(100);
        System.out.println("Output: " + out7);
        System.out.println();

        System.out.println("===== TEST CASE 6: Negative Key =====");
        System.out.println("Input: getData(-5)");
        System.out.println("Expected: Expensive operation");
        System.out.println("Actual:");
        String out8 = cache.getData(-5);
        System.out.println("Output: " + out8);
        System.out.println();

        System.out.println("===== TEST CASE 7: Repeated Calls (Stress Test) =====");
        System.out.println("Input: getData(2) repeated 3 times");
        System.out.println("Expected: Only first call expensive");
        System.out.println("Actual:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Call " + i + ": " + cache.getData(2));
        }
    }
}
