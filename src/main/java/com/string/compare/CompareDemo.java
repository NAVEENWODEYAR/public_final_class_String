package com.string.compare;

import java.util.*;

/**
 * @author Naveen K Wodeyar
 * @date 10-Aug-2026
 */

class StudenRecord implements Comparable<StudenRecord> {
    int id;
    String name;
    int marks;

    StudenRecord(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Comparable: natural ordering by id
    @Override
    public int compareTo(StudenRecord s) {
        return this.id - s.id;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + marks;
    }
}

public class CompareDemo {
    public static void main(String[] args) {

        List<StudenRecord> students = new ArrayList<>();

        students.add(new StudenRecord(103, "Rahul", 85));
        students.add(new StudenRecord(101, "Anita", 92));
        students.add(new StudenRecord(102, "Vijay", 78));

        // Comparable
        // Sorts according to compareTo() -> by ID
        Collections.sort(students);

        System.out.println("Using Comparable (by ID):");
        for (StudenRecord s : students) {
            System.out.println(s);
        }

        // Comparator
        // Sort by marks
        Comparator<StudenRecord> marksComparator =
                (s1, s2) -> Integer.compare(s1.marks, s2.marks);

        Collections.sort(students, marksComparator);

        System.out.println("\nUsing Comparator (by Marks):");
        for (StudenRecord s : students) {
            System.out.println(s);
        }

        // Another Comparator
        // Sort by name
        Comparator<StudenRecord> nameComparator =
                (s1, s2) -> s1.name.compareTo(s2.name);

        Collections.sort(students, nameComparator);

        System.out.println("\nUsing Comparator (by Name):");
        for (StudenRecord s : students) {
            System.out.println(s);
        }
    }
}