/**
 * @author Naveen K Wodeyar
 * @date 21-Nov-2025
 */
package com.string.code;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CodeQualityAdvisorTest {

    @Test
    public void testMethodLengthAdvice() {
        assertEquals(
            "Keep methods short (ideally 20–30 lines). One method should do one thing (SRP). Split long methods into smaller reusable helpers.",
            CodeQualityAdvisor.advise("method length")
        );
    }

    @Test
    public void testClassSizeAdvice() {
        assertEquals(
            "A class should remain focused and cohesive. Prefer keeping classes under ~300 lines and ensure they have a single responsibility.",
            CodeQualityAdvisor.advise("class size")
        );
    }

    @Test
    public void testCyclomaticComplexity() {
        assertEquals(
            "Avoid high complexity (>10). Reduce nested loops/conditions by refactoring into smaller methods or using polymorphism.",
            CodeQualityAdvisor.advise("cyclomatic complexity")
        );
    }

    @Test
    public void testUnknown() {
        assertEquals(
            "Unknown topic. Try: method length, class size, cyclomatic complexity, naming.",
            CodeQualityAdvisor.advise("random")
        );
    }

    @Test
    public void testCaseInsensitive() {
        assertEquals(
            "Keep methods short (ideally 20–30 lines). One method should do one thing (SRP). Split long methods into smaller reusable helpers.",
            CodeQualityAdvisor.advise("MeThOd LeNgTh")
        );
    }
}
