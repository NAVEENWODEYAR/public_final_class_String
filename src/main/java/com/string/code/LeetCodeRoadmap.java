package com.string.code;

import java.util.*;

/**
 * @author Naveen K Wodeyar
 * @date 29-Jan-2026
 */

public class LeetCodeRoadmap {

    public static void suggestRoadmap(int solved) {
        System.out.println("\n📌 LeetCode Roadmap Suggestion\n");

        if (solved < 50) {
            System.out.println("Level: Beginner");
            System.out.println("Focus On:");
            System.out.println("- Arrays & Strings");
            System.out.println("- HashMap & HashSet");
            System.out.println("- Two Pointers");
            System.out.println("- Basic Recursion");
            System.out.println("\nRecommended Problems:");
            System.out.println("- Two Sum");
            System.out.println("- Best Time to Buy and Sell Stock");
            System.out.println("- Valid Anagram");
            System.out.println("- Contains Duplicate");

        } else if (solved < 150) {
            System.out.println("Level: Intermediate");
            System.out.println("Focus On:");
            System.out.println("- Sliding Window");
            System.out.println("- Stack & Queue");
            System.out.println("- Binary Search");
            System.out.println("- Linked List");
            System.out.println("- Trees (DFS, BFS)");

            System.out.println("\nRecommended Problems:");
            System.out.println("- Longest Substring Without Repeating Characters");
            System.out.println("- Daily Temperatures");
            System.out.println("- Binary Tree Level Order Traversal");
            System.out.println("- Search in Rotated Sorted Array");

        } else if (solved < 300) {
            System.out.println("Level: Advanced");
            System.out.println("Focus On:");
            System.out.println("- Backtracking");
            System.out.println("- Dynamic Programming");
            System.out.println("- Graphs (BFS, DFS)");
            System.out.println("- Heap / Priority Queue");

            System.out.println("\nRecommended Problems:");
            System.out.println("- Combination Sum");
            System.out.println("- Word Break");
            System.out.println("- Number of Islands");
            System.out.println("- Top K Frequent Elements");

        } else {
            System.out.println("Level: Interview Ready 🚀");
            System.out.println("Focus On:");
            System.out.println("- Advanced DP");
            System.out.println("- Graph Algorithms (Dijkstra, Union Find)");
            System.out.println("- System Design Basics");

            System.out.println("\nRecommended Problems:");
            System.out.println("- Trapping Rain Water");
            System.out.println("- Edit Distance");
            System.out.println("- Course Schedule");
            System.out.println("- Minimum Window Substring");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of LeetCode problems solved: ");
        int solved = sc.nextInt();

        suggestRoadmap(solved);

        sc.close();
    }
}
