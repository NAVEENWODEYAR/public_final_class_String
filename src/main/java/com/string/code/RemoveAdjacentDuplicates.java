package com.string.code;

/**
 * @author Naveen K Wodeyar
 * @date 09-May-2025
 */

public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca")); // ca
    }

    public static String removeDuplicates(String s) {
        StringBuilder stack = new StringBuilder();

        for (char c : s.toCharArray()) {
            int len = stack.length();
            if (len != 0 && stack.charAt(len - 1) == c) {
                stack.deleteCharAt(len - 1);
            } else {
                stack.append(c);
            }
        }

        return stack.toString();
    }
}

