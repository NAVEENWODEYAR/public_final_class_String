package com.string.functions;

/**
 * @author Naveen K Wodeyar
 * @date 04-Feb-2026
 */

public class IndexOfDemo {
    public static void main(String[] args) {
        String email = "user@gmail.com";

        int atIndex = email.indexOf("@");
        int dotIndex = email.indexOf(".");

        String domain = email.substring(atIndex + 1, dotIndex);

        System.out.println(domain);
    }
}
