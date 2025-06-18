package com.string.code;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Naveen K Wodeyar
 * @date 18-Jun-2025
 */

public class UserInputProcessorTest {

    @Test
    public void testValidMixedCaseInput() {
        UserInputProcessor processor = new UserInputProcessor();
        String input = "hello@2023";
        // sanitize: "hello2023"
        // formatCase: "HELLO2023"
        // addPrefixIfNeeded: SHORT_
        assertEquals("SHORT_HELLO2023", processor.processInput(input));
    }

    @Test
    public void testAllUppercaseInput() {
        UserInputProcessor processor = new UserInputProcessor();
        String input = "   JAVA PROGRAMMING!!!  ";
        // sanitize: "JAVA PROGRAMMING"
        // formatCase: lowercase
        // length > 10 → LONG_
        assertEquals("LONG_java programming", processor.processInput(input));
    }

    @Test
    public void testShortLowercaseInput() {
        UserInputProcessor processor = new UserInputProcessor();
        String input = " code ";
        // sanitize: "code"
        // formatCase: uppercase → "CODE"
        // addPrefix: SHORT_
        assertEquals("SHORT_CODE", processor.processInput(input));
    }

    @Test
    public void testEmptyInput() {
        UserInputProcessor processor = new UserInputProcessor();
        String input = "  ";
        assertEquals("INVALID_INPUT", processor.processInput(input));
    }

    @Test
    public void testNullInput() {
        UserInputProcessor processor = new UserInputProcessor();
        String input = null;
        assertEquals("INVALID_INPUT", processor.processInput(input));
    }
}
