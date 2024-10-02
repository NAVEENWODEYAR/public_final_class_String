package com.string.code;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Naveen K Wodeyar
 * @date 02-Oct-2024
 */
class AnagramStringTest {
    
    private AnagramString anagramString;

    @BeforeEach
    void setUp() {
        anagramString = new AnagramString();
    }

    @Test
    @DisplayName("Anagram Check - Positive Test Case")
    void testAnagrams() {
        assertTrue(AnagramString.areAnagrams("listen", "silent"));
        assertTrue(AnagramString.areAnagrams("triangle", "integral"));
    }

    @Test
    @DisplayName("Anagram Check - Negative Test Case")
    void testNotAnagrams() {
        assertFalse(AnagramString.areAnagrams("hello", "world"));
        assertFalse(AnagramString.areAnagrams("apple", "pale"));
    }

    @Test
    @DisplayName("Anagram Check - Case Sensitivity")
    void testCaseSensitivity() {
        assertTrue(AnagramString.areAnagrams("Listen", "Silent"));
    }

    @Test
    @DisplayName("Anagram Check - Empty Strings")
    void testEmptyStrings() {
        assertTrue(AnagramString.areAnagrams("", ""));
    }
}
