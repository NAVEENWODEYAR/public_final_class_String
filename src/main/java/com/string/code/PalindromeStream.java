package com.string.code;

import java.util.stream.IntStream;

/**
 * @author Naveen K Wodeyar
 * @date 17-Dec-2025
 */

public class PalindromeStream {
    public static void main(String[] args) {
        String str = "madam";

        boolean isPalindrome = IntStream.range(0, str.length() / 2)
                .allMatch(i -> str.charAt(i) == str.charAt(str.length() - i - 1));

        System.out.println(isPalindrome ? "Palindrome" : "Not a Palindrome");
    }
}
