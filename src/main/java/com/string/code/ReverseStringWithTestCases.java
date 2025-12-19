package com.string.code;

/**
 * @author Naveen K Wodeyar
 * @date 19-Dec-2025
 */

public class ReverseStringWithTestCases {

    // Method to reverse the given string
    static String reverse(String s) {

        // If input is null, return null
        if (s == null)
            return null;

        // Convert string to character array
        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        // Swap characters from both ends
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        // Convert character array back to string
        return new String(arr);
    }

    // Test cases
    public static void main(String[] args) {
        System.out.println(reverse("Java"));   // avaJ
        System.out.println(reverse("abc"));    // cba
        System.out.println(reverse("A"));      // A
    }
    
}
