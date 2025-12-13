package com.string.code.realWorld;

/**
 * @author Naveen K Wodeyar
 * @date 13-Dec-2025
 */

public class TypeCastingExample {

    public static void main(String[] args) {

        // Widening Type Casting (Automatic)
        int intValue = 100;
        long longValue = intValue;      // int -> long
        float floatValue = longValue;   // long -> float

        System.out.println("Widening Type Casting:");
        System.out.println("int value   : " + intValue);
        System.out.println("long value  : " + longValue);
        System.out.println("float value : " + floatValue);

        System.out.println();

        // Narrowing Type Casting (Manual)
        double doubleValue = 123.45;
        int intResult = (int) doubleValue;   // double -> int
        byte byteValue = (byte) intResult;   // int -> byte

        System.out.println("Narrowing Type Casting:");
        System.out.println("double value : " + doubleValue);
        System.out.println("int value    : " + intResult);
        System.out.println("byte value   : " + byteValue);
    }
}
