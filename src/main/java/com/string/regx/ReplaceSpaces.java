package com.string.regx;

/**
 * @author Naveen K Wodeyar
 * @date 17-Jun-2025
 */

public class ReplaceSpaces {
    public static void main(String[] args) {
        String input = "This   is    a   test   string.";
        String output = input.replaceAll("\\s+", " ");
        System.out.println(output);
    }
}

