package com.string.code;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * @author Naveen K Wodeyar
 * @date 25-May-2025
 */

class IsomorphicStringsTest {

    IsomorphicStrings iso = new IsomorphicStrings();

    @Test
    void testIsomorphic_TrueCases() {
        assertTrue(iso.isIsomorphic("egg", "add"));
        assertTrue(iso.isIsomorphic("paper", "title"));
        assertTrue(iso.isIsomorphic("abc", "def"));
        assertTrue(iso.isIsomorphic("", ""));
    }

    @Test
    void testIsomorphic_FalseCases() {
        assertFalse(iso.isIsomorphic("foo", "bar"));
        assertFalse(iso.isIsomorphic("ab", "aa"));
        assertFalse(iso.isIsomorphic("abca", "zbxz"));
        assertFalse(iso.isIsomorphic("aab", "xyz"));
    }

    @Test
    void testIsomorphic_DifferentLengths() {
        assertFalse(iso.isIsomorphic("abc", "de"));
    }

    @Test
    void testIsomorphic_SingleChar() {
        assertTrue(iso.isIsomorphic("a", "b"));
        assertFalse(iso.isIsomorphic("a", "aa")); // Should be false since lengths differ
    }
}

