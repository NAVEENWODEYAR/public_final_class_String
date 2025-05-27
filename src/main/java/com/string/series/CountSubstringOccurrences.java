package com.string.series;

/**
 * @author Naveen K Wodeyar
 * @date 27-May-2025
 */

public class CountSubstringOccurrences {
    public static int countOccurrences(String str, String target) {
        int count = 0;
        int index = 0;

        while (str.contains(target)) {
            index = str.indexOf(target);
            count++;
            str = str.substring(index + target.length());
        }

        return count;
    }

    public static void main(String[] args) {
        String sentence = "abc abc abc";
        String sub = "abc";
        System.out.println("Occurrences: " + countOccurrences(sentence, sub)); // 3
    }
}

