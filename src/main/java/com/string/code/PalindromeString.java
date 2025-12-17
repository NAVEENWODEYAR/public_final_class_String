package com.string.code;

/**
 * @author Naveen K Wodeyar
 * @date 17-Dec-2025
 */

public class PalindromeString {
    public static void main(String[] args) {
        String str = "madam";
        String reverse = new StringBuilder(str).reverse().toString();

        if (str.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
