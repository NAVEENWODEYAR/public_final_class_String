package com.string.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Naveen K Wodeyar
 * @date 07-Feb-2026
 */

class Employee {
    int id;

    Employee(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employee)) return false;
        Employee e = (Employee) obj;
        return this.id == e.id;
    }
}

public class HashMapKeyIssue {

    public static void main(String[] args) {

        Map<Employee, String> map = new HashMap<>();

        Employee emp = new Employee(1);
        map.put(emp, "Developer");

        // Mutating key after insertion
        emp.id = 2;

        // HashMap cannot find the key now
        System.out.println(map.get(emp)); // null
    }
}
