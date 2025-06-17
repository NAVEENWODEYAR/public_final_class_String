package com.string.serialize;

import java.io.*;

/**
 * @author Naveen K Wodeyar
 * @date 16-Jun-2025
 */

//Class must implement Serializable
class Studen implements Serializable {
 int id;
 String name;

 Studen(int id, String name) {
     this.id = id;
     this.name = name;
 }

 void display() {
     System.out.println("ID: " + id + ", Name: " + name);
 }
}

public class MemorySerializationDemo {

 public static void main(String[] args) {
     try {
         // Create object
         Student original = new Student(101, "Alice");

         // ---- Serialization to byte array (in memory) ----
         ByteArrayOutputStream baos = new ByteArrayOutputStream();
         ObjectOutputStream oos = new ObjectOutputStream(baos);

         oos.writeObject(original);
         oos.close();  // Important to flush data to the stream

         byte[] serializedData = baos.toByteArray();

         // ---- Deserialization from byte array (in memory) ----
         ByteArrayInputStream bais = new ByteArrayInputStream(serializedData);
         ObjectInputStream ois = new ObjectInputStream(bais);

         Student deserialized = (Student) ois.readObject();
         ois.close();

         // Display deserialized object
         System.out.println("Deserialized object:");
         deserialized.display();

     } catch (IOException | ClassNotFoundException e) {
         e.printStackTrace();
     }
 }
}
