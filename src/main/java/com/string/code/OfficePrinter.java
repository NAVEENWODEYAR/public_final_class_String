package com.string.code;

import java.util.*;

/**
 * @author Naveen K Wodeyar
 * @date 05-Aug-2025
 *  Round-Robin Scheduling Algorithm, commonly used in operating systems for CPU scheduling.
 */

class PrintJob {
    String employeeName;
    int pagesLeft;

    PrintJob(String name, int pages) {
        this.employeeName = name;
        this.pagesLeft = pages;
    }
}

public class OfficePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a queue of print jobs
        Queue<PrintJob> queue = new LinkedList<>();

        // Input number of employees
        System.out.print("Enter number of employees with print jobs: ");
        int n = scanner.nextInt();

        // Add print jobs to queue
        for (int i = 0; i < n; i++) {
            System.out.print("Enter employee name: ");
            String name = scanner.next();
            System.out.print("Enter number of pages to print: ");
            int pages = scanner.nextInt();
            queue.add(new PrintJob(name, pages));
        }

        // Time slice: how many pages printer can print per turn
        System.out.print("Enter printer page limit per turn (time quantum): ");
        int pageLimit = scanner.nextInt();

        System.out.println("\n--- Printing Starts ---");

        while (!queue.isEmpty()) {
            PrintJob job = queue.poll();

            if (job.pagesLeft <= pageLimit) {
                System.out.println(job.employeeName + "'s job is completed. Printed " + job.pagesLeft + " pages.");
            } else {
                System.out.println(job.employeeName + "'s job printed " + pageLimit + " pages, " +
                        (job.pagesLeft - pageLimit) + " pages remaining.");
                job.pagesLeft -= pageLimit;
                queue.add(job); // Send back to end of queue
            }
        }

        System.out.println("--- All print jobs completed ---");

        scanner.close();
    }
}
