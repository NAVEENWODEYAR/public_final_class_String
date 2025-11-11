package com.string.code;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Map;

/**
 * @author Naveen K Wodeyar
 * @date 11-Nov-2025
 */

public class LinuxCommandsTest {

    @Test
    public void testCommandListNotEmpty() {
        Map<String, String> commands = LinuxCommands.getAllCommands();
        assertFalse(commands.isEmpty(), "Command list should not be empty");
    }

    @Test
    public void testGetDescriptionForExistingCommand() {
        String desc = LinuxCommands.getDescription("ls");
        assertTrue(desc.toLowerCase().contains("list"), "Description for 'ls' should mention 'list'");
    }

    @Test
    public void testGetDescriptionForNonExistingCommand() {
        String desc = LinuxCommands.getDescription("nonexistent");
        assertEquals("Command not found.", desc);
    }

    @Test
    public void testCommandCount() {
        int expected = 30; // Adjust if you add or remove commands
        assertEquals(expected, LinuxCommands.getAllCommands().size(), "Command count mismatch");
    }
}

