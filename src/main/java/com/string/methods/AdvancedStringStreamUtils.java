package com.string.methods;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Advanced String Stream Utilities
 *
 * @author Naveen K Wodeyar
 * @date 19-Jun-2025
 */
public class AdvancedStringStreamUtils {

    // 1. First non-repeating character
    public static Optional<Character> firstNonRepeatingChar(String input) {
        return input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();
    }

    // 2. Group words by their first character
    public static Map<Character, List<String>> groupWordsByFirstChar(List<String> words) {
        return words.stream()
                .filter(w -> !w.isEmpty())
                .collect(Collectors.groupingBy(
                        w -> Character.toLowerCase(w.charAt(0))));
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
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
    }

    // 5. Most frequent character
    public static Optional<Character> mostFrequentCharacter(String input) {
        return input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }

    // 6. Sort words by length
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
        return input.chars()
                .allMatch(Character::isLetter);
    }

    // 10. Filter and join emails with specific domain
    public static String getEmailsByDomain(List<String> emails, String domain) {
        return emails.stream()
                .filter(email -> email.endsWith("@" + domain))
                .collect(Collectors.joining("; "));
    }

    // ==========================================================
    // Main Method - LeetCode Style Test Cases
    // ==========================================================

    public static void main(String[] args) {

        System.out.println("===============================================");
        System.out.println(" ADVANCED STRING STREAM UTILITIES TEST CASES");
        System.out.println("===============================================\n");

        // =====================================================
        // 1. First Non-Repeating Character
        // =====================================================

        System.out.println("1. FIRST NON-REPEATING CHARACTER");

        System.out.println("Input: swiss");
        System.out.println("Output: " + firstNonRepeatingChar("swiss"));
        // Expected: Optional[w]

        System.out.println("Input: aabbcc");
        System.out.println("Output: " + firstNonRepeatingChar("aabbcc"));
        // Expected: Optional.empty

        System.out.println("Input: leetcode");
        System.out.println("Output: " + firstNonRepeatingChar("leetcode"));
        // Expected: Optional[l]

        System.out.println("Input: \"\"");
        System.out.println("Output: " + firstNonRepeatingChar(""));
        // Expected: Optional.empty

        System.out.println();

        // =====================================================
        // 2. Group Words By First Character
        // =====================================================

        System.out.println("2. GROUP WORDS BY FIRST CHARACTER");

        List<String> words1 = Arrays.asList(
                "Apple",
                "Apricot",
                "Banana",
                "Blueberry",
                "Cherry",
                "Cat");

        System.out.println(groupWordsByFirstChar(words1));

        // Expected:
        // {a=[Apple, Apricot], b=[Banana, Blueberry], c=[Cherry, Cat]}

        System.out.println();

        // =====================================================
        // 3. Count Words With Prefix
        // =====================================================

        System.out.println("3. COUNT WORDS WITH PREFIX");

        List<String> words2 = Arrays.asList(
                "apple",
                "application",
                "banana",
                "app",
                "apply");

        System.out.println("Prefix: app");
        System.out.println(countWordsWithPrefix(words2, "app"));
        // Expected: 4

        System.out.println("Prefix: ban");
        System.out.println(countWordsWithPrefix(words2, "ban"));
        // Expected: 1

        System.out.println("Prefix: xyz");
        System.out.println(countWordsWithPrefix(words2, "xyz"));
        // Expected: 0

        System.out.println();

        // =====================================================
        // 4. Duplicate Characters
        // =====================================================

        System.out.println("4. FIND DUPLICATE CHARACTERS");

        System.out.println(findDuplicateCharacters("programming"));
        // Expected: [r, g, m]

        System.out.println(findDuplicateCharacters("mississippi"));
        // Expected: [s, i, p]

        System.out.println(findDuplicateCharacters("abcdef"));
        // Expected: []

        System.out.println();

        // =====================================================
        // 5. Most Frequent Character
        // =====================================================

        System.out.println("5. MOST FREQUENT CHARACTER");

        System.out.println(mostFrequentCharacter("mississippi"));
        // Expected: Optional[i]

        System.out.println(mostFrequentCharacter("aaaaabbb"));
        // Expected: Optional[a]

        System.out.println(mostFrequentCharacter("z"));
        // Expected: Optional[z]

        System.out.println();

        // =====================================================
        // 6. Sort Words By Length
        // =====================================================

        System.out.println("6. SORT WORDS BY LENGTH");

        System.out.println(
                sortWordsByLength("Java language is awesome and fun"));

        // Expected:
        // is and fun Java awesome language

        System.out.println();

        // =====================================================
        // 7. Remove Duplicate Words
        // =====================================================

        System.out.println("7. REMOVE DUPLICATE WORDS");

        System.out.println(
                dedupAndSortWords(
                        "banana apple cherry apple banana mango"));

        // Expected:
        // apple banana cherry mango

        System.out.println();

        // =====================================================
        // 8. List To CSV
        // =====================================================

        System.out.println("8. LIST TO CSV");

        System.out.println(
                listToCSV(Arrays.asList(
                        "Tom",
                        " Jerry ",
                        "",
                        "Spike",
                        "   ",
                        "Tyke")));

        // Expected:
        // Tom,Jerry,Spike,Tyke

        System.out.println();

        // =====================================================
        // 9. Alphabetic Check
        // =====================================================

        System.out.println("9. IS ALPHABETIC");

        System.out.println("OpenAI -> "
                + isAlphabetic("OpenAI"));
        // true

        System.out.println("HelloWorld -> "
                + isAlphabetic("HelloWorld"));
        // true

        System.out.println("GPT-4 -> "
                + isAlphabetic("GPT-4"));
        // false

        System.out.println("Hello World -> "
                + isAlphabetic("Hello World"));
        // false

        System.out.println();

        // =====================================================
        // 10. Emails By Domain
        // =====================================================

        System.out.println("10. FILTER EMAILS BY DOMAIN");

        List<String> emails = Arrays.asList(
                "alice@gmail.com",
                "bob@yahoo.com",
                "eve@gmail.com",
                "john@outlook.com",
                "mark@gmail.com");

        System.out.println("gmail.com");
        System.out.println(
                getEmailsByDomain(emails, "gmail.com"));
        // Expected:
        // alice@gmail.com; eve@gmail.com; mark@gmail.com

        System.out.println();

        System.out.println("yahoo.com");
        System.out.println(
                getEmailsByDomain(emails, "yahoo.com"));
        // Expected:
        // bob@yahoo.com

        System.out.println();

        System.out.println("hotmail.com");
        System.out.println(
                getEmailsByDomain(emails, "hotmail.com"));
        // Expected:
        // ""

        System.out.println("\n===============================================");
        System.out.println(" ALL TEST CASES EXECUTED SUCCESSFULLY");
        System.out.println("===============================================");
    }
}