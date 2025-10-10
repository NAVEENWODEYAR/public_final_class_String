package com.string.code;

import java.util.Optional;
import java.util.Objects;

/**
 * @author Naveen K Wodeyar
 * @date 09-Oct-2025
 */

public class NullHandlingExample {

    public static void main(String[] args) {

        String nullableString = null;

        // 1. Using if-else null check
        System.out.println("1. Using if-else null check:");
        if (nullableString != null) {
            System.out.println("Length: " + nullableString.length());
        } else {
            System.out.println("String is null.");
        }

        // 2. Using Objects.requireNonNull (throws exception if null)
        System.out.println("\n2. Using Objects.requireNonNull:");
        try {
            String result = Objects.requireNonNull(nullableString, "String cannot be null");
            System.out.println("Length: " + result.length());
        } catch (NullPointerException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        // 3. Using Optional
        System.out.println("\n3. Using Optional:");
        Optional<String> optionalString = Optional.ofNullable(nullableString);
        optionalString.ifPresentOrElse(
            s -> System.out.println("Length: " + s.length()),
            () -> System.out.println("String is null (Optional).")
        );

        // 4. Using Objects.nonNull in stream or lambda (example use case)
        System.out.println("\n4. Using Objects.nonNull:");
        String[] names = { "Alice", null, "Bob", null, "Charlie" };
        System.out.println("Non-null names:");
        for (String name : names) {
            if (Objects.nonNull(name)) {
                System.out.println(name);
            }
        }

        // 5. Providing default value using ternary operator
        System.out.println("\n5. Providing default value:");
        String safeString = nullableString != null ? nullableString : "Default Value";
        System.out.println("Value: " + safeString);

        // 6. Optional with default using orElse
        System.out.println("\n6. Optional with orElse:");
        String valueOrDefault = Optional.ofNullable(nullableString).orElse("Fallback Value");
        System.out.println("Value: " + valueOrDefault);
    }
}
