package com.string.code;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Naveen K Wodeyar
 * @date 11-Nov-2025
 */

/**
 * A simple utility class that stores and lists common Linux commands
 * with their use cases or descriptions.
 */
public class LinuxCommands {

    private static final Map<String, String> commandMap = new HashMap<>();

    static {
        commandMap.put("ls", "Lists files and directories in the current directory.");
        commandMap.put("cd", "Changes the current working directory.");
        commandMap.put("pwd", "Prints the current working directory path.");
        commandMap.put("mkdir", "Creates a new directory.");
        commandMap.put("rmdir", "Removes an empty directory.");
        commandMap.put("rm", "Removes files or directories.");
        commandMap.put("cp", "Copies files or directories.");
        commandMap.put("mv", "Moves or renames files or directories.");
        commandMap.put("cat", "Displays the contents of a file.");
        commandMap.put("touch", "Creates an empty file or updates file timestamps.");
        commandMap.put("grep", "Searches for patterns in text files.");
        commandMap.put("find", "Searches for files in a directory hierarchy.");
        commandMap.put("chmod", "Changes file permissions.");
        commandMap.put("chown", "Changes file ownership.");
        commandMap.put("echo", "Displays a line of text or variable value.");
        commandMap.put("man", "Displays the manual page for a command.");
        commandMap.put("top", "Displays running processes and resource usage.");
        commandMap.put("ps", "Displays information about active processes.");
        commandMap.put("kill", "Terminates a process by its PID.");
        commandMap.put("df", "Shows disk space usage.");
        commandMap.put("du", "Shows file or directory size.");
        commandMap.put("tar", "Creates or extracts archive files.");
        commandMap.put("ssh", "Connects to a remote system securely.");
        commandMap.put("scp", "Copies files between hosts over SSH.");
        commandMap.put("wget", "Downloads files from the web.");
        commandMap.put("curl", "Transfers data from or to a server.");
        commandMap.put("history", "Shows the list of previously executed commands.");
        commandMap.put("sudo", "Executes a command as another user (usually root).");
        commandMap.put("apt-get", "Installs, updates, or removes software packages (Debian/Ubuntu).");
        commandMap.put("yum", "Manages packages on RHEL/CentOS systems.");
    }

    /** Returns all Linux commands with descriptions. */
    public static Map<String, String> getAllCommands() {
        return commandMap;
    }

    /** Gets the description of a specific Linux command. */
    public static String getDescription(String command) {
        return commandMap.getOrDefault(command, "Command not found.");
    }

    public static void main(String[] args) {
        System.out.println("=== Basic Linux Commands and Their Use Cases ===");
        commandMap.forEach((cmd, desc) -> System.out.printf("%-10s : %s%n", cmd, desc));
    }
}
