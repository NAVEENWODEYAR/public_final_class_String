package com.string.methods;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Naveen K Wodeyar
 * @date 19-Jun-2025
 */

class AdvancedStringStreamUtilsTest {

    @Test
    void testFirstNonRepeatingChar() {
        assertEquals(Optional.of('w'), AdvancedStringStreamUtils.firstNonRepeatingChar("swiss"));
        assertEquals(Optional.empty(), AdvancedStringStreamUtils.firstNonRepeatingChar("aabbcc"));
    }

    @Test
    void testGroupWordsByFirstChar() {
        List<String> words = List.of("apple", "banana", "apricot", "cherry");
        Map<Character, List<String>> grouped = AdvancedStringStreamUtils.groupWordsByFirstChar(words);
        assertEquals(List.of("apple", "apricot"), grouped.get('a'));
        assertEquals(List.of("banana"), grouped.get('b'));
    }

    @Test
    void testCountWordsWithPrefix() {
        List<String> words = List.of("apple", "apron", "bat");
        assertEquals(2, AdvancedStringStreamUtils.countWordsWithPrefix(words, "ap"));
    }

    @Test
    void testFindDuplicateCharacters() {
        assertEquals(Set.of('r', 'g', 'm'), AdvancedStringStreamUtils.findDuplicateCharacters("programming"));
        assertTrue(AdvancedStringStreamUtils.findDuplicateCharacters("abcd").isEmpty());
    }

    @Test
    void testMostFrequentCharacter() {
        assertEquals(Optional.of('s'), AdvancedStringStreamUtils.mostFrequentCharacter("mississippi"));
    }

    @Test
    void testSortWordsByLength() {
        String result = AdvancedStringStreamUtils.sortWordsByLength("Java is fun");
        assertEquals("is fun Java", result);
    }

    @Test
    void testDedupAndSortWords() {
        String input = "banana apple cherry apple banana";
        String expected = "apple banana cherry";
        assertEquals(expected, AdvancedStringStreamUtils.dedupAndSortWords(input));
    }

    @Test
    void testListToCSV() {
        List<String> list = List.of("Tom", "Jerry", "Spike");
        assertEquals("Tom,Jerry,Spike", AdvancedStringStreamUtils.listToCSV(list));
    }

    @Test
    void testIsAlphabetic() {
        assertTrue(AdvancedStringStreamUtils.isAlphabetic("OpenAI"));
        assertFalse(AdvancedStringStreamUtils.isAlphabetic("GPT-4o"));
    }

    @Test
    void testGetEmailsByDomain() {
        List<String> emails = List.of("alice@gmail.com", "bob@yahoo.com", "eve@gmail.com");
        String expected = "alice@gmail.com; eve@gmail.com";
        assertEquals(expected, AdvancedStringStreamUtils.getEmailsByDomain(emails, "gmail.com"));
    }
}
