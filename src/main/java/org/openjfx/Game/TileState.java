package org.openjfx.Game;

public enum TileState {
    X("X"),
    O("O"),
    NONE(" ");

    private final String value;

    private TileState(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value; 
    }
}
