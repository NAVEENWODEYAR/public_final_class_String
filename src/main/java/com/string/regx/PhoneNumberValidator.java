package com.string.regx;

import java.util.regex.*;

/**
 * @author Naveen K Wodeyar
 * @date 17-Jun-2025
 */

public class PhoneNumberValidator {
    public static void main(String[] args) {
        String phone = "9876543210";
        String regex = "^[6-9]\\d{9}$";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);
        
        System.out.println(matcher.matches() ? "Valid phone number" : "Invalid phone number");
    }
}
