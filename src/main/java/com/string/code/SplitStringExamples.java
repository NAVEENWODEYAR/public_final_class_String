package com.string.code;

import java.util.StringTokenizer;
import java.util.Arrays;

/**
 * @author Naveen K Wodeyar
 * @date 27-Oct-2025
 */

public class SplitStringExamples {

    public static void main(String[] args) {
        String text = "Java,Python;C++|Go Rust";

        System.out.println("Original String: " + text);
        System.out.println("----------------------------------");

        // 1️⃣ Split using a single delimiter (comma)
        String[] splitByComma = text.split(",");
        System.out.println("Split by comma: " + Arrays.toString(splitByComma));

        // 2️⃣ Split using multiple delimiters (comma, semicolon, or pipe)
        String[] splitByMultiple = text.split("[,;|]");
        System.out.println("Split by comma/semicolon/pipe: " + Arrays.toString(splitByMultiple));

        // 3️⃣ Split by spaces
        String[] splitBySpace = text.split(" ");
        System.out.println("Split by space: " + Arrays.toString(splitBySpace));

        // 4️⃣ Split by any non-word character (regex)
        String[] splitByNonWord = text.split("\\W+");
        System.out.println("Split by non-word characters: " + Arrays.toString(splitByNonWord));

        // 5️⃣ Split into individual characters
        String[] splitChars = text.split("");
        System.out.println("Split into characters: " + Arrays.toString(splitChars));

        // 6️⃣ Using StringTokenizer
        StringTokenizer tokenizer = new StringTokenizer(text, ",;| ");
        System.out.print("Using StringTokenizer: [");
        while (tokenizer.hasMoreTokens()) {
            System.out.print(tokenizer.nextToken());
            if (tokenizer.hasMoreTokens()) System.out.print(", ");
        }
        System.out.println("]");

        // 7️⃣ Limit the number of splits
        String[] limitedSplit = text.split("[,;|]", 3);
        System.out.println("Split with limit=3: " + Arrays.toString(limitedSplit));
    }
}
