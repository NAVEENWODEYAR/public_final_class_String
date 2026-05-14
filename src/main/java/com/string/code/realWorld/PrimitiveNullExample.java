package com.string.code.realWorld;

/**
 * @author Naveen K Wodeyar
 * @date 06-Mar-2026
 */

public class PrimitiveNullExample {

    public static void main(String[] args) {

        // Primitive variable (cannot be null)
        int a = 10;
        System.out.println("Primitive value:\n " + a);

        // Wrapper class that can be null
        Integer b = null;

        // Safe check before converting to primitive
        int value = (b != null) ? b : 0;   // default value if null

        System.out.println("Safe primitive value:\n " + value);

        // Another example with Double
        Double d = null;
        double result = (d != null) ? d : 0.0;

        System.out.println("Safe double value:\n " + result);
    }
    
}