package com.string.err;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * @author Naveen K Wodeyar
 * @date 21-Aug-2026
 */

public class NullPointerSafeProgram {

    public static void main(String[] args) {

        // =====================================================
        // 1. Use a default value instead of null
        // =====================================================

        String name = "Rahul";

        // Safe because name is not null
        System.out.println("Name: " + name);
        System.out.println("Name length: " + name.length());


        // =====================================================
        // 2. Check for null before using an object
        // =====================================================

        String city = getCity();

        if (city != null) {
            System.out.println("City: " + city.toUpperCase());
        } else {
            System.out.println("City is not available");
        }


        // =====================================================
        // 3. Use Objects.requireNonNull()
        // =====================================================

        String country = "India";

        // This makes sure country is not null.
        // If country is null, Java immediately reports the problem.
        Objects.requireNonNull(country, "Country cannot be null");

        System.out.println("Country: " + country);


        // =====================================================
        // 4. Use Optional for values that may be null
        // =====================================================

        String phoneNumber = getPhoneNumber();

        String phone = Optional.ofNullable(phoneNumber)
                .orElse("Phone number not available");

        System.out.println("Phone: " + phone);


        // =====================================================
        // 5. Avoid null collections
        // =====================================================

        // BAD:
        // List<String> students = null;

        // GOOD:
        // Use an empty list instead of null.
        List<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Amit");

        System.out.println("Students: " + students);
        System.out.println("Number of students: " + students.size());


        // =====================================================
        // 6. Handle a possibly null object
        // =====================================================

        Student student = getStudent();

        if (student != null) {

            // Check the student before accessing its data.
            if (student.getName() != null) {
                System.out.println(
                        "Student name: " +
                        student.getName().toUpperCase()
                );
            } else {
                System.out.println("Student name is not available");
            }

        } else {
            System.out.println("Student object is not available");
        }


        // =====================================================
        // 7. Optional with map()
        // =====================================================

        String email = Optional.ofNullable(getEmail())
                .map(String::toUpperCase)
                .orElse("EMAIL NOT AVAILABLE");

        System.out.println("Email: " + email);


        // =====================================================
        // 8. Final example
        // =====================================================

        String value = null;

        // Instead of:
        //
        // System.out.println(value.length());
        //
        // which causes NullPointerException,
        // check it first.

        if (value != null) {
            System.out.println("Value length: " + value.length());
        } else {
            System.out.println("Value is null, so length cannot be calculated.");
        }
    }


    // ---------------------------------------------------------
    // Method that may return null
    // ---------------------------------------------------------

    static String getCity() {
        return null;
    }


    // ---------------------------------------------------------
    // Method that may return null
    // ---------------------------------------------------------

    static String getPhoneNumber() {
        return null;
    }


    // ---------------------------------------------------------
    // Method that may return null
    // ---------------------------------------------------------

    static Student getStudent() {
        return null;
    }


    // ---------------------------------------------------------
    // Method that may return null
    // ---------------------------------------------------------

    static String getEmail() {
        return null;
    }
}


// =============================================================
// Student class
// =============================================================

class Student {

    private String name;

    public Student(String name) {

        // Prevent name from being null.
        this.name = Objects.requireNonNull(
                name,
                "Student name cannot be null"
        );
    }

    public String getName() {
        return name;
    }
}