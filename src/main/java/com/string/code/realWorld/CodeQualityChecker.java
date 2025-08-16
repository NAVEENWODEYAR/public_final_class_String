package com.string.code.realWorld;

import java.io.*;

/**
 * @author Naveen K Wodeyar
 * @date 15-Aug-2025
 */

public class CodeQualityChecker {

    private static final String CHECKSTYLE_JAR = "checkstyle-10.12.3-all.jar";
    private static final String CHECKSTYLE_CONFIG = "config/checkstyle.xml";

    private static final String PMD_HOME = "pmd-bin-6.55.0";
    private static final String PMD_RULESET = "config/pmd-ruleset.xml";

    private static final String SPOTBUGS_JAR = "spotbugs-4.8.3/lib/spotbugs.jar";

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java CodeQualityChecker <source-directory-or-file>");
            return;
        }

        String targetPath = args[0];
        System.out.println("Analyzing: " + targetPath);

        runCheckstyle(targetPath);
        runPMD(targetPath);
        runSpotBugs(targetPath);
    }

    private static void runCheckstyle(String path) {
        System.out.println("\n--- Running Checkstyle ---");
        String[] cmd = {
            "java", "-jar", CHECKSTYLE_JAR,
            "-c", CHECKSTYLE_CONFIG,
            path
        };
        runCommand(cmd);
    }

    private static void runPMD(String path) {
        System.out.println("\n--- Running PMD ---");
        String[] cmd = {
            PMD_HOME + "/bin/pmd",
            "check",
            "-d", path,
            "-R", PMD_RULESET,
            "-f", "text"
        };
        runCommand(cmd);
    }

    private static void runSpotBugs(String path) {
        System.out.println("\n--- Running SpotBugs ---");
        // Compile class files first
        String compiledDir = "compiled_classes";
        new File(compiledDir).mkdir();
        runCommand(new String[]{"javac", "-d", compiledDir, path});

        String[] cmd = {
            "java", "-jar", SPOTBUGS_JAR,
            "-textui",
            compiledDir
        };
        runCommand(cmd);
    }

    private static void runCommand(String[] cmd) {
        try {
            ProcessBuilder pb = new ProcessBuilder(cmd);
            pb.redirectErrorStream(true);
            Process process = pb.start();

            BufferedReader reader = new BufferedReader(
                new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null)
                System.out.println(line);

            process.waitFor();
        } catch (Exception e) {
            System.err.println("Error running command: " + String.join(" ", cmd));
            e.printStackTrace();
        }
    }
}
