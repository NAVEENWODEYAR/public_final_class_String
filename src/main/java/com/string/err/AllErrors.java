package com.string.err;

/**
 * @author Naveen K Wodeyar
 * @date 12-Aug-2026
 */

public class AllErrors {

    public static void main(String[] args) {

        System.out.println("JAVA ERROR DEMONSTRATION");

        // Uncomment ONE method at a time to demonstrate the error.

        // compileTimeError();

        logicalError();

        // arithmeticException();
        // arrayIndexError();
        // nullPointerException();
        // numberFormatException();
        // stringIndexError();
        // classCastException();

        // stackOverflowError();
        // outOfMemoryError();

    }

    // ---------------------------------------------------------
    // 1. COMPILE-TIME ERROR
    // ---------------------------------------------------------
    static void compileTimeError() {

        // Missing semicolon produces a compile-time error.
        // int a = 10

        // Uncomment the line below:
        // int a = "Hello";

        System.out.println("Compile-time error example");
    }


    // ---------------------------------------------------------
    // 2. LOGICAL ERROR
    // ---------------------------------------------------------
    static void logicalError() {

        int length = 10;
        int breadth = 5;

        // Wrong formula: + is used instead of *
        int area = length + breadth;

        System.out.println("Logical Error:");
        System.out.println("Expected Area = 50");
        System.out.println("Actual Area   = " + area);
    }


    // ---------------------------------------------------------
    // 3. ARITHMETIC EXCEPTION
    // ---------------------------------------------------------
    static void arithmeticException() {

        int a = 10;
        int b = 0;

        System.out.println(a / b);
    }


    // ---------------------------------------------------------
    // 4. ARRAY INDEX OUT OF BOUNDS EXCEPTION
    // ---------------------------------------------------------
    static void arrayIndexError() {

        int[] numbers = {10, 20, 30};

        // Valid indexes are 0, 1 and 2.
        System.out.println(numbers[5]);
    }


    // ---------------------------------------------------------
    // 5. NULL POINTER EXCEPTION
    // ---------------------------------------------------------
    static void nullPointerException() {

        String name = null;

        System.out.println(name.length());
    }


    // ---------------------------------------------------------
    // 6. NUMBER FORMAT EXCEPTION
    // ---------------------------------------------------------
    static void numberFormatException() {

        String value = "ABC";

        int number = Integer.parseInt(value);

        System.out.println(number);
    }


    // ---------------------------------------------------------
    // 7. STRING INDEX OUT OF BOUNDS EXCEPTION
    // ---------------------------------------------------------
    static void stringIndexError() {

        String text = "Java";

        // Valid indexes are 0 to 3.
        System.out.println(text.charAt(10));
    }


    // ---------------------------------------------------------
    // 8. CLASS CAST EXCEPTION
    // ---------------------------------------------------------
    static void classCastException() {

        Object obj = Integer.valueOf(100);

        // Integer cannot be converted to String using casting.
        String str = (String) obj;

        System.out.println(str);
    }


    // ---------------------------------------------------------
    // 9. STACK OVERFLOW ERROR
    // ---------------------------------------------------------
    static void stackOverflowError() {

        recursiveMethod();
    }

    static void recursiveMethod() {

        // Infinite recursion causes StackOverflowError.
        recursiveMethod();
    }


    // ---------------------------------------------------------
    // 10. OUT OF MEMORY ERROR
    // ---------------------------------------------------------
    static void outOfMemoryError() {

        // Attempts to allocate a very large array.
        int[] array = new int[Integer.MAX_VALUE];

        System.out.println(array.length);
    }
}