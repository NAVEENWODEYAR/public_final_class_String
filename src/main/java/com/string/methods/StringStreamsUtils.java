package com.string.methods;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

/**
 * @author Naveen K Wodeyar
 * @date 19-Jun-2025
 */

public class StringStreamsUtils {

    // 1. Remove all digits from a string
    public static String removeDigits(String input) {
        return input.chars()
                .filter(c -> !Character.isDigit(c))
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
    }

    // 2. Replace all vowels with '*'
    public static String replaceVowels(String input) {
        return input.chars()
                .mapToObj(c -> {
                    char ch = (char) c;
                    return "AEIOUaeiou".indexOf(ch) != -1 ? "*" : String.valueOf(ch);
                })
                .collect(Collectors.joining());
    }

    // 3. Capitalize every word
    public static String capitalizeWords(String input) {
        return Arrays.stream(input.split(" "))
                .map(word -> word.isEmpty() ? "" :
                        Character.toUpperCase(word.charAt(0)) + word.substring(1))
                .collect(Collectors.joining(" "));
    }

    // 4. Mask all characters except last N digits
    public static String maskExceptLast(String input, int visibleCount) {
        return IntStream.range(0, input.length())
                .mapToObj(i -> i < input.length() - visibleCount ? "*" : String.valueOf(input.charAt(i)))
                .collect(Collectors.joining());
    }

    // 5. Insert separator after every N characters
    public static String insertSeparatorEveryNChars(String input, int n, String separator) {
        return IntStream.range(0, input.length())
                .mapToObj(i -> String.valueOf(input.charAt(i)) +
                        ((i + 1) % n == 0 && i != input.length() - 1 ? separator : ""))
                .collect(Collectors.joining());
    }

    // 6. Remove all special characters
    public static String removeSpecialCharacters(String input) {
        return input.chars()
                .filter(c -> Character.isLetterOrDigit(c) || Character.isWhitespace(c))
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
    }

    // 7. Count frequency of each character
    public static Map<Character, Long> countCharacterFrequency(String input) {
        return input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    // Main method to demo all functionalities
    public static void main(String[] args) {
        String sample = "Hello@World#2025!";
        System.out.println("Original: " + sample);

        System.out.println("1. Remove digits: " + removeDigits(sample));
        System.out.println("2. Replace vowels with '*': " + replaceVowels(sample));
        System.out.println("3. Capitalize words: " + capitalizeWords("java is awesome"));
        System.out.println("4. Mask all but last 4: " + maskExceptLast("1234567812345678", 4));
        System.out.println("5. Insert '-' after every 3 chars: " +
                insertSeparatorEveryNChars("ABCDEFGHIJK", 3, "-"));
        System.out.println("6. Remove special characters: " + removeSpecialCharacters(sample));
        System.out.println("7. Character frequency map (banana): " +
                countCharacterFrequency("banana"));
    }
}
