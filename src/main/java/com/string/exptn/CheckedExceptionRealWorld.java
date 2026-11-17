package com.string.exptn;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Naveen K Wodeyar
 * @date 18-Nov-2026
 */

public class CheckedExceptionRealWorld {
    public static void main(String[] args) {
        // Real-world scenario: You try to read a customer profile from a file 
        // that a user might have accidentally deleted.
        try {
            File configFile = new File("C:/configs/settings.cfg");
            Scanner reader = new Scanner(configFile); // Compiler forces you to handle this!
            System.out.println("Config file loaded successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("[Action Taken]: The configuration file is missing. Using default settings instead.");
        }
    }
}