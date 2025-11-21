package com.string.code;

/**
 * @author Naveen K Wodeyar
 * @date 21-Nov-2025
 */

public class CharacterCounter {

    // Count characters manually without using length(), ignoring spaces
    public static int countChars(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }

        int count = 0;
        int index = 0;

        try {
            while (true) {
                char c = input.charAt(index); // try accessing character
                if (c != ' ') {               // ignore spaces
                    count++;
                }
                index++;
            }
        } catch (IndexOutOfBoundsException e) {
            // End of string reached
        }

        return count;
    }

    public static void main(String[] args) {
        String text = "Hello World";
        int result = countChars(text);
        System.out.println("Total characters (excluding spaces): " + result);
    }
}

