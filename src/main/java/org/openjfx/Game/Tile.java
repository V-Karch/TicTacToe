package org.openjfx.Game;

public class Tile {
    public TileState state;
    // State can be changed arbitrarily, so it can be public

    public Tile() {
        this.state = TileState.NONE; // Initially a Tile will have no state
    }
}
