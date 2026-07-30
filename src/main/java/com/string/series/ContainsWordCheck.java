package com.string.series;

/**
 * @author Naveen K Wodeyar
 * @date 27-May-2025
 *
 * Problem:
 * Given a sentence and a word, determine whether the sentence contains
 * the given word, ignoring case sensitivity.
 *
 * Example:
 * Input: sentence = "Java is a powerful programming language"
 *        word = "POWERFUL"
 * Output: true
 */

class ContainsWordCheckProgram {

    public boolean containsWord(String sentence, String word) {

        if (sentence == null || word == null) {
            return false;
        }

        return sentence.toLowerCase().contains(word.toLowerCase());
    }
}

public class ContainsWordCheck {

    private static void runTest(String sentence, String word, boolean expected) {

    	ContainsWordCheckProgram solution = new ContainsWordCheckProgram();

        boolean actual = solution.containsWord(sentence, word);

        System.out.println("------------------------------------------");
        System.out.println("Sentence : \"" + sentence + "\"");
        System.out.println("Word     : \"" + word + "\"");
        System.out.println("Expected : " + expected);
        System.out.println("Actual   : " + actual);

        if (expected == actual) {
            System.out.println("Result   : PASS");
        } else {
            System.out.println("Result   : FAIL");
        }
    }

    public static void main(String[] args) {

        // LeetCode Style Test Cases

        runTest(
                "Java is a powerful programming language",
                "POWERFUL",
                true
        );

        runTest(
                "Java is a powerful programming language",
                "java",
                true
        );

        runTest(
                "Java is a powerful programming language",
                "Language",
                true
        );

        runTest(
                "Java is a powerful programming language",
                "Python",
                false
        );

        runTest(
                "OpenAI develops AI models",
                "ai",
                true
        );

        runTest(
                "Hello World",
                "world",
                true
        );

        runTest(
                "Hello World",
                "WORLDS",
                false
        );

        // Empty sentence
        runTest(
                "",
                "java",
                false
        );

        // Empty word
        runTest(
                "Java Programming",
                "",
                true
        );

        // Both empty
        runTest(
                "",
                "",
                true
        );

        // Null sentence
        runTest(
                null,
                "java",
                false
        );

        // Null word
        runTest(
                "Java Programming",
                null,
                false
        );

        // Both null
        runTest(
                null,
                null,
                false
        );
    }
}
