package com.string.code;

import java.io.*;

/**
 * @author Naveen K Wodeyar
 * @date 17-Oct-2025
 */

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your name: ");
        String name = reader.readLine();

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(reader.readLine());

        System.out.println("Hello, " + name + ". You are " + age + " years old.");
    }
}
