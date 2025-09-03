package com.string.code.realWorld;

/**
 * @author Naveen K Wodeyar
 * @date 03-Sept-2025
 */

public class NullPointerExceptionDemo {

    public static void main(String[] args) {
        System.out.println("Demo: NullPointerException Scenarios and Fixes\n");

        scenario1();
        scenario2();
        scenario3();
        scenario4();
        scenario5();
    }

    // Scenario 1: Calling method on a null object
    public static void scenario1() {
        System.out.println("Scenario 1: Method call on null object");
        String str = null;

        try {
            int len = str.length();  // NPE here
        } catch (NullPointerException e) {
            System.out.println("Caught NPE: Cannot call method on a null object.");
        }

        // Fix:
        if (str != null) {
            System.out.println("Length: " + str.length());
        } else {
            System.out.println("Fix: str is null, handle it gracefully.");
        }
        System.out.println();
    }

    // Scenario 2: Accessing field of a null object
    static class Person {
        String name;
    }

    public static void scenario2() {
        System.out.println("Scenario 2: Accessing field of a null object");
        Person p = null;

        try {
            System.out.println(p.name);  // NPE here
        } catch (NullPointerException e) {
            System.out.println("Caught NPE: Cannot access field on a null object.");
        }

        // Fix:
        if (p != null && p.name != null) {
            System.out.println(p.name);
        } else {
            System.out.println("Fix: Object or field is null.");
        }
        System.out.println();
    }

    // Scenario 3: Returning null from a method
    public static String getName() {
        return null;
    }

    public static void scenario3() {
        System.out.println("Scenario 3: Using return value that may be null");

        String name = getName();

        try {
            System.out.println(name.toUpperCase());  // NPE here
        } catch (NullPointerException e) {
            System.out.println("Caught NPE: Method returned null and was used unsafely.");
        }

        // Fix:
        if (name != null) {
            System.out.println(name.toUpperCase());
        } else {
            System.out.println("Fix: getName() returned null.");
        }
        System.out.println();
    }

    // Scenario 4: Array of objects with null elements
    public static void scenario4() {
        System.out.println("Scenario 4: Null elements in array");

        String[] arr = new String[3];
        arr[0] = "Hello";
        arr[1] = null;  // This is intentional

        try {
            System.out.println(arr[1].length());  // NPE here
        } catch (NullPointerException e) {
            System.out.println("Caught NPE: Null element in array.");
        }

        // Fix:
        for (String s : arr) {
            if (s != null) {
                System.out.println("Length: " + s.length());
            } else {
                System.out.println("Fix: Array element is null.");
            }
        }
        System.out.println();
    }

    // Scenario 5: Using objects from collections that may contain null
    public static void scenario5() {
        System.out.println("Scenario 5: Null in collections");

        java.util.List<String> list = new java.util.ArrayList<>();
        list.add("One");
        list.add(null);
        list.add("Three");

        for (String s : list) {
            try {
                System.out.println(s.toLowerCase());  // NPE on null
            } catch (NullPointerException e) {
                System.out.println("Caught NPE: Null value in collection.");
            }
        }

        // Fix:
        for (String s : list) {
            if (s != null) {
                System.out.println("Lower: " + s.toLowerCase());
            } else {
                System.out.println("Fix: Found null in collection.");
            }
        }
        System.out.println();
    }
}
