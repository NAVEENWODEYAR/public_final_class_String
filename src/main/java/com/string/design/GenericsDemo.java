package com.string.design;

import java.util.*;

/**
 * @author Naveen K Wodeyar
 * @date 24-Mar-2026
 */

//Generic Class
class Box<T> {
 private T value;

 public void set(T value) {
     this.value = value;
 }

 public T get() {
     return value;
 }
}

//Multiple Type Parameters
class Pair<K, V> {
 private K key;
 private V value;

 public Pair(K key, V value) {
     this.key = key;
     this.value = value;
 }

 public void display() {
     System.out.println("Pair: " + key + " -> " + value);
 }
}

//Bounded Generics
class Calculator<T extends Number> {
 public double square(T num) {
     return num.doubleValue() * num.doubleValue();
 }
}

//Generic Interface
interface Container<T> {
 void add(T item);
}

//Implementation of Generic Interface
class StringContainer implements Container<String> {
 public void add(String item) {
     System.out.println("Container holds: " + item);
 }
}

public class GenericsDemo {

 // Generic Method
 public static <T> void printArray(T[] arr) {
     System.out.print("Array elements: ");
     for (T element : arr) {
         System.out.print(element + " ");
     }
     System.out.println();
 }

 // Wildcard Method
 public static void printList(List<?> list) {
     System.out.print("List elements: ");
     for (Object obj : list) {
         System.out.print(obj + " ");
     }
     System.out.println();
 }

 public static void main(String[] args) {

     // 1. Generic Class
     Box<Integer> intBox = new Box<>();
     intBox.set(10);
     System.out.println("Box<Integer>: " + intBox.get());

     Box<String> strBox = new Box<>();
     strBox.set("Hello Generics");
     System.out.println("Box<String>: " + strBox.get());

     // 2. Multiple Type Parameters
     Pair<Integer, String> pair = new Pair<>(1, "One");
     pair.display();

     // 3. Bounded Generics
     Calculator<Double> calc = new Calculator<>();
     System.out.println("Square: " + calc.square(5.5));

     // 4. Generic Method
     Integer[] intArr = {1, 2, 3};
     String[] strArr = {"A", "B", "C"};

     printArray(intArr);
     printArray(strArr);

     // 5. Wildcards
     List<Integer> list1 = Arrays.asList(10, 20, 30);
     List<String> list2 = Arrays.asList("Java", "Python", "C++");

     printList(list1);
     printList(list2);

     // 6. Generic Interface
     StringContainer container = new StringContainer();
     container.add("Generics Example");
 }
 
}