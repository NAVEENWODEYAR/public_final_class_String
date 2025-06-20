package com.string.code;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Base64;

/**
 * @author Naveen K Wodeyar
 * @date 21-Jun-2025
 */

public class SimpleTokenGeneratorTest {

    @Test
    public void testGenerateTokenNotNull() {
        String token = SimpleTokenGenerator.generateToken("testUser");
        assertNotNull(token, "Token should not be null");
    }

    @Test
    public void testGenerateTokenIsBase64Encoded() {
        String token = SimpleTokenGenerator.generateToken("testUser");
        assertDoesNotThrow(() -> {
            byte[] decoded = Base64.getDecoder().decode(token);
            assertNotNull(decoded);
        });
    }

    @Test
    public void testDecodeTokenContainsUsername() {
        String username = "testUser";
        String token = SimpleTokenGenerator.generateToken(username);
        String decoded = SimpleTokenGenerator.decodeToken(token);

        assertTrue(decoded.contains(username), "Decoded token should contain the username");
    }

    @Test
    public void testTokenFormat() {
        String username = "testUser";
        String token = SimpleTokenGenerator.generateToken(username);
        String decoded = SimpleTokenGenerator.decodeToken(token);
        String[] parts = decoded.split(":");

        assertEquals(3, parts.length, "Token should contain three parts: username, UUID, timestamp");
        assertEquals(username, parts[0], "Username should match");
    }
}
