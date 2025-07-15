package com.string.exptn;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author Naveen K Wodeyar
 * @date 15-Jul-2025
 */

public class AllJavaExceptionsDemo {

    public static void main(String[] args) {

        // 1. NullPointerException
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.err.println("Caught NullPointerException: " + e.getMessage());
        }

        // 2. ArrayIndexOutOfBoundsException
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // 3. ArithmeticException
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.err.println("Caught ArithmeticException: " + e.getMessage());
        }

        // 4. ClassCastException
        try {
            Object obj = "Hello";
            Integer num = (Integer) obj;
        } catch (ClassCastException e) {
            System.err.println("Caught ClassCastException: " + e.getMessage());
        }

        // 5. StringIndexOutOfBoundsException
        try {
            String text = "Hi";
            char c = text.charAt(5);
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }

        // 6. IllegalArgumentException
        try {
            Thread.sleep(-100);
        } catch (IllegalArgumentException | InterruptedException e) {
            System.err.println("Caught IllegalArgumentException or InterruptedException: " + e.getMessage());
        }

        // 7. IllegalStateException
        try {
            Iterator<String> iter = new ArrayList<String>().iterator();
            iter.remove();  // illegal without next()
        } catch (IllegalStateException e) {
            System.err.println("Caught IllegalStateException: " + e.getMessage());
        }

        // 8. NumberFormatException
        try {
            int num = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.err.println("Caught NumberFormatException: " + e.getMessage());
        }

        // 9. InputMismatchException
        try {
            Scanner scanner = new Scanner("abc");
            int input = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Caught InputMismatchException: " + e.getMessage());
        }

        // 10. UnsupportedOperationException
        try {
            List<String> list = Arrays.asList("a", "b");
            list.add("c");
        } catch (UnsupportedOperationException e) {
            System.err.println("Caught UnsupportedOperationException: " + e.getMessage());
        }

        // 11. IOException
        try {
            File file = new File("nonexistent.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            System.err.println("Caught FileNotFoundException: " + e.getMessage());
        }

        // 12. ParseException
        try {
            String dateStr = "31-02-2020";
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            sdf.setLenient(false);
            Date date = sdf.parse(dateStr);
        } catch (ParseException e) {
            System.err.println("Caught ParseException: " + e.getMessage());
        }

        // 13. ClassNotFoundException
        try {
            Class.forName("com.example.NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.err.println("Caught ClassNotFoundException: " + e.getMessage());
        }

        // 14. CloneNotSupportedException
        try {
            ObjectClone obj = new ObjectClone();
            ObjectClone cloned = (ObjectClone) obj.clone();
        } catch (CloneNotSupportedException e) {
            System.err.println("Caught CloneNotSupportedException: " + e.getMessage());
        }

        System.out.println("All exceptions demo completed.");
    }
}

class ObjectClone implements Cloneable {
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
