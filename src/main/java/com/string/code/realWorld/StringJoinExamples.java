package com.string.code.realWorld;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/**
 * @author Naveen K Wodeyar
 * @date 04-Sept-2025
 */

public class StringJoinExamples {

    public static void main(String[] args) {
        String[] strings = {"Java", "is", "awesome"};
        List<String> stringList = Arrays.asList(strings);

        // Method 1: Using + operator
        String joinedUsingPlus = strings[0] + " " + strings[1] + " " + strings[2];
        System.out.println("1. Joined using + operator: " + joinedUsingPlus);

        // Method 2: Using String.concat()
        String joinedUsingConcat = strings[0].concat(" ").concat(strings[1]).concat(" ").concat(strings[2]);
        System.out.println("2. Joined using String.concat(): " + joinedUsingConcat);

        // Method 3: Using String.join() (Java 8+)
        String joinedUsingJoin = String.join(" ", strings);
        System.out.println("3. Joined using String.join(): " + joinedUsingJoin);

        // Method 4: Using StringBuilder
        StringBuilder sb = new StringBuilder();
        for (String str : strings) {
            sb.append(str).append(" ");
        }
        String joinedUsingStringBuilder = sb.toString().trim();
        System.out.println("4. Joined using StringBuilder: " + joinedUsingStringBuilder);

        // Method 5: Using StringJoiner (Java 8+)
        StringJoiner sj = new StringJoiner(" ");
        for (String str : strings) {
            sj.add(str);
        }
        System.out.println("5. Joined using StringJoiner: " + sj.toString());

        // Method 6: Using Streams and Collectors.joining()
        String joinedUsingStreams = stringList.stream()
                .collect(Collectors.joining(" "));
        System.out.println("6. Joined using Streams: " + joinedUsingStreams);
    }
}

