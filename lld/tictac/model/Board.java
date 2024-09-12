package org.example.lld.tictac.model;

public class Board {

    public int size;
    public PlayingPiece[][] board;

    public Board(int size) {
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public PlayingPiece[][] getBoard(){
        return board;
    }

    public boolean markThePosition(int row, int column, PlayingPiece playingPiece) {
        if (board[row][column] == null) {
            board[row][column] = playingPiece;
            return true;
        }else {
            System.out.println("Place is already marked at row " + row + " column " + column);
        }
        return false;
    }

    public void printBoard() {
        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                    System.out.println(" ");
                } else
                    System.out.println(board[i][j].toString());
                System.out.println(" | ");
            }
        }
    }

    public boolean isCellAvailable(){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) return true;
            }
        }
        return false;
    }

}
