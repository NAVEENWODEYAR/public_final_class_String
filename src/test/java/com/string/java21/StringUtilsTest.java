package com.string.java21;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author Naveen K Wodeyar
 * @date 04-Oct-2024
 */
class StringUtilsTest {

    @Test
    void testReverse() {
        assertEquals("edcba", StringUtils.reverse("abcde"));
        assertEquals("12345", StringUtils.reverse("54321"));
        assertEquals("", StringUtils.reverse(""));
    }

    @Test
    void testIsPalindrome() {
        assertTrue(StringUtils.isPalindrome("madam"));
        assertTrue(StringUtils.isPalindrome("racecar"));
        assertFalse(StringUtils.isPalindrome("hello"));
        assertFalse(StringUtils.isPalindrome("world"));
    }

    @Test
    void testCountVowels() {
        assertEquals(5, StringUtils.countVowels("Hello World"));
        assertEquals(0, StringUtils.countVowels("bcdfghjkl"));
        assertEquals(3, StringUtils.countVowels("aeiouAEIOU"));
    }

    @Test
    void testCountVowels21() {
        assertEquals(5, StringUtils.countVowels21("Hello World"));
        assertEquals(0, StringUtils.countVowels21("bcdfghjkl"));
        assertEquals(10, StringUtils.countVowels21("aeiouaeiou"));
    }

    @Test
    void testRemoveDuplicates() {
        assertEquals("abcde", StringUtils.removeDuplicates("aaabbbcccde"));
        assertEquals("abc", StringUtils.removeDuplicates("abc"));
        assertEquals("", StringUtils.removeDuplicates(""));
    }
    
    @Test
    void testRemoveDuplicates21() {
        assertEquals("abcde", StringUtils.removeDuplicates21("aaabbbcccde"));
        assertEquals("abc", StringUtils.removeDuplicates21("abc"));
        assertEquals("", StringUtils.removeDuplicates21(""));
    }

    @Test
    void testFirstNonRepeating() {
        assertEquals('b', StringUtils.firstNonRepeating("abaccdeff"));
        assertNull(StringUtils.firstNonRepeating("aabbcc"));
        assertEquals('x', StringUtils.firstNonRepeating("xxyyzz"));
    }

    @Test
    void testAreAnagrams() {
        assertTrue(StringUtils.areAnagrams("Listen", "Silent"));
        assertFalse(StringUtils.areAnagrams("Hello", "World"));
        assertTrue(StringUtils.areAnagrams("Triangle", "Integral"));
    }

    @Test
    void testCapitalizeWords() {
        assertEquals("Hello World", StringUtils.capitalizeWords("hello world"));
        assertEquals("Java Programming", StringUtils.capitalizeWords("java programming"));
        assertEquals("", StringUtils.capitalizeWords(""));
    }

    @Test
    void testCountCharacterFrequencies() {
        Map<Character, Long> frequencies = StringUtils.countCharacterFrequencies("hello");
        assertEquals(1, frequencies.get('h'));
        assertEquals(1, frequencies.get('e'));
        assertEquals(2, frequencies.get('l'));
        assertEquals(1, frequencies.get('o'));
    }

    @Test
    void testJoinStrings() {
        assertEquals("Hello,World", StringUtils.joinStrings("Hello", "World"));
        assertEquals("Java,Programming", StringUtils.joinStrings("Java", "Programming"));
        assertEquals("", StringUtils.joinStrings());
    }

    @Test
    void testFindLongestWord() {
        assertEquals("longest", StringUtils.findLongestWord("Find the longest word"));
        assertEquals("", StringUtils.findLongestWord(""));
        assertEquals("Java", StringUtils.findLongestWord("Java C# Python"));
    }
}