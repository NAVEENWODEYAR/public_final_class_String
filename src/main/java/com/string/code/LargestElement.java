package com.string.code;

/**
 * @author Naveen K Wodeyar
 * @date 27-Feb-2026
 */

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 45, 23, 89, 67};
        int max = arr[0];

        for (int num : arr) {
            if (num > max)
                max = num;
        }

        System.out.println("Largest Element: " + max);
    }
}