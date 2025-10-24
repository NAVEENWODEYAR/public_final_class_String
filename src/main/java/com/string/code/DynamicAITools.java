package com.string.code;

import java.net.http.*;
import java.net.URI;
import java.io.IOException;

/**
 * @author Naveen K Wodeyar
 * @date 24-Oct-2025
 */

public class DynamicAITools {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.publicapis.org/entries?category=AI&https=true"))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("=== AI-related Tools from Public APIs ===");
        System.out.println(response.body());
    }
}
