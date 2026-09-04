/**
 * @author Naveen K Wodeyar
 * @date 04-Sept-2026
 */
package com.string.code.realWorld;

/*
 * ============================================================
 *        JAVA + LEETCODE BEGINNER ROADMAP
 * ============================================================
 *
 * Duration : 12 Weeks
 * Level    : Beginner
 * Language : Java
 *
 * Goal:
 *  - Learn Java fundamentals
 *  - Learn Data Structures & Algorithms
 *  - Solve around 100 LeetCode problems
 *  - Build problem-solving skills
 *  - Progress from Easy to Medium problems
 *
 * Recommended Study Time:
 *  - Minimum : 1 hour/day
 *  - Ideal   : 2 hours/day
 *
 * ============================================================
 */

public class LeetCodeRoadmap {

    public static void main(String[] args) {

        // ----------------------------------------------------
        // Print the roadmap title
        // ----------------------------------------------------

        printHeader();

        // ----------------------------------------------------
        // 12-WEEK ROADMAP
        // ----------------------------------------------------

        printWeek(
                1,
                "Java Fundamentals",
                "Variables, Data Types, Operators, If/Else, Loops, Methods",
                "5 Easy",
                "Understand basic Java syntax"
        );

        printWeek(
                2,
                "Arrays & Strings",
                "Arrays, Strings, StringBuilder, Basic Searching",
                "8 Easy",
                "Become comfortable working with arrays and strings"
        );

        printWeek(
                3,
                "HashMap & HashSet",
                "HashMap, HashSet, Frequency Counting, Two Sum",
                "10 Easy",
                "Learn how to store and search data efficiently"
        );

        printWeek(
                4,
                "Two Pointers",
                "Two Pointer Technique, Palindrome, Sorted Arrays",
                "8 Easy",
                "Recognize and solve two-pointer problems"
        );

        printWeek(
                5,
                "Stack & Queue",
                "Stack, Queue, Deque, Parentheses Problems",
                "8 Easy",
                "Understand LIFO and FIFO data structures"
        );

        printWeek(
                6,
                "Sliding Window",
                "Fixed Window, Variable Window, Frequency Map",
                "8 Easy/Medium",
                "Learn one of the most important LeetCode patterns"
        );

        printWeek(
                7,
                "Binary Search",
                "Binary Search, Search Range, Search on Answer",
                "8 Easy/Medium",
                "Solve problems efficiently using O(log n)"
        );

        printWeek(
                8,
                "Linked List",
                "Nodes, Traversal, Reverse List, Fast & Slow Pointer",
                "8 Easy/Medium",
                "Become comfortable with linked-list manipulation"
        );

        printWeek(
                9,
                "Recursion & Trees",
                "Recursion, DFS, BFS, Binary Trees",
                "8 Easy/Medium",
                "Understand recursive thinking and tree traversal"
        );

        printWeek(
                10,
                "Binary Search Tree",
                "BST, Inorder, Preorder, Postorder, Level Order",
                "8 Easy/Medium",
                "Solve common tree interview problems"
        );

        printWeek(
                11,
                "Heap & Greedy",
                "PriorityQueue, Min Heap, Max Heap, Greedy",
                "7 Easy/Medium",
                "Learn how to choose the best element efficiently"
        );

        printWeek(
                12,
                "Backtracking & Dynamic Programming",
                "Recursion, Memoization, Basic DP, Backtracking",
                "7 Easy/Medium",
                "Understand the basics of advanced problem solving"
        );

        // ----------------------------------------------------
        // DAILY TIMETABLE
        // ----------------------------------------------------

        printDailyTimetable();

        // ----------------------------------------------------
        // PROBLEM-SOLVING STRATEGY
        // ----------------------------------------------------

        printProblemSolvingStrategy();

        // ----------------------------------------------------
        // FINAL GOAL
        // ----------------------------------------------------

        printFinalGoal();
    }


    /*
     * --------------------------------------------------------
     * Prints the main program header
     * --------------------------------------------------------
     */
    static void printHeader() {

        System.out.println();
        System.out.println("============================================================");
        System.out.println("           JAVA + LEETCODE BEGINNER ROADMAP");
        System.out.println("============================================================");
        System.out.println("Duration : 12 Weeks");
        System.out.println("Level    : Beginner");
        System.out.println("Goal     : Learn DSA + Solve ~100 LeetCode Problems");
        System.out.println("============================================================");
        System.out.println();
    }


