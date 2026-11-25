/**
 * @author Naveen K Wodeyar
 * @date 25-Nov-2026
 */
package com.string.code.realWorld;


public class CredentialMasking {

    // Mask password
    public static String maskPassword(String password) {
        return "*".repeat(password.length());
    }

    // Mask credit card number
    public static String maskCard(String cardNumber) {
        if (cardNumber.length() <= 4) {
            return "****";
        }

        return "*".repeat(cardNumber.length() - 4)
                + cardNumber.substring(cardNumber.length() - 4);
    }

    // Mask email address
    public static String maskEmail(String email) {
        String[] parts = email.split("@");

        if (parts.length != 2 || parts[0].isEmpty()) {
            return "****";
        }

        return parts[0].charAt(0)
                + "****@" + parts[1];
    }

    // Mask API key
    public static String maskApiKey(String apiKey) {
        if (apiKey.length() <= 4) {
            return "****";
        }

        return "****" +
                apiKey.substring(apiKey.length() - 4);
    }

    public static void main(String[] args) {

        String password = "MyPassword123";
        String cardNumber = "1234567890123456";
        String email = "john.doe@gmail.com";
        String apiKey = "ABCD123456789XYZ";

        System.out.println("Credential Masking Demo");
        System.out.println("-----------------------");

        System.out.println("Original Password: " + password);
        System.out.println("Masked Password: "
                + maskPassword(password));

        System.out.println("\nOriginal Card: " + cardNumber);
        System.out.println("Masked Card: "
                + maskCard(cardNumber));

        System.out.println("\nOriginal Email: " + email);
        System.out.println("Masked Email: "
                + maskEmail(email));

        System.out.println("\nOriginal API Key: " + apiKey);
        System.out.println("Masked API Key: "
                + maskApiKey(apiKey));
    }
}
