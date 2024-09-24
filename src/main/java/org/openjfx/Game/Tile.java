package org.openjfx.Game;

public class Tile {
    public TileState state;
    private int row;
    private int column;
    // State can be changed arbitrarily, so it can be public

    public Tile(int row, int column) {
        this.state = TileState.NONE; // Initially a Tile will have no state
        this.row = row;
        this.column = column;
    }

    public int getRow() { return this.row; }
    public int getColumn() { return this.column; }
}
