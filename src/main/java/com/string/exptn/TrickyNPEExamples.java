package com.string.exptn;

import java.util.*;

/**
 * @author Naveen K Wodeyar
 * @date 16-Jul-2025
 */

public class TrickyNPEExamples {

    public static void main(String[] args) {
        System.out.println("=== Tricky NullPointerException Scenarios ===");

        tryAutoboxingNull();
        tryNullReturnWithoutCheck();
        tryMethodChainOnNull();
        tryForEachOnNullCollection();
        tryVarargsWithNull();
        tryNullElementInList();
        tryStaticUninitialized();
        tryEqualsOnNull();
    }

    // 1. Autoboxing a null Integer to int
    static void tryAutoboxingNull() {
        System.out.println("\n[1] Autoboxing null:");
        try {
            Integer num = null;
            int val = num; // NPE here
            System.out.println("Value: " + val);
        } catch (NullPointerException e) {
            System.out.println("Caught NPE during autoboxing!");
        }
    }

    // 2. Null return used without null check
    static void tryNullReturnWithoutCheck() {
        System.out.println("\n[2] Calling method on null return:");
        try {
            String name = getName();
            System.out.println(name.toUpperCase()); // NPE here
        } catch (NullPointerException e) {
            System.out.println("Caught NPE from method return!");
        }
    }

    static String getName() {
        return null;
    }

    // 3. Method chaining on null object
    static void tryMethodChainOnNull() {
        System.out.println("\n[3] Method chaining on null:");
        try {
            User user = null;
            String city = user.getAddress().getCity(); // NPE here
            System.out.println("City: " + city);
        } catch (NullPointerException e) {
            System.out.println("Caught NPE during method chaining!");
        }
    }

    static class User {
        Address address;

        Address getAddress() {
            return address;
        }
    }

    static class Address {
        String city;

        String getCity() {
            return city;
        }
    }

    // 4. Enhanced for loop over null collection
    static void tryForEachOnNullCollection() {
        System.out.println("\n[4] For-each loop on null collection:");
        try {
            List<String> list = null;
            for (String s : list) { // NPE here
                System.out.println(s);
            }
        } catch (NullPointerException e) {
            System.out.println("Caught NPE during for-each loop!");
        }
    }

    // 5. Varargs with null input
    static void tryVarargsWithNull() {
        System.out.println("\n[5] Varargs with null:");
        try {
            printNames(null); // Passing null instead of vararg
        } catch (NullPointerException e) {
            System.out.println("Caught NPE in varargs method!");
        }
    }

    static void printNames(String... names) {
        System.out.println("Names count: " + names.length); // NPE if names is null
    }

    // 6. Null element inside list
    static void tryNullElementInList() {
        System.out.println("\n[6] Null element in list:");
        try {
            List<String> list = Arrays.asList("one", null, "three");
            for (String s : list) {
                System.out.println(s.toUpperCase()); // NPE when s is null
            }
        } catch (NullPointerException e) {
            System.out.println("Caught NPE due to null element in list!");
        }
    }

    // 7. Uninitialized static variable
    static String staticString;

    static void tryStaticUninitialized() {
        System.out.println("\n[7] Static uninitialized variable:");
        try {
            System.out.println(staticString.length()); // NPE
        } catch (NullPointerException e) {
            System.out.println("Caught NPE from static variable!");
        }
    }

    // 8. Calling equals on a null object
    static void tryEqualsOnNull() {
        System.out.println("\n[8] Calling equals on null object:");
        try {
            String name = null;
            if (name.equals("admin")) { // NPE
                System.out.println("Admin found!");
            }
        } catch (NullPointerException e) {
            System.out.println("Caught NPE calling equals on null!");
        }
    }
}
