package com.string;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.core.env.Environment;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

@SpringBootApplication
public class StingApplication {

	private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy EEEE MMM hh:mm a");

    public static void main(String[] args) {
        SpringApplication.run(StingApplication.class, args);
        System.out.println("\npublic final class String\n");
    }

    @Bean
    public CommandLineRunner printStartupInfo(Environment environment) {
        return args -> {
            String javaVersion = System.getProperty("java.version");
            String startTime = LocalDateTime.now().format(formatter);
            String[] profiles = environment.getActiveProfiles();

            System.out.println("\n#############################");
            System.out.println("APPLICATION START TIME: " + startTime);
            System.out.println("JAVA VERSION: " + javaVersion);
            System.out.println("ACTIVE PROFILES: " + Arrays.toString(profiles));
            System.out.println("#############################\n");
        };
    }

    @Bean
    public ApplicationListener<ContextClosedEvent> onShutdown() {
        return event -> {
            String stopTime = LocalDateTime.now().format(formatter);
            System.out.println("\n#############################");
            System.out.println("APPLICATION STOP TIME: " + stopTime);
            System.out.println("#############################\n");
        };
    }

    @Bean
    public ApplicationListener<ApplicationReadyEvent> onApplicationReady() {
        return event -> {
            System.out.println("Application is fully started and ready to accept requests.");
        };
    }
}
