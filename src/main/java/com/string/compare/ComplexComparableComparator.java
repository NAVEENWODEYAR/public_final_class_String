/**
 * @author Naveen K Wodeyar
 * @date 06-Jun-2025
 */
package com.string.compare;

import java.util.*;

public class ComplexComparableComparator {
    public static void main(String[] args) {
        List<PersonEntity> people = Arrays.asList(
            new PersonEntity("Alice", 30, 70000),
            new PersonEntity("Bob", 25, 60000),
            new PersonEntity("Alice", 25, 70000),
            new PersonEntity("David", 28, 60000),
            new PersonEntity("Bob", 30, 60000),
            new PersonEntity("Alice", 30, 85000)
        );

        // Sort using Comparable (name → age)
        System.out.println("🔤 Sorting by Name then Age (Comparable):");
        Collections.sort(people);  // Natural ordering
        people.forEach(System.out::println);

        // Sort using Comparator (salary ↓ → age ↑)
        System.out.println("\n💰 Sorting by Salary Desc then Age (Comparator):");
        Collections.sort(people, new SalaryComparator());
        people.forEach(System.out::println);
    }
}


