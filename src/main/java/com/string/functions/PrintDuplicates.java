package com.string.functions;
import java.util.*;

/**
 * @author Naveen K Wodeyar
 * @date 04-Feb-2026
 * Print duplicate words in a sentence
 */
public class PrintDuplicates {
    public static void main(String[] args) {
        String str = "Java is Java fun is";

        String[] words = str.split(" ");
        HashSet<String> set = new HashSet<>();

        for (String word : words) {
            if (!set.add(word)) {
                System.out.println(word);
            }
        }
    }
}
