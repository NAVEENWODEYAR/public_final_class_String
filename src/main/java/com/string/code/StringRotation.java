package com.string.code;

/**
 * @author Naveen K Wodeyar
 * @date 09-May-2025
 */

public class StringRotation {
    public static void main(String[] args) {
        System.out.println(isRotation("ABCD", "CDAB"));  // true
    }

    public static boolean isRotation(String s1, String s2) {
        return s1.length() == s2.length() && (s1 + s1).contains(s2);
    }
}

