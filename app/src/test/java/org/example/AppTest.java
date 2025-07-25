package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * This class contains unit tests for the App class.
 * It verifies that the main method outputs the expected names
 * of the left and right child squirrels in the correct format.
 */
public class AppTest {

    /**
     * Tests that mainApp prints the name of the left child squirrel
     * as the first line of output.
     */
    @Test
    void testMainAppPrintsFirstChildName() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        App.main(new String[]{});
        System.setOut(originalOut);
        String[] outputLines = outContent.toString().split("\n");
        assertTrue(outputLines.length >= 1, "Output should have at least one line.");
        assertEquals("Squeaks", outputLines[0].trim());
    }

    /**
     * Tests that mainApp prints the name of the right child squirrel
     * as the second line of output.
     */
    @Test
    void testMainAppPrintsSecondChildName() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        App.main(new String[]{});
        System.setOut(originalOut);
        String[] outputLines = outContent.toString().split("\n");
        assertTrue(outputLines.length >= 2, "Output should have at least two lines.");
        assertEquals("Mr. Fluffy Butt", outputLines[1].trim());
    }

    /**
     * Tests that mainApp only prints two lines of output,
     * corresponding to the two child nodes.
     */
    @Test
    void testMainAppHasNoExtraOutputLines() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        App.main(new String[]{});
        System.setOut(originalOut);
        String[] outputLines = outContent.toString().split("\n");
        assertEquals(2, outputLines.length);
    }

    /**
     * Tests that the output from mainApp is not empty.
     */
    @Test
    void testMainAppOutputIsNonEmpty() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        App.main(new String[]{});
        System.setOut(originalOut);
        String output = outContent.toString().trim();
        assertFalse(output.isEmpty(), "Output should not be empty.");
    }
}
