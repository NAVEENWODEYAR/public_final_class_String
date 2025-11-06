package com.string.code;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Naveen K Wodeyar
 * @date 06-Nov-2025
 */

public class CheckStringContentTest {

    @Test
    void testNullString() {
        assertFalse(CheckStringContent.hasContentGreaterThanOne(null), "Null string should return false");
    }

    @Test
    void testEmptyString() {
        assertFalse(CheckStringContent.hasContentGreaterThanOne(""), "Empty string should return false");
    }

    @Test
    void testSingleCharacterString() {
        assertFalse(CheckStringContent.hasContentGreaterThanOne("A"), "Single-character string should return false");
    }

    @Test
    void testTwoCharacterString() {
        assertTrue(CheckStringContent.hasContentGreaterThanOne("{}"), "Two-character string should return true");
    }

    @Test
    void testLongerString() {
        assertTrue(CheckStringContent.hasContentGreaterThanOne("Hello"), "String with length > 1 should return true");
    }
}

