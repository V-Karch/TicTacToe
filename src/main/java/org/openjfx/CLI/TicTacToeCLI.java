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
        System.out.println("To make a move, enter the board coordinates of your placement.");
    }

    public String getMoveFromStdin(String prompt) {
        System.out.printf(prompt + ": ");
        return this.scanner.nextLine();
    }

    public static int[] parseMove(String stdin) {
        int[] result = new int[2];

        if (stdin.length() != 3) {
            result[0] = -1;
            result[1] = -1;

            return result;
        }

        int first = Integer.parseInt(stdin.charAt(0) + "");
        int second = Integer.parseInt(stdin.charAt(2) + "");

        result[0] = first;
        result[1] = second;

        return result;
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
