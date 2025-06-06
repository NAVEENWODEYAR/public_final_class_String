package com.string.compare;

import java.util.*;

/**
 * @author Naveen K Wodeyar
 * @date 05-Jun-2025
 */

//Class implements Comparable: natural sort by name (alphabetical)
class Person implements Comparable<Person> {
 String name;

 Person(String name) {
     this.name = name;
 }

 // Natural ordering: alphabetical by name
 public int compareTo(Person other) {
     return this.name.compareTo(other.name);
 }

 public String toString() {
     return name;
 }
}

//Custom Comparator: sort by name length
class StComparator implements Comparator<Person> {
 public int compare(Person p1, Person p2) {
     return Integer.compare(p1.name.length(), p2.name.length());
 }
}

public class StringComparableComparatorExample {
 public static void main(String[] args) {
     List<Person> people = Arrays.asList(
         new Person("John"),
         new Person("Alice"),
         new Person("Bob"),
         new Person("Charlie"),
         new Person("David")
     );

     System.out.println("Sorting by name (Comparable):");
     Collections.sort(people);  // uses Comparable
     people.forEach(System.out::println);

     System.out.println("\nSorting by name length (Comparator):");
     Collections.sort(people, new StComparator());  // uses Comparator
     people.forEach(System.out::println);
 }
}

