package com.string.code.realWorld;

/**
 * @author Naveen K Wodeyar
 * @date 25-Dec-2025
 */

public class ReverseStringAnalysis {

    // Utility method to measure memory used
    private static long usedMemory() {
        Runtime runtime = Runtime.getRuntime();
        return runtime.totalMemory() - runtime.freeMemory();
    }

    // 1. Using charAt() + String concatenation
    private static String reverseUsingCharAt(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    // 2. Using StringBuilder
    private static String reverseUsingStringBuilder(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // 3. Using Character Array
    private static String reverseUsingCharArray(String str) {
        char[] arr = str.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }

    // 4. Using Recursion
    private static String reverseUsingRecursion(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseUsingRecursion(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {

        String input = "JavaInterviewPreparation";

        // ------------------ charAt() ------------------
        long memBefore = usedMemory();
        long start = System.nanoTime();

        String r1 = reverseUsingCharAt(input);

        long end = System.nanoTime();
        long memAfter = usedMemory();

        System.out.println("1. charAt()");
        System.out.println("Result: " + r1);
        System.out.println("Time: " + (end - start) + " ns");
        System.out.println("Memory Used: " + (memAfter - memBefore) + " bytes\n");

        // ------------------ StringBuilder ------------------
        memBefore = usedMemory();
        start = System.nanoTime();

        String r2 = reverseUsingStringBuilder(input);

        end = System.nanoTime();
        memAfter = usedMemory();

        System.out.println("2. StringBuilder");
        System.out.println("Result: " + r2);
        System.out.println("Time: " + (end - start) + " ns");
        System.out.println("Memory Used: " + (memAfter - memBefore) + " bytes\n");

        // ------------------ Char Array ------------------
        memBefore = usedMemory();
        start = System.nanoTime();

        String r3 = reverseUsingCharArray(input);

        end = System.nanoTime();
        memAfter = usedMemory();

        System.out.println("3. Char Array");
        System.out.println("Result: " + r3);
        System.out.println("Time: " + (end - start) + " ns");
        System.out.println("Memory Used: " + (memAfter - memBefore) + " bytes\n");

        // ------------------ Recursion ------------------
        memBefore = usedMemory();
        start = System.nanoTime();

        String r4 = reverseUsingRecursion(input);

        end = System.nanoTime();
        memAfter = usedMemory();

        System.out.println("4. Recursion");
        System.out.println("Result: " + r4);
        System.out.println("Time: " + (end - start) + " ns");
        System.out.println("Memory Used: " + (memAfter - memBefore) + " bytes\n");
    }
}
