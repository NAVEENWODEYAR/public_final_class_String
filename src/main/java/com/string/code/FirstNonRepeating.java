package com.string.code;

/**
 * @author Naveen K Wodeyar
 * @date 29-May-2025
 */

public class FirstNonRepeating {
    public static char findFirstNonRepeating(String s) {
        for (char ch : s.toCharArray()) {
            if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                return ch;
            }
        }
        return '\0'; // null character if no unique found
    }

    public static void main(String[] args) {
        String s = "aabbccdef";
        System.out.println("First non-repeating character: " + findFirstNonRepeating(s));
    }
}
