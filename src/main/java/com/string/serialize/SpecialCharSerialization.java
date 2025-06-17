package com.string.serialize;

import java.io.*;

/**
 * @author Naveen K Wodeyar
 * @date 16-Jun-2025
 */

class User implements Serializable {
    String name;

    User(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

public class SpecialCharSerialization {
    public static void main(String[] args) {
        try {
            // Special characters in the string
            User u1 = new User("Alice & Bob #2025 *Stars*");

            // Serialize to memory
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(u1);
            oos.close();

            // Deserialize from memory
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            User u2 = (User) ois.readObject();
            ois.close();

            // Output
            System.out.println("Deserialized user:");
            u2.display();

        } catch (NotSerializableException e) {
            System.out.println("Serialization error: class must implement Serializable");
        } catch (IOException e) {
            System.out.println("I/O error during serialization: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found during deserialization");
        }
    }
}
