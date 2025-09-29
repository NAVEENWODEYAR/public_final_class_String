package com.string.design;

/**
 * @author Naveen K Wodeyar
 * @date 29-Sept-2025
 */

//Singleton class
class SingletonThread {
 // Volatile ensures visibility and ordering
 private static volatile SingletonThread instance;

 // Private constructor
 private SingletonThread() {
     System.out.println("Singleton instance created by " + Thread.currentThread().getName());
 }

 // Thread-safe Singleton with double-checked locking
 public static SingletonThread getInstance() {
     if (instance == null) {
         synchronized (SingletonThread.class) {
             if (instance == null) {
                 instance = new SingletonThread();
             }
         }
     }
     return instance;
 }

 public void showMessage() {
     System.out.println("Hello from Singleton! Called by " + Thread.currentThread().getName());
 }
}

//Thread task that uses Singleton
class SingletonTask implements Runnable {
 @Override
 public void run() {
     Singleton singleton = Singleton.getInstance();
     singleton.showMessage();
 }
}

//Main class
public class SingletonWithThreadsDemo {
 public static void main(String[] args) {
     // Creating multiple threads
     Thread t1 = new Thread(new SingletonTask(), "Thread-1");
     Thread t2 = new Thread(new SingletonTask(), "Thread-2");
     Thread t3 = new Thread(new SingletonTask(), "Thread-3");

     // Starting threads
     t1.start();
     t2.start();
     t3.start();
 }
}
