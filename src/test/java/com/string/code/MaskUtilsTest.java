package com.string.code;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Naveen K Wodeyar
 * @date 18-Oct-2025
 */

class MaskUtilsTest {

    @Test
    void testMaskEmail() {
        assertEquals("j***e@example.com", MaskUtils.maskEmail("joe@example.com"));
        assertEquals("a*@example.com", MaskUtils.maskEmail("ab@example.com"));
        assertEquals("***", MaskUtils.maskEmail("abc")); // invalid format
        assertNull(MaskUtils.maskEmail(null));
    }

    @Test
    void testMaskUsername() {
        assertEquals("a***e", MaskUtils.maskUsername("alice"));
        assertEquals("a*", MaskUtils.maskUsername("ab"));
        assertEquals("*", MaskUtils.maskUsername("a"));
        assertNull(MaskUtils.maskUsername(null));
    }

    @Test
    void testMaskPassword() {
        assertEquals("********", MaskUtils.maskPassword("secret123"));
        assertEquals("********", MaskUtils.maskPassword("s"));
        assertEquals("********", MaskUtils.maskPassword(""));
        assertNull(MaskUtils.maskPassword(null));
    }

    @Test
    void testMaskPhone() {
        assertEquals("***-***-4567", MaskUtils.maskPhone("123-456-4567"));
        assertEquals("+*-***-***-4567", MaskUtils.maskPhone("+1-555-123-4567"));
        assertEquals("(***) ***-6789", MaskUtils.maskPhone("(123) 456-6789"));
        assertEquals("456-78", MaskUtils.maskPhone("456-78")); // too short to mask
    }

    @Test
    void testMaskCreditCard() {
        assertEquals("************1111", MaskUtils.maskCreditCard("4111111111111111"));
        assertEquals("**** **** **** 1234", MaskUtils.maskCreditCard("1234 5678 9012 1234"));
        assertEquals("****-****-****-4321", MaskUtils.maskCreditCard("0000-1111-2222-4321"));
    }

    @Test
    void testMaskSSN() {
        assertEquals("***-**-6789", MaskUtils.maskSSN("123-45-6789"));
        assertEquals("*****6789", MaskUtils.maskSSN("123456789"));
        assertEquals("****", MaskUtils.maskSSN("1234")); // too short
    }

    @Test
    void testMaskInText_EmailPhonePassword() {
        String input = "User alice, email: john.doe@example.com, phone: +1-555-123-4567, password=secret123";
        String output = MaskUtils.maskInText(input);

        assertTrue(output.contains("j******e@example.com"));
        assertTrue(output.contains("+*-***-***-4567"));
        assertTrue(output.contains("password=********"));
        assertTrue(output.contains("a***e"));
    }

    @Test
    void testMaskInText_CreditCardAndSSN() {
        String input = "Card: 4111-1111-1111-1111, SSN: 123-45-6789";
        String output = MaskUtils.maskInText(input);

        assertTrue(output.contains("************1111"));
        assertTrue(output.contains("***-**-6789"));
    }

    @Test
    void testMaskInText_UsernamePatterns() {
        String input = "username=jack123, user: 'emma', Username:\"tony\"";
        String output = MaskUtils.maskInText(input);

        assertTrue(output.contains("username=j***3"));
        assertTrue(output.contains("user: 'e**a'") || output.contains("user: 'e*a'"));
        assertTrue(output.contains("Username:\"t**y\""));
    }

    @Test
    void testMaskInText_HandlesNullAndEmpty() {
        assertNull(MaskUtils.maskInText(null));
        assertEquals("", MaskUtils.maskInText(""));
    }
}
