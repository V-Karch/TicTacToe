package org.openjfx.Game;

public class Board {
    private final Tile[][] board = new Tile[3][3];

    public Board() {
        this.fillBoardWithEmptyTiles();
    }

    private void fillBoardWithEmptyTiles() {
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board[0].length; j++) {
                Tile tile = new Tile(i, j);
                this.board[i][j] = tile;
            }
        }
    }
}
