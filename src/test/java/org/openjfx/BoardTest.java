package org.openjfx;

import org.openjfx.Game.Tile;
import org.openjfx.Game.Board;
import org.junit.jupiter.api.Test;
import org.openjfx.Game.TileState;
import static org.junit.jupiter.api.Assertions.assertEquals;


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

    @Test
    public void testBoardCreationSetTile() {
        // Expected
        String expectedTileValue = "X";       

        // Actual
        Board board = new Board();
        Tile tile = board.setTile(0, 0, TileState.X);

        String actualTileValue = tile.state.getValue();

        assertEquals(expectedTileValue, actualTileValue);
    }

    @Test
    public void testBoardCreationFull() {
        Board board = new Board();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Tile currentTile = board.getTile(i, j);

                assertEquals(currentTile.getRow(), i);
                assertEquals(currentTile.getColumn(), j);

                assertEquals(currentTile.state.getValue(), " ");
            }
        }
    }
}
