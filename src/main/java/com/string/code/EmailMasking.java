/**
 * @author Naveen K Wodeyar
 * @date 17-May-2025
 */
package com.string.code;

public class EmailMasking {
    public static String maskEmail(String email) {
        int atIndex = email.indexOf("@");
        if (atIndex <= 1) return email; // Invalid or too short

        String name = email.substring(0, atIndex);
        String domain = email.substring(atIndex);
        return name.charAt(0) + "*****" + name.charAt(name.length() - 1) + domain;
    }

    public static void main(String[] args) {
        System.out.println(maskEmail("john.doe@example.com"));  // Output: j*****e@example.com
    }
}

