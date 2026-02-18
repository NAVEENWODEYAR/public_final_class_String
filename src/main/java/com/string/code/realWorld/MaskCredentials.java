package com.string.code.realWorld;

import java.util.Scanner;

/**
 * @author Naveen K Wodeyar
 * @date 18-Feb-2026
 */

public class MaskCredentials {

    public static String maskUsername(String username) {
    	
        if (username.length() <= 2) {
            return "*".repeat(username.length());
        }

        String first = username.substring(0, 1);
        String last = username.substring(username.length() - 1);
        String stars = "*".repeat(username.length() - 2);

        return first + stars + last;
    }

    public static String maskPassword(String password) {
        return "*".repeat(password.length());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        String maskedUsername = maskUsername(username);
        String maskedPassword = maskPassword(password);

        System.out.println("\nMasked Username: " + maskedUsername);
        System.out.println("Masked Password: " + maskedPassword);

        sc.close();
    }
}
