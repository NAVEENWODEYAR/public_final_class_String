package com.string.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Naveen K Wodeyar
 * @date 13-Aug-2026
 */

public class HashMapDemo {

    public static void main(String[] args) {

        // 1. Creating a HashMap
        HashMap<Integer, String> students = new HashMap<>();

        // 2. Adding key-value pairs using put()
        students.put(101, "Gani");
        students.put(102, "Gowri");
        students.put(103, "Nandi");
        students.put(104, "Ramu");
        students.put(104, "Ramu");
        students.put(104, "Bheema");


        System.out.println("Students: " + students);

        // 3. Accessing a value using get()
        System.out.println("Student with ID 102: " + students.get(102));

        // 4. Checking whether a key exists
        System.out.println("Does ID 103 exist? "
                + students.containsKey(103));

        // 5. Checking whether a value exists
        System.out.println("Does Rahul exist? "
                + students.containsValue("Rahul"));

        // 6. Updating an existing value
        students.put(102, "Priyanka");

        System.out.println("After updating ID 102: " + students);

        // 7. Adding only if key does not already exist
        students.putIfAbsent(103, "New Arun");
        students.putIfAbsent(105, "Vijay");

        System.out.println("After putIfAbsent(): " + students);

        // 8. Removing an entry using key
        students.remove(104);

        System.out.println("After removing ID 104: " + students);

        // 9. Getting size
        System.out.println("Number of students: " + students.size());

        // 10. Iterating through keys
        System.out.println("\nKeys:");
        for (Integer id : students.keySet()) {
            System.out.println(id);
        }

        // 11. Iterating through values
        System.out.println("\nValues:");
        for (String name : students.values()) {
            System.out.println(name);
        }

        // 12. Iterating through key-value pairs
        System.out.println("\nKey-Value pairs:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(
                    "ID = " + entry.getKey()
                    + ", Name = " + entry.getValue()
            );
        }

        // 13. Using getOrDefault()
        String name = students.getOrDefault(999, "Student Not Found");
        System.out.println("\nID 999: " + name);

        // 14. Replacing a value
        students.replace(101, "Rahul Kumar");

        System.out.println("After replace(): " + students);

        // 15. Removing only if key and value both match
        students.remove(105, "Vijay");

        System.out.println("After conditional remove: " + students);

        // 16. Checking whether HashMap is empty
        System.out.println("Is HashMap empty? "
                + students.isEmpty());

        // 17. Clearing the HashMap
        students.clear();

        System.out.println("After clear(): " + students);

        System.out.println("Is HashMap empty now? "
                + students.isEmpty());
    }
}