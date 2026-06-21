package com.string.methods;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

/**
 * @author Naveen K Wodeyar
 * @date 19-Jun-2025
 */

public class AdvancedStringStreamUtils {

    // 1. First non-repeating character
    public static Optional<Character> firstNonRepeatingChar(String input) {
        return input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();
    }

    // 2. Group words by their first character
    public static Map<Character, List<String>> groupWordsByFirstChar(List<String> words) {
        return words.stream()
                .filter(w -> !w.isEmpty())
                .collect(Collectors.groupingBy(w -> Character.toLowerCase(w.charAt(0))));
    }

    // 3. Count words with a specific prefix
    public static long countWordsWithPrefix(List<String> words, String prefix) {
        return words.stream()
                .filter(w -> w.startsWith(prefix))
                .count();
    }

    // 4. Find duplicate characters
    public static Set<Character> findDuplicateCharacters(String input) {
        return input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
    }

    // 5. Most frequent character
    public static Optional<Character> mostFrequentCharacter(String input) {
        return input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }

    // 6. Sort words in sentence by length
    public static String sortWordsByLength(String sentence) {
        return Arrays.stream(sentence.split("\\s+"))
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.joining(" "));
    }

    // 7. Remove duplicate words and sort alphabetically
    public static String dedupAndSortWords(String sentence) {
        return Arrays.stream(sentence.split("\\s+"))
                .distinct()
                .sorted()
                .collect(Collectors.joining(" "));
    }

    // 8. Convert List<String> to CSV
    public static String listToCSV(List<String> list) {
        return list.stream()
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .collect(Collectors.joining(","));
    }

    // 9. Check if a string is alphabetic
    public static boolean isAlphabetic(String input) {
        return input.chars().allMatch(Character::isLetter);
    }

    // 10. Filter and join emails with specific domain
    public static String getEmailsByDomain(List<String> emails, String domain) {
        return emails.stream()
                .filter(email -> email.endsWith("@" + domain))
                .collect(Collectors.joining("; "));
    }

    // Main method to demonstrate all examples
    public static void main(String[] args) {
        String sample = "swiss";
        List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "avocado");
        List<String> emails = Arrays.asList("alice@gmail.com", "bob@yahoo.com", "eve@gmail.com");

        System.out.println("1. First non-repeating char in 'swiss': " +
                firstNonRepeatingChar(sample).orElse(null));

        System.out.println("2. Group words by first char:");
        groupWordsByFirstChar(words).forEach((k, v) -> System.out.println(k + " -> " + v));

        System.out.println("3. Words starting with 'ap': " + countWordsWithPrefix(words, "ap"));

        System.out.println("4. Duplicate characters in 'programming': " +
                findDuplicateCharacters("programming"));

        System.out.println("5. Most frequent char in 'mississippi': " +
                mostFrequentCharacter("mississippi").orElse(null));

        System.out.println("6. Sort words by length: " +
                sortWordsByLength("Java language is awesome and fun"));

        System.out.println("7. Dedup and sort: " +
                dedupAndSortWords("banana apple cherry apple banana"));

        System.out.println("8. List to CSV: " +
                listToCSV(Arrays.asList("Tom", "Jerry", "Spike", " ")));

        System.out.println("9. Is 'OpenAI' alphabetic? " + isAlphabetic("OpenAI"));
        System.out.println("   Is 'GPT-4o' alphabetic? " + isAlphabetic("GPT-4o"));

        System.out.println("10. Emails from gmail.com: " +
                getEmailsByDomain(emails, "gmail.com"));
    }
}
