package com.string.regx;

import java.util.regex.*;

/**
 * @author Naveen K Wodeyar
 * @date 17-Jun-2025
 */

public class EmailValidator {
    public static void main(String[] args) {
        String email = "test.user@example.com";
        String regex = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        
        if (matcher.matches()) {
            System.out.println("Valid email address.");
        } else {
            System.out.println("Invalid email address.");
        }
    }
}
