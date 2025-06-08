package com.string.obj;

/**
 * @author Naveen K Wodeyar
 * @date 08-Jun-2025
 */

public class StringConcatTrick {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";
        String c = "HelloWorld";
        String d = a + b;
        String e = "Hello" + "World";

        System.out.println(c == d); // false - created at runtime
        System.out.println(c == e); // true - compile-time constant
    }
}
