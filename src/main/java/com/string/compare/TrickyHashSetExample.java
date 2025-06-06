package com.string.compare;

import java.util.*;

/**
 * @author Naveen K Wodeyar
 * @date 06-Jun-2025
 */

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student s = (Student) o;
        return name.equalsIgnoreCase(s.name);
    }

    // hashCode not overridden!
}

public class TrickyHashSetExample {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();

        students.add(new Student("Alice"));
        students.add(new Student("alice")); // logically equal

        System.out.println("Size of set: " + students.size()); // ❌ prints 2
        students.forEach(s -> System.out.println(s.name));
    }
}
