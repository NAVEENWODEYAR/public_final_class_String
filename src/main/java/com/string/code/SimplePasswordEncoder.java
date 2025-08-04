package com.string.code;

import java.util.Base64;

/**
 * @author Naveen K Wodeyar
 * @date 04-Aug-2025
 */

public class SimplePasswordEncoder {

    public static void main(String[] args) {
        String originalPassword = "MySecret123";

        // Encode
        String encoded = Base64.getEncoder().encodeToString(originalPassword.getBytes());
        System.out.println("Encoded password: " + encoded);

        // Decode
        byte[] decodedBytes = Base64.getDecoder().decode(encoded);
        String decoded = new String(decodedBytes);
        System.out.println("Decoded password: " + decoded);
    }
}