    /*
     * --------------------------------------------------------
     * Prints information about each week
     *
     * Parameters:
     * week     -> Week number
     * topic    -> Main topic
     * concepts -> Concepts to learn
     * problems -> Number/difficulty of problems
     * goal     -> Main goal for the week
     * --------------------------------------------------------
     */
    static void printWeek(
            int week,
            String topic,
            String concepts,
            String problems,
            String goal) {

        System.out.println("------------------------------------------------------------");
        System.out.println("WEEK " + week + " : " + topic);
        System.out.println("------------------------------------------------------------");

        System.out.println("Topics  : " + concepts);
        System.out.println("Practice: " + problems);
        System.out.println("Goal    : " + goal);

        System.out.println();
    }


    /*
     * --------------------------------------------------------
     * DAILY STUDY TIMETABLE
     *
     * Recommended schedule for approximately 2 hours/day.
     * --------------------------------------------------------
     */
    static void printDailyTimetable() {

        System.out.println();
        System.out.println("============================================================");
        System.out.println("                    DAILY TIMETABLE");
        System.out.println("============================================================");

        System.out.println();
        System.out.println("06:30 - 07:00  -> Learn theory/concept");
        System.out.println("07:00 - 07:30  -> Write Java examples");
        System.out.println("07:30 - 08:00  -> Solve 1 LeetCode problem");
        System.out.println("08:00 - 08:30  -> Review solution + notes");

        System.out.println();
        System.out.println("Total Study Time: Approximately 2 hours/day");

        System.out.println();
        System.out.println("If you only have 1 hour:");
        System.out.println("30 minutes -> Learn");
        System.out.println("30 minutes -> LeetCode");
    }


    /*
     * --------------------------------------------------------
     * PROBLEM-SOLVING STRATEGY
     *
     * Follow these steps whenever you solve a problem.
     * --------------------------------------------------------
     */
    static void printProblemSolvingStrategy() {

        System.out.println();
        System.out.println("============================================================");
        System.out.println("              LEETCODE PROBLEM STRATEGY");
        System.out.println("============================================================");

        System.out.println();
        System.out.println("Step 1 -> Read the problem carefully");
        System.out.println("Step 2 -> Understand the input and output");
        System.out.println("Step 3 -> Think about the solution for 15-20 minutes");
        System.out.println("Step 4 -> Write your own approach");
        System.out.println("Step 5 -> Code the solution");
        System.out.println("Step 6 -> Test with examples");
        System.out.println("Step 7 -> Check Time and Space Complexity");
        System.out.println("Step 8 -> If stuck, look at a hint");
        System.out.println("Step 9 -> Understand the solution");
        System.out.println("Step 10 -> Re-code the problem without looking");
    }


    /*
     * --------------------------------------------------------
     * FINAL TARGET
     * --------------------------------------------------------
     */
    static void printFinalGoal() {

        System.out.println();
        System.out.println("============================================================");
        System.out.println("                     FINAL TARGET");
        System.out.println("============================================================");

        System.out.println();
        System.out.println("Java Basics          -> Strong");
        System.out.println("Arrays               -> Strong");
        System.out.println("Strings              -> Strong");
        System.out.println("HashMap / HashSet    -> Strong");
        System.out.println("Two Pointers         -> Strong");
        System.out.println("Stack / Queue        -> Good");
        System.out.println("Sliding Window       -> Good");
        System.out.println("Binary Search        -> Good");
        System.out.println("Linked List          -> Good");
        System.out.println("Trees                -> Good");
        System.out.println("Heap                 -> Basic");
        System.out.println("Greedy               -> Basic");
        System.out.println("Backtracking         -> Basic");
        System.out.println("Dynamic Programming  -> Basic");

        System.out.println();
        System.out.println("------------------------------------------------------------");
        System.out.println("TARGET: ~100 LeetCode Problems");
        System.out.println("------------------------------------------------------------");

        System.out.println();
        System.out.println("IMPORTANT:");
        System.out.println("Do NOT try to memorize solutions.");
        System.out.println("Learn the pattern behind each problem.");
        System.out.println();
    }
}

