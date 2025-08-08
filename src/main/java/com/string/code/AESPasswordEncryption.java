package com.string.code;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

/**
 * @author Naveen K Wodeyar
 * @date 04-Aug-2025
 */

public class AESPasswordEncryption {

    private static final String AES = "AES";

    public static void main(String[] args) throws Exception {
        String password = "MySecretPassword";

        // Generate secret key
        SecretKey secretKey = generateKey(); // or load from somewhere
        String encodedKey = Base64.getEncoder().encodeToString(secretKey.getEncoded());
        System.out.println("Key (Base64): " + encodedKey);

        // Encrypt
        String encryptedPassword = encrypt(password, secretKey);
        System.out.println("Encrypted: " + encryptedPassword);

        // Decrypt
        String decryptedPassword = decrypt(encryptedPassword, secretKey);
        System.out.println("Decrypted: " + decryptedPassword);
    }

    // Generate random AES key
    public static SecretKey generateKey() throws Exception {
        KeyGenerator generator = KeyGenerator.getInstance(AES);
        generator.init(128); // 128-bit AES
        return generator.generateKey();
    }

    public static String encrypt(String data, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance(AES);
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedBytes = cipher.doFinal(data.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    public static String decrypt(String encryptedData, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance(AES);
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedData));
        return new String(decryptedBytes);
    }
}
