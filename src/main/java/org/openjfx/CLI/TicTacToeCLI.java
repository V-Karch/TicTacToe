package org.openjfx.CLI;

import java.util.Scanner;

import org.openjfx.Game.Board;

public class TicTacToeCLI {
    private final Board board = new Board();
    private final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        TicTacToeCLI cli = new TicTacToeCLI();
        cli.displayBoard();
        cli.getMoveFromStdin("Player 1");
    }

    public TicTacToeCLI() {
        System.out.println("Starting a new TicTacToe CLI Game.");
    }

    public String getMoveFromStdin(String prompt) {
        System.out.printf(prompt + ": ");
        return this.scanner.nextLine();
    }

    public void displayBoard() {
        System.out.println("\nCurrent Board State:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("|" + this.board.getTile(j, j).state.getValue() + "|");
            }
            System.out.println();
        }
        System.out.println();
    }
}
