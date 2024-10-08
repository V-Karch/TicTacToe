package org.openjfx;

import org.openjfx.Game.Tile;
import org.junit.jupiter.api.Test;
import org.openjfx.Game.TileState;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TileTest {

    @Test
    void tileCreationTestDefault() {
        // Expected
        String expectedTileValue = " ";
        int expectedTileRow = 0;
        int expectedTileColumn = 2;

        // Actual
        Tile tile = new Tile(0, 2);
        int actualTileRow = tile.getRow();
        int actualTileColumn = tile.getColumn();
        String actualTileValue = tile.state.getValue();

        assertEquals(expectedTileRow, actualTileRow);
        assertEquals(expectedTileColumn, actualTileColumn);
        assertEquals(expectedTileValue, actualTileValue);
    }

    @Test
    void tileCreationTestX() {
        // Expected
        String expectedTileValue = "X";
        int expectedTileRow = 0;
        int expectedTileColumn = 1;

        // Actual
        Tile tile = new Tile(0, 1);
        tile.state = TileState.X;

        int actualTileRow = tile.getRow();
        int actualTileColumn = tile.getColumn();
        String actualTileValue = tile.state.getValue();

        assertEquals(expectedTileRow, actualTileRow);
        assertEquals(expectedTileColumn, actualTileColumn);
        assertEquals(expectedTileValue, actualTileValue);
    }

    @Test
    void tileCreationTestO() {
        // Expected
        String expectedTileValue = "O";
        int expectedTileRow = 1;
        int expectedTileColumn = 1;

        // Actual
        Tile tile = new Tile(1, 1);
        tile.state = TileState.O;

        int actualTileRow = tile.getRow();
        int actualTileColumn = tile.getColumn();
        String actualTileValue = tile.state.getValue();

        assertEquals(expectedTileRow, actualTileRow);
        assertEquals(expectedTileColumn, actualTileColumn);
        assertEquals(expectedTileValue, actualTileValue);
    }
}
