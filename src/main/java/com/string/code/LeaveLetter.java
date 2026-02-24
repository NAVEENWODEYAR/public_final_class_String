package com.string.code;

import java.util.Scanner;

/**
 * @author Naveen K Wodeyar
 * @date 23-Feb-2026
 */

public class LeaveLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter the day(s) of leave: ");
        String days = sc.nextLine();

        System.out.print("Enter the reason for leave: ");
        String reason = sc.nextLine();

        // Printing Leave Letter
        System.out.println("\n----- Leave Letter -----\n");
        System.out.println("To,");
        System.out.println("The Manager/Principal,");
        System.out.println("Your Organization/School Name,");
        System.out.println("\nSubject: Application for Leave");
        System.out.println("\nRespected Sir/Madam,");
        System.out.println("I am " + name + ". I kindly request you to grant me leave on " 
                           + days + " due to " + reason + ".");
        System.out.println("I assure you that I will complete my pending work after returning.");
        System.out.println("\nThanking you.");
        System.out.println("Yours sincerely,");
        System.out.println(name);

        sc.close();
    }
}
