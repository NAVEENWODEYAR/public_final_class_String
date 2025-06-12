package com.string.code;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Naveen K Wodeyar
 * @date 12-Jun-2025
 */

public class AdvancedStringUtilsTest {

    @Test
    void testCodePointAt() {
        assertEquals(0x1F600, AdvancedStringUtils.getCodePointAt("😀abc", 0)); // 😀 is U+1F600
    }

    @Test
    void testOffsetByCodePoints() {
        String str = "😀abc"; // 😀 is 2 chars in UTF-16
        assertEquals(2, AdvancedStringUtils.offsetByCodePoints(str, 0, 1));
    }

    @Test
    void testMatchesRegex() {
        assertTrue(AdvancedStringUtils.matchesRegex("abc123", "\\w+\\d+"));
    }

    @Test
    void testRegionMatches() {
        assertTrue(AdvancedStringUtils.regionMatches("HelloWorld", 5, "WorldWide", 0, 5));
    }

    @Test
    void testInterning() {
        String s1 = new String("Java").intern();
        String s2 = "Java";
        assertSame(s1, s2); // both point to same pool string
    }

    @Test
    void testStripWhitespace() {
        assertEquals("Hello", AdvancedStringUtils.stripWhitespace(" \tHello\n"));
    }

    @Test
    void testRepeatString() {
        assertEquals("HaHaHa", AdvancedStringUtils.repeatString("Ha", 3));
    }

    @Test
    void testEscapeUnicode() {
        assertEquals("\\u0048\\u0065\\u006C\\u006C\\u006F", AdvancedStringUtils.escapeUnicode("Hello"));
    }

    @Test
    void testSurrogatePairs() {
        assertTrue(AdvancedStringUtils.containsSurrogatePair("😀")); // uses surrogate pair
        assertFalse(AdvancedStringUtils.containsSurrogatePair("Hello"));
    }

    @Test
    void testIndent() {
        String input = "Line1\nLine2";
        String expected = "  Line1\n  Line2\n";
        assertEquals(expected, AdvancedStringUtils.indentString(input, 2));
    }
}
