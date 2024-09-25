package org.openjfx;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openjfx.CLI.TicTacToeCLI;

public class ParseMoveTest {
    @Test
    public void parseMoveTest1_1() {
        // Setup
        String simulatedStdin = "1 1";

        // Expected
        int[] expected = {1, 1};

        // Actual
        int[] actual = TicTacToeCLI.parseMove(simulatedStdin);

        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
    }

    @Test
    public void parseMoveTest0_1() {
        // Setup
        String simulatedStdin = "0 1";

        // Expected
        int[] expected = {0, 1};

        // Actual
        int[] actual = TicTacToeCLI.parseMove(simulatedStdin);

        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
    }

    @Test
    public void parseMoveTestInvalid() {
        // Setup
        String simulatedStdin = "    ";

        // Expected
        int[] expected = {-1, -1};

        // Actual
        int[] actual = TicTacToeCLI.parseMove(simulatedStdin);

        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
    }
}
