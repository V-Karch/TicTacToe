package org.openjfx;


import org.junit.jupiter.api.Test;
import org.openjfx.Game.Tile;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.openjfx.Game.Board;


public class BoardTest {
    @Test
    public void testBoardCreationFirst() {
        // Expected
        int expectedTileRow = 0;
        int expectedTileColumn = 0;
        String expectedTileValue = " ";       

        // Actual
        Board board = new Board();
        Tile firstTile = board.getTile(0, 0);

        int actualTileRow = firstTile.getRow();
        int actualTileColumn = firstTile.getColumn();
        String actualTileValue = firstTile.state.getValue();

        assertEquals(expectedTileRow, actualTileRow);
        assertEquals(expectedTileColumn, actualTileColumn);
        assertEquals(expectedTileValue, actualTileValue);
    }

    @Test
    public void testBoardCreationLast() {
        // Expected
        int expectedTileRow = 2;
        int expectedTileColumn = 2;
        String expectedTileValue = " ";       

        // Actual
        Board board = new Board();
        Tile firstTile = board.getTile(2, 2);

        int actualTileRow = firstTile.getRow();
        int actualTileColumn = firstTile.getColumn();
        String actualTileValue = firstTile.state.getValue();

        assertEquals(expectedTileRow, actualTileRow);
        assertEquals(expectedTileColumn, actualTileColumn);
        assertEquals(expectedTileValue, actualTileValue);
    }
}
