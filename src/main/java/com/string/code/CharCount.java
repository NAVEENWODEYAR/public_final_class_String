package com.string.code;

/**
 * @author Naveen K Wodeyar
 * @date 24-Jun-2025
 */

public class CharCount {
    public static void main(String[] args) {
        String str = "programming";
        boolean[] visited = new boolean[str.length()];

        for (int i = 0; i < str.length(); i++) {
            if (visited[i])
                continue;

            int count = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(str.charAt(i) + ": " + count);
        }
    }
}
