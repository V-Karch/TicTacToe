package org.openjfx.CLI;

import org.openjfx.Game.Board;

public class TicTacToeCLI {
    private final Board board = new Board();
    public static void main(String[] args) {
        TicTacToeCLI cli = new TicTacToeCLI();
        cli.displayBoard();
    }

    public TicTacToeCLI() {}

    public void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("|" + this.board.getTile(j, j).state.getValue() + "|");
            }
            System.out.println();
        }
    }
}
