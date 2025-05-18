/**
 * @author Naveen K Wodeyar
 * @date 17-May-2025
 */
package com.string.code;

import java.util.regex.*;

public class URLExtractor {
    public static void extractURLs(String text) {
        String regex = "(https?://\\S+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Found URL: " + matcher.group());
        }
    }

    public static void main(String[] args) {
        extractURLs("Check out https://openai.com and also http://example.org/test");
    }
}

