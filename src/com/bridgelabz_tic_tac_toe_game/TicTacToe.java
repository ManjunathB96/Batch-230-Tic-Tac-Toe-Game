package com.bridgelabz_tic_tac_toe_game;

public class TicTacToe {
    static char[] board = new char[10];

    public static void main(String[] args) {
        System.out.println("Welcome to Tic-Tac-Toe game....");
        createEmptyBoard();
    }

    /**
     * UC1
     * Method Name: createEmptyBoard
     */
    private static void createEmptyBoard() {
        for (int index = 1; index < board.length; index++) {
            board[index] = ' ';
        }
    }
}
