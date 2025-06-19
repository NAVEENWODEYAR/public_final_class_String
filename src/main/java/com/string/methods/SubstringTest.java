package com.string.methods;

/**
 * @author Naveen K Wodeyar
 * @date 19-Jun-2025
 */

public class SubstringTest {
    public static String getSubstring(String str, int start, int end) {
        return str.substring(start, end);
    }

    public static void main(String[] args) {
        String s = "abcde";
        System.out.println("'" + getSubstring(s, 2, 2) + "'"); // ''
        System.out.println("'" + getSubstring(s, 2, 3) + "'"); // 'c'
    }
}
