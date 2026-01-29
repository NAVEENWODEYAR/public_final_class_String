package com.string.code;

import java.util.*;

/**
 * @author Naveen K Wodeyar
 * @date 29-Jan-2026
 */

public class Codec {

    private static final String BASE62 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final String DOMAIN = "http://tinyurl.com/";

    private Map<Integer, String> idToUrl = new HashMap<>();
    private Map<String, Integer> urlToId = new HashMap<>();
    private int id = 1;

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if (urlToId.containsKey(longUrl)) {
            return DOMAIN + base62Encode(urlToId.get(longUrl));
        }

        int currentId = id++;
        urlToId.put(longUrl, currentId);
        idToUrl.put(currentId, longUrl);

        return DOMAIN + base62Encode(currentId);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String key = shortUrl.replace(DOMAIN, "");
        int decodedId = base62Decode(key);
        return idToUrl.get(decodedId);
    }

    // Base62 encode
    private String base62Encode(int num) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.append(BASE62.charAt(num % 62));
            num /= 62;
        }
        return sb.reverse().toString();
    }

    // Base62 decode
    private int base62Decode(String str) {
        int num = 0;
        for (char c : str.toCharArray()) {
            num = num * 62 + BASE62.indexOf(c);
        }
        return num;
    }

    // ================== TEST CASES ==================
    public static void main(String[] args) {
        Codec codec = new Codec();

        // Test Case 1: Basic encode-decode
        String url1 = "https://leetcode.com/problems/design-tinyurl";
        String short1 = codec.encode(url1);
        System.out.println("Short URL 1: " + short1);
        System.out.println("Decoded URL 1: " + codec.decode(short1));
        System.out.println();

        // Test Case 2: Same URL encoded multiple times
        String short1Again = codec.encode(url1);
        System.out.println("Same URL encoded twice:");
        System.out.println(short1);
        System.out.println(short1Again);
        System.out.println("Are equal: " + short1.equals(short1Again));
        System.out.println();

        // Test Case 3: Multiple URLs
        String url2 = "https://google.com";
        String url3 = "https://github.com";

        String short2 = codec.encode(url2);
        String short3 = codec.encode(url3);

        System.out.println("Short URL 2: " + short2);
        System.out.println("Decoded URL 2: " + codec.decode(short2));

        System.out.println("Short URL 3: " + short3);
        System.out.println("Decoded URL 3: " + codec.decode(short3));
    }
}
