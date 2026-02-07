package com.string.code;

/**
 * @author Naveen K Wodeyar
 * @date 06-Feb-2026
 */

public class NullCheckDemo {

    static class Person {
        String name;
    }

    public static void main(String[] args) {

        // 1. Primitive data types
        int primitiveInt = 10;
        boolean primitiveBoolean = false;

        // No null checks possible for primitives
        System.out.println("Primitive int value: " + primitiveInt);
        System.out.println("Primitive boolean value: " + primitiveBoolean);

        // 2. Wrapper classes
        Integer wrapperInt = null;
        Double wrapperDouble = 12.5;

        if (wrapperInt == null) {
            System.out.println("wrapperInt is null");
        }

        if (wrapperDouble != null) {
            System.out.println("wrapperDouble is NOT null");
        }

        // 3. String
        String text = null;

        if (text == null) {
            System.out.println("String is null");
        }

        // 4. Array
        int[] numbers = null;

        if (numbers == null) {
            System.out.println("Array is null");
        }

        // 5. Custom object
        Person person = null;

        if (person == null) {
            System.out.println("Person object is null");
        }

        // 6. Collection
        java.util.List<String> list = null;

        if (list == null) {
            System.out.println("List is null");
        }
    }
}
