package com.string.code;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * @author Naveen K Wodeyar
 * @date 24-Nov-2025
 */

public class ReverseStringTest {

    @Test
    void testNormalString() {
        assertEquals("dlroW olleH", ReverseString.reverse("Hello World"));
    }

    @Test
    void testEmptyString() {
        assertEquals("", ReverseString.reverse(""));
    }

    @Test
    void testSingleCharacter() {
        assertEquals("A", ReverseString.reverse("A"));
    }

    @Test
    void testPalindrome() {
        assertEquals("madam", ReverseString.reverse("madam"));
    }

    @Test
    void testWithSpaces() {
        assertEquals("skcor ia nepo", ReverseString.reverse("open ai rocks"));
    }

    @Test
    void testNumbers() {
        assertEquals("987654321", ReverseString.reverse("123456789"));
    }

    @Test
    void testSpecialCharacters() {
        assertEquals("!TPGtahC@", ReverseString.reverse("@ChatGPT!"));
    }

    @Test
    void testMixedCase() {
        assertEquals("GfEdCbA", ReverseString.reverse("AbCdEfG"));
    }

    @Test
    void testNullInput() {
        assertNull(ReverseString.reverse(null));
    }

    @Test
    void testUnicodeEmoji() {
        assertEquals("🚀🔥🙂", ReverseString.reverse("🙂🔥🚀"));
    }
}
