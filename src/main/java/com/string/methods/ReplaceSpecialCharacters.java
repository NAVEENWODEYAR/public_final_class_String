package com.string.methods;

/**
 * @author Naveen K Wodeyar
 * @date 19-Jun-2025
 */

public class ReplaceSpecialCharacters {
    public static void main(String[] args) {
        String input = "Hello@World#2025!";
        // replaceAll uses regex, so we use [^a-zA-Z0-9]
        String output = input.replaceAll("[^a-zA-Z0-9]", " ");
        System.out.println(output); // Hello World 2025
        
        String inputDigits = "A1B2C3D4";
        String result = inputDigits.replaceAll("\\d", ""); // \d matches digits
        System.out.println(result); // ABCD
        
        String inputNumbers = "1 + 2 + 3";
        String replaceResult = inputNumbers.replace("+", "plus");     // No regex
        String replaceAllResult = inputNumbers.replaceAll("\\+", "plus"); // Escaped for regex

        System.out.println(replaceResult);     // 1 plus 2 plus 3
        System.out.println(replaceAllResult);  // 1 plus 2 plus 3
        
        String inputString = "  Java     is   great   ";
        String resultString = inputString.trim().replaceAll("\\s+", " ");
        System.out.println(result); // Java is great
        
        String inputRegx = "a+b(c)*d?";
        // Replace each special character with escaped version
        String escaped = inputRegx.replaceAll("([+*()?])", "\\\\$1");
        System.out.println(escaped); // a\+b\(c\)\*d\?
        
        String inputCaps = "Hello World Java Rocks";
        String resultCaps = inputCaps.replaceAll("\\b[A-Z][a-z]*\\b", "XXX");
        System.out.println(result); // XXX XXX XXX XXX
        
        String email = "john.doe@example.com";
        String masked = email.replaceAll("(?<=.).(?=.*@)", "*");
        System.out.println(masked); // j***.***@example.com
    }
}
