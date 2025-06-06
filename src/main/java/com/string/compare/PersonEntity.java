package com.string.compare;

/**
 * @author Naveen K Wodeyar
 * @date 06-Jun-2025
 */

public class PersonEntity implements Comparable<PersonEntity> {
    private String name;
    private int age;
    private double salary;

    public PersonEntity(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getSalary() { return salary; }

    // Natural ordering: by name, then by age
    @Override
    public int compareTo(PersonEntity other) {
        int nameCompare = this.name.compareTo(other.name);
        if (nameCompare != 0) {
            return nameCompare;
        } else {
            return Integer.compare(this.age, other.age);
        }
    }

    @Override
    public String toString() {
        return name + " - Age: " + age + ", Salary: " + salary;
    }
}
