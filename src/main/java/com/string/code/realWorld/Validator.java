package com.string.code.realWorld;

import java.util.regex.*;

/**
 * @author Naveen K Wodeyar
 * @date 12-Dec-2025
 */

public class Validator {

    // Email regex (simple and commonly used)
    private static final String EMAIL_REGEX =
            "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    // Indian phone number regex
    // Accepts:
    //  - 10 digits (e.g., 9876543210)
    //  - +91 followed by 10 digits
    //  - 0 followed by 10 digits
    private static final String PHONE_REGEX =
            "^(\\+91[- ]?)?[0]?[6-9]\\d{9}$";

    public static boolean isValidEmail(String email) {
        return email != null && email.matches(EMAIL_REGEX);
    }

    public static boolean isValidIndianPhone(String phone) {
        return phone != null && phone.matches(PHONE_REGEX);
    }

    public static void main(String[] args) {
        String email = "example@test.com";
        String phone = "+91 9876543210";

        System.out.println("Email: " + email +
                " -> " + (isValidEmail(email) ? "Valid" : "Invalid"));

        System.out.println("Phone: " + phone +
                " -> " + (isValidIndianPhone(phone) ? "Valid" : "Invalid"));
    }
}
