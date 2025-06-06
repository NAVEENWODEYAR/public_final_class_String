package com.string.compare;

import java.util.*;

/**
 * @author Naveen K Wodeyar
 * @date 06-Jun-2025
 */

class Product {
    String code;

    Product(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Product) && code.equals(((Product) o).code);
    }

    @Override
    public int hashCode() {
        return code.hashCode();
    }
}

public class MutableKeyExample {
    public static void main(String[] args) {
        Set<Product> products = new HashSet<>();
        Product p1 = new Product("A1");

        products.add(p1);
        p1.code = "B2"; // Mutating field used in hashCode

        System.out.println("Contains? " + products.contains(p1)); // ❌ false
    }
}
