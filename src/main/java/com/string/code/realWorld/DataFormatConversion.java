package com.string.code.realWorld;

/**
 * @author Naveen K Wodeyar
 * @date 12-Dec-2025
 */

public class DataFormatConversion {

    public static void main(String[] args) {

        // ----------- Primitive Type Casting -----------
        int intVal = 42;
        double doubleVal = intVal;          // Widening (automatic)
        int newInt = (int) doubleVal;       // Narrowing (explicit)

        System.out.println("Widening int → double: " + doubleVal);
        System.out.println("Narrowing double → int: " + newInt);


        // ----------- Char & Int Conversion -----------
        char charVal = 'A';
        int asciiValue = charVal;           // char → int
        char charAgain = (char) asciiValue; // int → char

        System.out.println("Char to ASCII: " + asciiValue);
        System.out.println("ASCII back to char: " + charAgain);


        // ----------- String Conversions -----------
        String numStr = "123";
        int strToInt = Integer.parseInt(numStr);
        double strToDouble = Double.parseDouble(numStr);

        System.out.println("String → int: " + strToInt);
        System.out.println("String → double: " + strToDouble);


        // ----------- Converting Primitive to String -----------
        String intToStr = String.valueOf(intVal);
        String doubleToStr = String.valueOf(doubleVal);

        System.out.println("int → String: " + intToStr);
        System.out.println("double → String: " + doubleToStr);


        // ----------- Wrapper Class Conversions -----------
        Integer intObj = Integer.valueOf("200");
        Double doubleObj = Double.valueOf("50.75");

        System.out.println("String → Integer object: " + intObj);
        System.out.println("String → Double object: " + doubleObj);


        // ----------- Number Formatting -----------
        double price = 1234.5678;
        String formattedPrice = String.format("%.2f", price);

        System.out.println("Formatted number (2 decimals): " + formattedPrice);


        // ----------- Boolean Conversion -----------
        String boolStr = "true";
        boolean boolVal = Boolean.parseBoolean(boolStr);
        System.out.println("String → boolean: " + boolVal);

    }
}
