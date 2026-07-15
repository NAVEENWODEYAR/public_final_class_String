package com.string.compare;

import java.util.*;

/**
 * @author Naveen K Wodeyar
 * @date 10-Jul-2026
 */

class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Natural ordering: Sort by ID
    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.id, other.id);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + salary;
    }
}

public class ComparatorVsComparableDemo {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(103, "John", 70000));
        employees.add(new Employee(101, "Alice", 90000));
        employees.add(new Employee(102, "Bob", 60000));

        // Comparable (Natural Ordering)
        Collections.sort(employees);
        System.out.println("Sorted by ID (Comparable)");
        employees.forEach(System.out::println);

        // Comparator - Sort by Name
        employees.sort(Comparator.comparing(Employee::getName));

        System.out.println("\nSorted by Name (Comparator)");
        employees.forEach(System.out::println);

        // Comparator - Sort by Salary
        employees.sort(Comparator.comparingDouble(Employee::getSalary));

        System.out.println("\nSorted by Salary (Comparator)");
        employees.forEach(System.out::println);

        // Comparator - Salary Descending
        employees.sort(
                Comparator.comparingDouble(Employee::getSalary)
                          .reversed());

        System.out.println("\nSorted by Salary Descending (Comparator)");
        employees.forEach(System.out::println);
    }
}