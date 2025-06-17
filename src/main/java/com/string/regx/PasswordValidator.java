package com.string.regx;

import java.util.regex.*;

/**
 * @author Naveen K Wodeyar
 * @date 17-Jun-2025
 */

public class PasswordValidator {
    public static void main(String[] args) {
        String password = "Strong@123";
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        System.out.println(matcher.matches() ? "Strong password" : "Weak password");
    }
}

