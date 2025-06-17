package com.string.regx;

import java.util.regex.*;

/**
 * @author Naveen K Wodeyar
 * @date 17-Jun-2025
 */

public class ExtractNumbers {
    public static void main(String[] args) {
        String text = "Order 123 was placed on 2025-06-17 and shipped with ID 98765";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);
        
        while (matcher.find()) {
            System.out.println("Found number: " + matcher.group());
        }
    }
}

