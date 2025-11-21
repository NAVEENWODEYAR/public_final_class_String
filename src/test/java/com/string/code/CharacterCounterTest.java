package com.string.code;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * @author Naveen K Wodeyar
 * @date 21-Nov-2025
 */

public class CharacterCounterTest {

    @Test
    public void testNormalString() {
        assertEquals(10, CharacterCounter.countChars("Hello World")); 
    }

    @Test
    public void testMultipleSpaces() {
        assertEquals(5, CharacterCounter.countChars("H e l l o"));
    }

    @Test
    public void testOnlySpaces() {
        assertEquals(0, CharacterCounter.countChars("     "));
    }

    @Test
    public void testEmptyString() {
        assertEquals(0, CharacterCounter.countChars(""));
    }

    @Test
    public void testSpecialCharacters() {
        assertEquals(6, CharacterCounter.countChars("@#$_&*"));
    }

    @Test
    public void testUnicodeCharacters() {
        assertEquals(2, CharacterCounter.countChars("🙂 👍")); 
    }

    @Test
    public void testNullInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            CharacterCounter.countChars(null);
        });
    }
}
