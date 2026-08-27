package com.string.code.realWorld;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Collection of commonly asked String interview programs.
 *
 * <p>
 * This program demonstrates:
 * <ul>
 *     <li>Reverse a String</li>
 *     <li>Check Palindrome</li>
 *     <li>Count character frequency</li>
 *     <li>Find duplicate characters</li>
 *     <li>Find first non-repeated character</li>
 *     <li>Find first repeated character</li>
 *     <li>Check Anagram</li>
 *     <li>Reverse words</li>
 *     <li>Find longest word</li>
 *     <li>Count words</li>
 *     <li>Remove duplicate characters</li>
 *     <li>Find most frequent character</li>
 *     <li>String operations using Streams</li>
 * </ul>
 *
 * @author Naveen K Wodeyar
 * @date 28-Aug-2026
 */

public class StringInterviewPrograms {

    /**
     * Reverses a String.
     *
     * @param str input String
     * @return reversed String
     */
    public static String reverse(String str) {

        return new StringBuilder(str)
                .reverse()
                .toString();
    }

    /**
     * Checks whether a String is a palindrome.
     *
     * @param str input String
     * @return true if palindrome, otherwise false
     */
    public static boolean isPalindrome(String str) {

        return str.equalsIgnoreCase(reverse(str));
    }

    /**
     * Counts the frequency of every character.
     *
     * @param str input String
     * @return map containing character frequency
     */
    public static Map<Character, Long> characterFrequency(String str) {

        return str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ));
    }

    /**
     * Finds duplicate characters in a String.
     *
     * @param str input String
     * @return set containing duplicate characters
     */
    public static Set<Character> duplicateCharacters(String str) {

        return characterFrequency(str)
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    /**
     * Finds the first non-repeated character.
     *
     * @param str input String
     * @return first non-repeated character
     */
    public static Optional<Character> firstNonRepeatedCharacter(String str) {

        return characterFrequency(str)
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();
    }

    /**
     * Finds the first repeated character.
     *
     * @param str input String
     * @return first repeated character
     */
    public static Optional<Character> firstRepeatedCharacter(String str) {

        Set<Character> seen = new HashSet<>();

        return str.chars()
                .mapToObj(c -> (char) c)
                .filter(character -> !seen.add(character))
                .findFirst();
    }

    /**
     * Checks whether two Strings are anagrams.
     *
     * @param first first String
     * @param second second String
     * @return true if both Strings are anagrams
     */
    public static boolean isAnagram(String first, String second) {

        String firstSorted = first.replaceAll("\\s", "")
                .toLowerCase()
                .chars()
                .sorted()
                .collect(
                        StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append
                )
                .toString();

        String secondSorted = second.replaceAll("\\s", "")
                .toLowerCase()
                .chars()
                .sorted()
                .collect(
                        StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append
                )
                .toString();

        return firstSorted.equals(secondSorted);
    }

    /**
     * Reverses the order of words in a sentence.
     *
     * @param sentence input sentence
     * @return sentence with words in reverse order
     */
    public static String reverseWords(String sentence) {

        String[] words = sentence.trim().split("\\s+");

        return Arrays.stream(words)
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> {
                            Collections.reverse(list);
                            return String.join(" ", list);
                        }
                ));
    }

    /**
     * Reverses every individual word in a sentence.
     *
     * @param sentence input sentence
     * @return sentence with every word reversed
     */
    public static String reverseEachWord(String sentence) {

        return Arrays.stream(sentence.split("\\s+"))
                .map(StringInterviewPrograms::reverse)
                .collect(Collectors.joining(" "));
    }

    /**
     * Finds the longest word in a sentence.
     *
     * @param sentence input sentence
     * @return longest word
     */
    public static String longestWord(String sentence) {

        return Arrays.stream(sentence.split("\\s+"))
                .max(Comparator.comparingInt(String::length))
                .orElse("");
    }

    /**
     * Counts the number of words in a sentence.
     *
     * @param sentence input sentence
     * @return number of words
     */
    public static long wordCount(String sentence) {

        return Arrays.stream(sentence.trim().split("\\s+"))
                .count();
    }

    /**
     * Removes duplicate characters while preserving their order.
     *
     * @param str input String
     * @return String without duplicate characters
     */
    public static String removeDuplicateCharacters(String str) {

        return str.chars()
                .mapToObj(c -> (char) c)
                .distinct()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    /**
     * Finds the most frequently occurring character.
     *
     * @param str input String
     * @return most frequent character
     */
    public static Optional<Character> mostFrequentCharacter(String str) {

        return characterFrequency(str)
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }

    /**
     * Main method to execute all String programs.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        String str = "programming";
        String sentence = "Java is a powerful programming language";

        // ---------------------------------------------------------
        // 1. Reverse String
        // ---------------------------------------------------------
        System.out.println("1. Reverse String:");
        System.out.println(reverse(str));


        // ---------------------------------------------------------
        // 2. Check Palindrome
        // ---------------------------------------------------------
        System.out.println("\n2. Palindrome:");
        System.out.println(isPalindrome("madam"));


        // ---------------------------------------------------------
        // 3. Character Frequency
        // ---------------------------------------------------------
        System.out.println("\n3. Character Frequency:");
        System.out.println(characterFrequency(str));


        // ---------------------------------------------------------
        // 4. Duplicate Characters
        // ---------------------------------------------------------
        System.out.println("\n4. Duplicate Characters:");
        System.out.println(duplicateCharacters(str));


        // ---------------------------------------------------------
        // 5. First Non-Repeated Character
        // ---------------------------------------------------------
        System.out.println("\n5. First Non-Repeated Character:");
        System.out.println(firstNonRepeatedCharacter(str).orElse(null));


        // ---------------------------------------------------------
        // 6. First Repeated Character
        // ---------------------------------------------------------
        System.out.println("\n6. First Repeated Character:");
        System.out.println(firstRepeatedCharacter(str).orElse(null));


        // ---------------------------------------------------------
        // 7. Anagram
        // ---------------------------------------------------------
        System.out.println("\n7. Anagram:");
        System.out.println(isAnagram("listen", "silent"));


        // ---------------------------------------------------------
        // 8. Reverse Order of Words
        // ---------------------------------------------------------
        System.out.println("\n8. Reverse Words:");
        System.out.println(reverseWords(sentence));


        // ---------------------------------------------------------
        // 9. Reverse Each Word
        // ---------------------------------------------------------
        System.out.println("\n9. Reverse Each Word:");
        System.out.println(reverseEachWord(sentence));


        // ---------------------------------------------------------
        // 10. Longest Word
        // ---------------------------------------------------------
        System.out.println("\n10. Longest Word:");
        System.out.println(longestWord(sentence));


        // ---------------------------------------------------------
        // 11. Word Count
        // ---------------------------------------------------------
        System.out.println("\n11. Word Count:");
        System.out.println(wordCount(sentence));


        // ---------------------------------------------------------
        // 12. Remove Duplicate Characters
        // ---------------------------------------------------------
        System.out.println("\n12. Remove Duplicate Characters:");
        System.out.println(removeDuplicateCharacters(str));


        // ---------------------------------------------------------
        // 13. Most Frequent Character
        // ---------------------------------------------------------
        System.out.println("\n13. Most Frequent Character:");
        System.out.println(mostFrequentCharacter(str).orElse(null));
    }
}
