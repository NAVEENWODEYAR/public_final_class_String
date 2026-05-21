package com.string.code.realWorld;

/**
 * @author Naveen K Wodeyar
 * @date 22-May-2026
 */

//Java Program to Describe WhatsApp Architecture
class User {
 String name;
 String phoneNumber;

 User(String name, String phoneNumber) {
     this.name = name;
     this.phoneNumber = phoneNumber;
 }

 void sendMessage(String message, User receiver) {
     System.out.println(name + " sends message to " + receiver.name + ": " + message);
 }
}

class Server {
 void authenticate(User user) {
     System.out.println("Authenticating user: " + user.name);
 }

 void storeMessage(String message) {
     System.out.println("Message stored temporarily on server: " + message);
 }
}

class Database {
 void saveChat() {
     System.out.println("Chat backup saved in database.");
 }
}

class Encryption {
 void encryptMessage(String message) {
     System.out.println("Encrypting message: " + message);
 }

 void decryptMessage(String message) {
     System.out.println("Decrypting message: " + message);
 }
}

public class WhatsAppArchitecture {
 public static void main(String[] args) {

     // Creating users
     User sender = new User("Alice", "9876543210");
     User receiver = new User("Bob", "9123456780");

     // Creating architecture components
     Server server = new Server();
     Database database = new Database();
     Encryption encryption = new Encryption();

     // WhatsApp workflow
     server.authenticate(sender);
     String msg = "Hello Bob!";
     encryption.encryptMessage(msg);
     sender.sendMessage(msg, receiver);
     server.storeMessage(msg);
     encryption.decryptMessage(msg);
     database.saveChat();
 }
 
}
