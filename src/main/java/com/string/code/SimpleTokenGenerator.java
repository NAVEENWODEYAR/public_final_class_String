package com.string.code;

import java.util.Base64;
import java.util.UUID;

/**
 * @author Naveen K Wodeyar
 * @date 21-Jun-2025
 */

public class SimpleTokenGenerator {

    // Generate token from username
    public static String generateToken(String username) {
        String uuid = UUID.randomUUID().toString();
        long timestamp = System.currentTimeMillis();
        String rawToken = username + ":" + uuid + ":" + timestamp;
        return Base64.getEncoder().encodeToString(rawToken.getBytes());
    }

    // Decode token (for validation or inspection)
    public static String decodeToken(String token) {
        byte[] decodedBytes = Base64.getDecoder().decode(token);
        return new String(decodedBytes);
    }
    
    public static void main(String[] args) {
        String username = "user123"; // Example username
        String token = generateToken(username);
        System.out.println("Generated Token: " + token);
    }
}
