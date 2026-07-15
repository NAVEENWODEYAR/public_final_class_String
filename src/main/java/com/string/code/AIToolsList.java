package com.string.code;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Naveen K Wodeyar
 * @date 24-Oct-2025
 */

public class AIToolsList {
    public static void main(String[] args) {
        List<String> aiTools = new ArrayList<>();
        aiTools.add("OpenAI ChatGPT (GPT-4o / GPT-5)");
        aiTools.add("Google Gemini (Gemini 1.5 Pro / Flash)");
        aiTools.add("Anthropic Claude (Claude 3.5)");
        aiTools.add("Mistral AI (Mixtral, LeChat)");
        aiTools.add("Cohere Command R+");
        aiTools.add("Meta LLaMA 3.1");
        aiTools.add("Perplexity AI");
        aiTools.add("Hugging Face Models");
        aiTools.add("xAI Grok (Elon Musk)");
        aiTools.add("Stability AI (Stable Diffusion)");
        aiTools.add("RunwayML (AI Video Generator)");
        aiTools.add("Synthesia (AI Avatar Generator)");
        aiTools.add("ElevenLabs (AI Voice Generator)");

        System.out.println("=== Popular AI Tools/Apps (2025) ===");
        aiTools.forEach(System.out::println);
    }
}
