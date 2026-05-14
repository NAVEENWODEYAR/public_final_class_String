package com.string.code;

import java.sql.*;

/**
 * @author Naveen K Wodeyar
 * @date 01-Apr-2026
 */

public class NthHighestSalaryDemo {

    static final String URL = "jdbc:mysql://localhost:3306/testdb";
    static final String USER = "root";
    static final String PASSWORD = "password";

    public static void main(String[] args) {
        int n = 4; // change this to find nth highest salary

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {

            System.out.println("Finding " + n + "th highest salary...\n");

            // 1. LIMIT + OFFSET
            executeQuery(con,
                "SELECT DISTINCT salary FROM employee ORDER BY salary DESC LIMIT 1 OFFSET ?",
                n - 1,
                "1. LIMIT + OFFSET (Simple)"
            );

            // 2. DENSE_RANK()
            executeQuery(con,
                "SELECT salary FROM (" +
                " SELECT salary, DENSE_RANK() OVER (ORDER BY salary DESC) AS rnk FROM employee" +
                ") t WHERE rnk = ?",
                n,
                "2. DENSE_RANK() (Recommended)"
            );

            // 3. ROW_NUMBER()
            executeQuery(con,
                "SELECT salary FROM (" +
                " SELECT salary, ROW_NUMBER() OVER (ORDER BY salary DESC) AS rn FROM employee" +
                ") t WHERE rn = ?",
                n,
                "3. ROW_NUMBER() (Ignores duplicates)"
            );

            // 4. RANK()
            executeQuery(con,
                "SELECT salary FROM (" +
                " SELECT salary, RANK() OVER (ORDER BY salary DESC) AS rnk FROM employee" +
                ") t WHERE rnk = ?",
                n,
                "4. RANK() (Skips ranks)"
            );

            // 5. Correlated Sub-query
            executeQuery(con,
                "SELECT salary FROM employee e1 WHERE ? = (" +
                " SELECT COUNT(DISTINCT salary) FROM employee e2 WHERE e2.salary >= e1.salary" +
                ")",
                n,
                "5. Correlated Subquery (Classic)"
            );

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    // Common method to execute and print result
    public static void executeQuery(Connection con, String query, int n, String methodName) {
        try (PreparedStatement ps = con.prepareStatement(query)) {

            ps.setInt(1, n);
            ResultSet rs = ps.executeQuery();

            System.out.println(methodName + ":");

            boolean found = false;
            while (rs.next()) {
                System.out.println("Salary = " + rs.getDouble("salary"));
                found = true;
            }

            if (!found) {
                System.out.println("No result found.");
            }

            System.out.println("----------------------------------");

        } catch (SQLException e) {
            System.out.println("Error in " + methodName);
            e.printStackTrace();
        }
    }
    
}