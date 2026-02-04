package com.string.functions;

/**
 * /**
 * @author Naveen K Wodeyar
 * @date 04-Feb-2026
 * Using split() + substring()
 */
public class ReverseWords {

    public static void main(String[] args) {
        String str = "Java is fun";

        String[] words = str.split(" ");

        for (String word : words) {
            for (int i = word.length() - 1; i >= 0; i--) {
                System.out.print(word.substring(i, i + 1));
            }
            System.out.print(" ");
        }
    }
    
}
