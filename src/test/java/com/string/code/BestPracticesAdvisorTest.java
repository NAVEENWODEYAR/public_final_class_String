package com.string.code;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * @author Naveen K Wodeyar
 * @date 20-Nov-2025
 */

public class BestPracticesAdvisorTest {

    @Test
    public void testCleanCode() {
        assertEquals(
            "Use meaningful variable names, write small methods, and avoid duplication.",
            BestPracticesAdvisor.getBestPractice("clean code")
        );
    }

    @Test
    public void testTesting() {
        assertEquals(
            "Write unit tests, follow AAA (Arrange-Act-Assert), and test edge cases.",
            BestPracticesAdvisor.getBestPractice("testing")
        );
    }

    @Test
    public void testUnknownTopic() {
        assertEquals(
            "Unknown topic. Try: clean code, testing, performance, security, oop.",
            BestPracticesAdvisor.getBestPractice("xyz")
        );
    }

    @Test
    public void testCaseInsensitivity() {
        assertEquals(
            "Use meaningful variable names, write small methods, and avoid duplication.",
            BestPracticesAdvisor.getBestPractice("ClEaN CoDe")
        );
    }
}
