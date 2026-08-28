package com.string.code;

/**
 * @author Naveen K Wodeyar
 * Demonstrates how to reverse a String in Java.
 *
 * <p>Interview approach:
 * 1. Convert the String into a character array.
 * 2. Use two pointers: one at the beginning and one at the end.
 * 3. Swap characters while the pointers move toward each other.</p>
 */

public class ReverseString {

    /**
     * Reverses the given string using the two-pointer technique.
     *
     * @param input the string to reverse
     * @return the reversed string
     */
    public static String reverse(String input) {

        // Convert String to char array because String is immutable.
        char[] chars = input.toCharArray();

        // Two pointers: left starts at beginning,
        // right starts at the end.
        int left = 0;
        int right = chars.length - 1;

        // Swap characters until the pointers meet.
        while (left < right) {

            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        // Convert the character array back to a String.
        return new String(chars);
    }

    /**
     * Test cases.
     */
    public static void main(String[] args) {

        // Test Case 1
        System.out.println(reverse("hello"));
        // Expected: olleh

        // Test Case 2
        System.out.println(reverse("Java"));
        // Expected: avaJ

        // Test Case 3
        System.out.println(reverse("Interview"));
        // Expected: weivretnI

        // Test Case 4: Single character
        System.out.println(reverse("A"));
        // Expected: A

        // Test Case 5: Empty string
        System.out.println(reverse(""));
        // Expected: empty string
    }
}
