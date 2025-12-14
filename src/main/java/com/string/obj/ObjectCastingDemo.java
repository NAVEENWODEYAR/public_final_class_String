package com.string.obj;

/**
 * @author Naveen K Wodeyar
 * @date 14-Dec-2025
 */

public class ObjectCastingDemo {
    public static void main(String[] args) {

        // UPCASTING (Child → Parent)
        Animal a = new Dog();   // implicit casting
        a.sound();              // calls Dog's sound()

        // DOWNCASTING (Parent → Child)
        Dog d = (Dog) a;        // explicit casting
        d.sound();
        d.fetch();

        // Unsafe downcasting example (will throw ClassCastException)
        Animal a2 = new Animal();
        // Dog d2 = (Dog) a2;   // Uncommenting this will cause runtime error
    }
}
