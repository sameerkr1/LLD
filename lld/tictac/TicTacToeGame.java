package org.example.lld.tictac;

import org.example.lld.tictac.model.*;

import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {

    Board gameBoard;
    Deque<Player> players;

    public void initilizeGame() {
        Board board = new Board(3);
        Player player1 = new Player("Sameer", new PlayingPieceX());
        Player player2 = new Player("Ankit", new PlayingPieceO());
        players.add(player1);
        players.add(player2);
    }

//    public String startGame() {
//
//        while (true) {
//
//            gameBoard.printBoard();
//            if (!gameBoard.isCellAvailable()) {
//                break;
//            }
//            Player currentPlayer = players.poll();
//            System.out.println("Player " + currentPlayer.getPlayerName() + " select a position!");
//            Scanner scanner = new Scanner(System.in);
//            String position = scanner.nextLine();
//            String[] pos = position.split(",");
//            Integer x = Integer.parseInt(pos[0]);
//            Integer y = Integer.parseInt(pos[1]);
//
//            if (!gameBoard.markThePosition(x, y, currentPlayer.getPlayingPiece())) {
//                System.out.println("Please enter valid position!");
//                players.addFirst(currentPlayer);
//                continue;
//            }
//            players.addLast(currentPlayer);
//            if (isWinner(x, y, currentPlayer.getPlayingPiece())) {
//                System.out.println("Player " + currentPlayer.getPlayerName() + " won!");
//                break;
//            }
//        }
//        return "tie";
//    }

//    public boolean isWinner(int row, int column, PlayingPiece playingPiece) {
//        for (int i = 0; i < gameBoard.size; i++) {
//            if (gameBoard.board[i][column] == null || playingPiece != gameBoard.board[i][column]) {
//                return false;
//            }
//        }
//    }

}
