package com.bridgelabz_tic_tac_toe_game;

import java.util.Scanner;

public class TicTacToe {
    static char[] board = new char[10];
    static char userLetter;
    static char computerLetter;

    public static void main(String[] args) {
        System.out.println("Welcome to Tic-Tac-Toe game....");
        createEmptyBoard();
        chooseLetter();
        showBoard();
        playerTurn();
    }

    /**
     * UC1 : createEmptyBoard-Static method to create empty board
     */
    private static void createEmptyBoard() {
        for (int index = 1; index < board.length; index++) {
            board[index] = ' ';
        }
    }

    /**
     * UC2 :chooseLetter-static method to choose letter for user and computer
     */
    private static void chooseLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a letter :: X or O : ");
        userLetter = scanner.next().toUpperCase().charAt(0);
        computerLetter = (userLetter == 'X') ? 'O' : 'X';
    }

    /**
     * UC3 : showBoard-method to display current board
     */
    private static void showBoard() {
        System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println("----------");
        System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("----------");
        System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
    }

    /**
     * UC4 : playerTurn-method to make user to move to desired location
     */
    private static void playerTurn() {
        int playerMove;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose your location(1-9): ");
            playerMove = scanner.nextInt();
            if (board[playerMove] == ' ') {
                break;
            }
        }
        System.out.println("Player choose:: " + playerMove);
        board[playerMove] = userLetter;
    }
}
