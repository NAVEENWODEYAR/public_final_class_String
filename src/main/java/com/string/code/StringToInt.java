package com.string.code;

/**
 * @author Naveen K Wodeyar
 * @date 08-May-2025
 */

public class StringToInt {
    public static void main(String[] args) {
        System.out.println(parseInt("-123"));  // Output: -123
    }
    public static int parseInt(String s) {
        int num = 0, i = 0, sign = 1;

        if (s.charAt(0) == '-') {
            sign = -1;
            i = 1;
        }

        while (i < s.length()) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') throw new NumberFormatException("Invalid character: " + c);
            num = num * 10 + (c - '0');
            i++;
        }

        return num * sign;
    }
}
