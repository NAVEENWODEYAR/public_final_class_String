package com.string.obj;

import java.util.Objects;
import java.util.*;

/**
 * @author Naveen K Wodeyar
 * @date 04-Jun-2025
 */

public class Employee {
    private final int id;
    private final String name;
    private final double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee emp = (Employee) o;
        return id == emp.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id); // Ensure no duplicate by ID
    }

    @Override
    public String toString() {
        return id + " - " + name + " - $" + salary;
    }
    
    public static void main(String[] args) {
        Set<Employee> employeeSet = new HashSet<>();

        employeeSet.add(new Employee(101, "Alice", 75000));
        employeeSet.add(new Employee(102, "Bob", 85000));
        employeeSet.add(new Employee(103, "Charlie", 85000));
        employeeSet.add(new Employee(101, "Alicia", 95000)); // Duplicate ID!

        System.out.println("Unique Employees (HashSet by ID):");
        for (Employee e : employeeSet) {
            System.out.println(e);
        }

        // Convert set to list for sorting
        List<Employee> employeeList = new ArrayList<>(employeeSet);

        // Sort by salary descending, then name ascending
        employeeList.sort(Comparator
                .comparingDouble(Employee::getSalary).reversed()
                .thenComparing(Employee::getName));

        System.out.println("\nSorted Employees (by salary desc, then name asc):");
        for (Employee e : employeeList) {
            System.out.println(e);
        }}
}
