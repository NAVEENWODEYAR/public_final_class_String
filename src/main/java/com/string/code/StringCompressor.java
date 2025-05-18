/**
 * @author Naveen K Wodeyar
 * @date 17-May-2025
 */
package com.string.code;

public class StringCompressor {
    public static String compress(String input) {
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= input.length(); i++) {
            if (i == input.length() || input.charAt(i) != input.charAt(i - 1)) {
                result.append(input.charAt(i - 1)).append(count);
                count = 1;
            } else {
                count++;
            }
        }

        return result.length() < input.length() ? result.toString() : input;
    }

    public static void main(String[] args) {
        System.out.println(compress("aaabbcccd"));  // Output: a3b2c3d1
    }
}
