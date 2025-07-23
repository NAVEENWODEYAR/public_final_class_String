package com.string.code;

import java.util.*;
import java.util.stream.*;

/**
 * @author Naveen K Wodeyar
 * @date 23-Jul-2025
 */

public class FlattenUnique {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(3, 4, 5),
            Arrays.asList(5, 6, 7)
        );

        List<Integer> flattenedUnique = listOfLists.stream()
            .flatMap(Collection::stream)
            .distinct()
            .collect(Collectors.toList());

        System.out.println(flattenedUnique);
        // Output: [1, 2, 3, 4, 5, 6, 7]
    }
}
