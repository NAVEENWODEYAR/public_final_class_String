package com.string.exptn;

import java.util.*;

/**
 * @author Naveen K Wodeyar
 * @date 02-Aug-2025
 */

public class NullPointerEdgeCase {

    static class Department {
        String name;
        Employee manager;

        Department(String name, Employee manager) {
            this.name = name;
            this.manager = manager;
        }
    }

    static class Employee {
        String name;
        Address address;

        Employee(String name, Address address) {
            this.name = name;
            this.address = address;
        }
    }

    static class Address {
        String city;

        Address(String city) {
            this.city = city;
        }
    }

    public static void main(String[] args) {
        List<Department> departments = new ArrayList<>();

        departments.add(new Department("Engineering", new Employee("Alice", new Address("New York"))));
        departments.add(new Department("HR", null)); // manager is null
        departments.add(new Department("Finance", new Employee("Bob", null))); // address is null
        departments.add(null); // Entire department is null

        for (Department dept : departments) {
            try {
                // Attempt to print manager's city
                System.out.println(
                    "Department: " + dept.name +
                    ", Manager City: " + dept.manager.address.city
                );
            } catch (NullPointerException e) {
                System.out.println("⚠️ NullPointerException caught: " + e);
            }
        }

        System.out.println("Program completed safely.");
    }
}

