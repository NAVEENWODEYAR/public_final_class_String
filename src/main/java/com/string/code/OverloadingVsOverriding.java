package com.string.code;

/**
 * @author Naveen K Wodeyar
 * @date 19-May-2025
 */

//Base class
class Animal {

 // Overloaded methods (same method name, different parameters)
 public void makeSound() {
     System.out.println("Some generic animal sound");
 }

 public void makeSound(String sound) {
     System.out.println("Animal makes sound: " + sound);
 }

 // Method to be overridden
 public void eat() {
     System.out.println("Animal is eating");
 }
}

//Subclass
class Dog extends Animal {

 // Overriding the eat() method
 @Override
 public void eat() {
     System.out.println("Dog is eating dog food");
 }

 // Overloading method inside subclass
 public void makeSound(int times) {
     for (int i = 0; i < times; i++) {
         System.out.println("Woof!");
     }
 }
}

//Main class
public class OverloadingVsOverriding {
 public static void main(String[] args) {
     Animal genericAnimal = new Animal();
     genericAnimal.makeSound();              // Overloading demo
     genericAnimal.makeSound("Roar");        // Overloading demo
     genericAnimal.eat();                    // Base class method

     Dog dog = new Dog();
     dog.makeSound();                        // Inherited method
     dog.makeSound("Bark");                  // Overloaded in base class
     dog.makeSound(3);                       // Overloaded in subclass
     dog.eat();                              // Overridden method
 }
}
