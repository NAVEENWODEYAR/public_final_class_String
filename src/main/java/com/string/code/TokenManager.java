package com.string.code;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author Naveen K Wodeyar
 * @date 21-Jun-2025
 */

public class TokenManager {

    // Allowed characters for token generation
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final int TOKEN_LENGTH = 16;

    // Hardcoded AES key (Base64) - In production, load this from a secure location
    private static final String SECRET_KEY_STRING = "w7Dp9wPqYvK+zj13Dkf9oQ=="; // Example key (Base64)

    public static void main(String[] args) throws Exception {
        // Step 1: Generate a random token
        String token = generateToken(TOKEN_LENGTH);
        System.out.println("Original Token: " + token);

        // Step 2: Load secret key
        SecretKey secretKey = decodeAESKey(SECRET_KEY_STRING);

        // Step 3: Encrypt the token
        String encryptedToken = encrypt(token, secretKey);
        System.out.println("Encrypted Token: " + encryptedToken);

        // Step 4: Decrypt the token
        String decryptedToken = decrypt(encryptedToken, secretKey);
        System.out.println("Decrypted Token: " + decryptedToken);
    }

    // Generate a random alphanumeric token using Java Streams
    public static String generateToken(int length) {
        Random random = new Random();
        return random.ints(length, 0, CHARACTERS.length())
                     .mapToObj(CHARACTERS::charAt)
                     .map(Object::toString)
                     .collect(Collectors.joining());
    }

    // Generate a new AES key (used for initial setup or testing)
    public static SecretKey generateAESKey() throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(128); // AES-128
        return keyGen.generateKey();
    }

    // Convert Base64 string to AES SecretKey
    public static SecretKey decodeAESKey(String base64Key) {
        byte[] decodedKey = Base64.getDecoder().decode(base64Key);
        return new SecretKeySpec(decodedKey, 0, decodedKey.length, "AES");
    }

    // Encrypt a string using AES
    public static String encrypt(String data, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encrypted = cipher.doFinal(data.getBytes());
        return Base64.getEncoder().encodeToString(encrypted);
    }

    // Decrypt a string using AES
    public static String decrypt(String encryptedData, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decoded = Base64.getDecoder().decode(encryptedData);
        byte[] decrypted = cipher.doFinal(decoded);
        return new String(decrypted);
    }
}
