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

    public boolean validateRowColumnRange(int row, int column) {
        /**
         * Returns false if input is invalid, true otherwise
         */
        return !(row < 0 || column < 0 || row > 2 || column > 2);
    }


    public Tile getTile(int row, int column) { return this.board[row][column]; }

    public Tile setTile(int row, int column, TileState state) {
        boolean validity = validateRowColumnRange(row, column);

        if (!validity) { 
            throw new IllegalArgumentException("Invalid Row or Column Value");
            // Alert the user of their mistake
        }
        
        Tile tile = new Tile(row, column);
        tile.state = state;

        this.board[row][column] = tile;
        return tile;
    }
}
