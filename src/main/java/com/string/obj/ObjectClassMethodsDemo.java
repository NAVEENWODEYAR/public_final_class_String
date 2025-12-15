package com.string.obj;

/**
 * @author Naveen K Wodeyar
 * @date 15-Dec-2025
 */

class Sample implements Cloneable {

 int value;

 // Constructor
 Sample(int value) {
     this.value = value;
 }

 // Overriding toString() method
 // Returns string representation of the object
 @Override
 public String toString() {
     return "Sample{value=" + value + "}";
 }

 // Overriding equals() method
 // Compares the current object with another object
 @Override
 public boolean equals(Object obj) {

     // Check if both references point to same object
     if (this == obj)
         return true;

     // Check for null and class type
     if (obj == null || getClass() != obj.getClass())
         return false;

     // Type casting
     Sample sample = (Sample) obj;

     // Compare instance variables
     return value == sample.value;
 }

 // Overriding hashCode() method
 // Returns hash code value for the object
 @Override
 public int hashCode() {
     return value * 31;
 }

 // Overriding clone() method
 // Creates and returns a copy of the object
 @Override
 protected Object clone() throws CloneNotSupportedException {
     return super.clone();
 }

 // Overriding finalize() method (Deprecated)
 // Called by Garbage Collector before destroying object
 @Override
 protected void finalize() throws Throwable {
     System.out.println("finalize() method called");
 }
}

public class ObjectClassMethodsDemo {

 public static void main(String[] args) throws CloneNotSupportedException {

     // Creating objects
     Sample obj1 = new Sample(10);
     Sample obj2 = new Sample(10);
     Sample obj3 = obj1;

     // toString() method
     System.out.println("toString(): " + obj1.toString());

     // equals() method
     System.out.println("equals(): " + obj1.equals(obj2));

     // hashCode() method
     System.out.println("hashCode obj1: " + obj1.hashCode());
     System.out.println("hashCode obj2: " + obj2.hashCode());

     // getClass() method
     System.out.println("getClass(): " + obj1.getClass().getName());

     // == operator (reference comparison)
     System.out.println("Reference comparison (==): " + (obj1 == obj3));

     // clone() method
     Sample obj4 = (Sample) obj1.clone();
     System.out.println("Cloned object: " + obj4);

     // notify(), notifyAll(), wait()
     // These methods are used for thread communication
     synchronized (obj1) {
         // obj1.wait();       // Causes current thread to wait
         // obj1.notify();     // Wakes up one waiting thread
         // obj1.notifyAll();  // Wakes up all waiting threads
     }

     // Requesting Garbage Collection
     obj1 = null;
     obj2 = null;
     obj3 = null;
     obj4 = null;

     // Suggest JVM to run Garbage Collector
     System.gc();
 }
}
