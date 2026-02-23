package com.string.code.realWorld;

import java.io.Console;

/**
 * @author Naveen K Wodeyar
 * @date 18-Feb-2026
 */

public class SecureInputExample {
    public static void main(String[] args) {
        Console console = System.console();

        if (console == null) {
            System.out.println("Console not available");
            return;
        }

        String username = console.readLine("Enter Username: ");
        char[] passwordArray = console.readPassword("Enter Password: ");

        String maskedUsername = username.charAt(0) + 
                                "*".repeat(username.length() - 2) + 
                                username.charAt(username.length() - 1);

        String maskedPassword = "*".repeat(passwordArray.length);

        System.out.println("Masked Username: " + maskedUsername);
        System.out.println("Masked Password: " + maskedPassword);
    }
}
