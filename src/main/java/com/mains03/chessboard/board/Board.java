package com.mains03.chessboard.board;

public class Board {
    private final Piece[][] board;

    public Board() {
        board = new Piece[0][0];
    }

    public Board makeMove(Move move) {
        return null;
    }

    public boolean pieceAt(int row, int col) {
        return board[row][col] != null;
    }
}
