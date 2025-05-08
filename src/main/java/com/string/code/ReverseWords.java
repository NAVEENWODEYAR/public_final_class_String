package com.string.code;

/**
 * @author Naveen K Wodeyar
 * @date 08-May-2025
 */

public class ReverseWords {
    public static void main(String[] args) {
        String input = "Java is awesome";
        System.out.println(reverseWords(input));
    }

    public static String reverseWords(String s) {
        StringBuilder word = new StringBuilder();
        StringBuilder result = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c != ' ') {
                word.insert(0, c);
            } else if (word.length() > 0) {
                result.append(word).append(" ");
                word.setLength(0);
            }
        }
        result.append(word); // add the last word
        return result.toString().trim();
    }
}

