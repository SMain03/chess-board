package com.mains03.chessboard.board;

public class Board {
    private final Piece[][] board;

    public Board() {
        board = createInitialBoard();
    }

    private Piece[][] createInitialBoard() {
        Piece[][] board = new Piece[64][64];

        for (int c = 0; c < 8; ++c) {
            board[1][c] = createWhitePawn();
            board[6][c] = createBlackPawn();
        }

        board[0][0] = createWhiteRook();
        board[0][1] = createWhiteKnight();
        board[0][2] = createWhiteBishop();
        board[0][3] = createWhiteQueen();
        board[0][4] = createWhiteKing();
        board[0][5] = createWhiteBishop();
        board[0][6] = createWhiteKnight();
        board[0][7] = createWhiteRook();

        board[7][0] = createBlackRook();
        board[7][1] = createBlackKnight();
        board[7][2] = createBlackBishop();
        board[7][3] = createBlackQueen();
        board[7][4] = createBlackKing();
        board[7][5] = createWhiteBishop();
        board[7][6] = createWhiteKnight();
        board[7][7] = createBlackRook();

        return board;
    }

    private Piece createWhitePawn() {
        return new Piece() {};
    }

    private Piece createBlackPawn() {
        return new Piece() {};
    }

    private Piece createBlackRook() {
        return new Piece() {};
    }

    private Piece createBlackKnight() {
        return new Piece() {};
    }

    private Piece createBlackBishop() {
        return new Piece() {};
    }

    private Piece createBlackQueen() {
        return new Piece() {};
    }

    private Piece createBlackKing() {
        return new Piece() {};
    }

    private Piece createWhiteRook() {
        return new Piece() {};
    }

    private Piece createWhiteKnight() {
        return new Piece() {};
    }

    private Piece createWhiteBishop() {
        return new Piece() {};
    }

    private Piece createWhiteQueen() {
        return new Piece() {};
    }

    private Piece createWhiteKing() {
        return new Piece() {};
    }

    public Board makeMove(Move move) {
        return null;
    }

    public boolean pieceAt(int row, int col) {
        return board[row][col] != null;
    }
}
