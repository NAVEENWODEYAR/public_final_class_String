package com.string.functions;

/**
 * /**
 * @author Naveen K Wodeyar
 * @date 04-Feb-2026
 *
 * Extract the last word from a sentence (without using split)
 */
public class SubStringProgram {

	public static void main(String[] args) {
        String str = "Java is very powerful";

        int index = str.lastIndexOf(" ");
        System.out.println(index);
        String lastWord = str.substring(index + 1);

        System.out.println(lastWord);
    }
}
