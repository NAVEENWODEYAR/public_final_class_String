package com.string.file;

import java.io.IOException;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Naveen K Wodeyar
 * @date 01-Aug-2025
 */

public class FileCreatorAndCopier {

    public static void main(String[] args) {
        // Define file paths relative to project directory
        Path sourcePath = Paths.get("source.txt");
        Path targetPath = Paths.get("copied_files/copied_source.txt");

        try {
            // Create and write content to source file
            createAndWriteFile(sourcePath);

            // Copy source file to target location
            copyFile(sourcePath, targetPath);

            System.out.println("File created and copied successfully.");
        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
        } catch (SecurityException e) {
            System.err.println("Security error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected error: " + e.getMessage());
        }
    }

    /**
     * Creates the file and writes data including creation time and Bangalore info.
     */
    private static void createAndWriteFile(Path filePath) throws IOException {
        // Get current timestamp
        String timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        // Content to write
        String content = """
                File created on: %s

                About Bangalore:
                - Bangalore (Bengaluru) is the capital of Karnataka, India.
                - Known as the "Silicon Valley of India".
                - A major hub for IT companies, startups, and R&D institutions.
                - Famous for its parks, gardens, and moderate climate.
                """.formatted(timeStamp);

        // Write to the file (create or overwrite)
        Files.writeString(filePath, content, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

        System.out.println("File created and written to: " + filePath.toAbsolutePath());
    }

    /**
     * Copies the file to the target location, creating directories if needed.
     */
    private static void copyFile(Path source, Path target) throws IOException {
        // Create directories if they do not exist
        if (Files.notExists(target.getParent())) {
            Files.createDirectories(target.getParent());
        }

        // Copy file and overwrite if it already exists
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);

        System.out.println("File copied to: " + target.toAbsolutePath());
    }
}
