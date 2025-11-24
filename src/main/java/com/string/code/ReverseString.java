package com.string.code;

/**
 * @author Naveen K Wodeyar
 * @date 24-Nov-2025
 */

public class ReverseString {

    public static String reverse(String s) {
        if (s == null || s.length() <= 1) return s;

        char[] arr = s.toCharArray();  // O(n)
        int left = 0, right = arr.length - 1;

        while (left < right) {         // O(n/2)
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        return new String(arr);        // O(n)
    }
}

