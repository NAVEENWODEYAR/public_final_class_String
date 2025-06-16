package com.string.serialize;

import java.io.*;

/**
 * @author Naveen K Wodeyar
 * @date 16-Jun-2025
 */

//Class must implement Serializable
class Student implements Serializable {
 int id;
 String name;

 public Student(int id, String name) {
     this.id = id;
     this.name = name;
 }

 void display() {
     System.out.println("ID: " + id + ", Name: " + name);
 }
}

public class SerializeDemo {

 public static void main(String[] args) {
     // Serialization
     try {
         Student s1 = new Student(101, "Alice");

         // Saving object to file
         FileOutputStream fos = new FileOutputStream("student.ser");
         ObjectOutputStream oos = new ObjectOutputStream(fos);

         oos.writeObject(s1);
         oos.close();
         fos.close();

         System.out.println("Object has been serialized\n");

     } catch (IOException ioe) {
         ioe.printStackTrace();
     }

     // Deserialization
     try {
         // Reading object from file
         FileInputStream fis = new FileInputStream("student.ser");
         ObjectInputStream ois = new ObjectInputStream(fis);

         Student s2 = (Student) ois.readObject();
         ois.close();
         fis.close();

         System.out.println("Object has been deserialized\n");
         s2.display();

     } catch (IOException | ClassNotFoundException ex) {
         ex.printStackTrace();
     }
 }
}


