package com.string.code;

/**
 * @author Naveen K Wodeyar
 * @date 19-Dec-2025
 */

class CountVowels {

    // Method to count vowels in a string
    static int countVowels(String s) {

        int count = 0;
        s = s.toLowerCase();

        // Check each character
        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' ||
                c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    // Test cases
    public static void main(String[] args) {
        System.out.println(countVowels("Interview")); // 4
        System.out.println(countVowels("Java"));      // 2
        System.out.println(countVowels("Python"));      // 2

    }
}

