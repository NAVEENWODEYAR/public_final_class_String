package com.string;

/**
 * Demonstrates execution order of static blocks
 * in parent and child classes during class loading.
 *
 * @author Naveen K Wodeyar
 * @date 07-Feb-2026
 */

// Parent class
class ParentClass {

    // Static block of ParentClass
    // Executed when ParentClass is loaded into JVM
    static {
        System.out.println("Parent static block");
    }
}

// Child class extending ParentClass
class ChildClass extends ParentClass {

    // Static block of ChildClass
    // Executed when ChildClass is loaded into JVM
    static {
        System.out.println("Child static block");
    }
}

// Test class
public class StaticBlockTest {

    public static void main(String[] args) {

        // Creating an object of ChildClass
        // This triggers class loading of ChildClass
        new ChildClass();
    }
}
