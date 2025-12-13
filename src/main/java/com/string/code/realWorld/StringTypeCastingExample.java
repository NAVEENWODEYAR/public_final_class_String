package com.string.code.realWorld;

/**
 * @author Naveen K Wodeyar
 * @date 14-Dec-2025
 */

public class StringTypeCastingExample {

    public static void main(String[] args) {

        // String to int
        String s1 = "2";
        int intValue = Integer.parseInt(s1);
        System.out.println("\"2\" -> int : " + intValue);

        // String to double
        String s2 = "45.67";
        double doubleValue = Double.parseDouble(s2);
        System.out.println("\"45.67\" -> double : " + doubleValue);

        // String to char
        String s3 = "A";
        char charValue = s3.charAt(0);
        System.out.println("\"A\" -> char : " + charValue);

        // String number to char (ASCII value)
        String s4 = "66";
        char asciiChar = (char) Integer.parseInt(s4);
        System.out.println("\"66\" -> char (ASCII) : " + asciiChar);

        // String to boolean
        String s5 = "true";
        boolean boolValue = Boolean.parseBoolean(s5);
        System.out.println("\"true\" -> boolean : " + boolValue);

        System.out.println("\n--- Invalid / Edge Cases ---");

        // Invalid: String "1" to char 't' (NOT possible)
        String invalid = "1";
        System.out.println("\"1\" -> char 't' : NOT POSSIBLE");

        // Safe check example
        try {
            Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("\"abc\" -> int : NumberFormatException");
        }
    }
}
