package com.string.compare;

import java.util.*;

/**
 * @author Naveen K Wodeyar
 * @date 05-Jun-2025
 */

//Book class with Comparable and multiple sorting options via Comparator
class Book implements Comparable<Book> {
 String title;
 String author;
 int year;

 Book(String title, String author, int year) {
     this.title = title;
     this.author = author;
     this.year = year;
 }

 // Natural ordering by title (A–Z)
 @Override
 public int compareTo(Book other) {
     return this.title.compareTo(other.title);
 }

 public String toString() {
     return "\"" + title + "\" by " + author + " (" + year + ")";
 }
}

public class TrickyComparableComparatorExample {
 public static void main(String[] args) {
     List<Book> books = Arrays.asList(
         new Book("Effective Java", "Joshua Bloch", 2008),
         new Book("Clean Code", "Robert C. Martin", 2008),
         new Book("Java: The Complete Reference", "Herbert Schildt", 2018),
         new Book("Head First Java", "Kathy Sierra", 2005),
         new Book("The Pragmatic Programmer", "Andy Hunt", 1999)
     );

     System.out.println("1️⃣ Sorted by Title (Comparable):");
     Collections.sort(books); // natural order by title
     books.forEach(System.out::println);

     System.out.println("\n2️⃣ Sorted by Author (Comparator):");
     books.sort(Comparator.comparing(book -> book.author));
     books.forEach(System.out::println);

     System.out.println("\n3️⃣ Sorted by Year (Descending, Comparator):");
     books.sort((b1, b2) -> Integer.compare(b2.year, b1.year));
     books.forEach(System.out::println);

     System.out.println("\n4️⃣ Sorted by Title Length (Comparator):");
     books.sort(Comparator.comparingInt(b -> b.title.length()));
     books.forEach(System.out::println);
 }
}
