package com.string.code.realWorld;

import java.util.Objects;
import java.util.Optional;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Naveen K Wodeyar
 * @date 06-Mar-2026
 */

public class AvoidNullPointerExample {

    public static void main(String[] args) {

        String name = null;

        // 1. Null check before using object
        if (name != null) {
            System.out.println("Length: " + name.length());
        } else {
            System.out.println("Name is null");
        }

        // 2. Safe equals comparison
        if ("Java".equals(name)) {
            System.out.println("Name is Java");
        } else {
            System.out.println("Name is not Java or is null");
        }

        // 3. Using Optional
        Optional<String> optionalName = Optional.ofNullable(name);
        System.out.println("Optional value: " + optionalName.orElse("Default Name"));

        // 4. Using Objects.requireNonNull with try-catch
        try {
            Objects.requireNonNull(name, "Name cannot be null");
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        // 5. Returning empty collection instead of null
        List<String> list = getList();
        System.out.println("List size: " + list.size());
    }

    public static List<String> getList() {
        return new ArrayList<>(); // returning empty list instead of null
    }
}