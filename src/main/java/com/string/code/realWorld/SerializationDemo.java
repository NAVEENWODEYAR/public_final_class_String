package com.string.code.realWorld;

import java.io.*;

/**
 * @author Naveen K Wodeyar
 * @date 10-Sept-2025
 */

//Step 1: Create a class that implements Serializable
class Student implements Serializable {
 private static final long serialVersionUID = 1L;  // Recommended for Serializable classes
 
 String name;
 int age;
 transient String password; // transient fields won't be serialized

 // Constructor
 public Student(String name, int age, String password) {
     this.name = name;
     this.age = age;
     this.password = password;
 }

 // Display method
 public void display() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Password: " + password);
 }
}

public class SerializationDemo {

 public static void main(String[] args) {

     // Object to be serialized
     Student student = new Student("Alice", 22, "mySecret123");

     // Serialization
     try (FileOutputStream fos = new FileOutputStream("student.ser");
          ObjectOutputStream oos = new ObjectOutputStream(fos)) {
         
         oos.writeObject(student);
         System.out.println("✅ Object has been serialized to 'student.ser' file.\n");

     } catch (IOException e) {
         e.printStackTrace();
     }

     // Deserialization
     try (FileInputStream fis = new FileInputStream("student.ser");
          ObjectInputStream ois = new ObjectInputStream(fis)) {

         Student deserializedStudent = (Student) ois.readObject();
         System.out.println("✅ Object has been deserialized:\n");
         deserializedStudent.display();

     } catch (IOException | ClassNotFoundException e) {
         e.printStackTrace();
     }
 }
}
