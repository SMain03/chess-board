package com.mains03.chessboard.board;

import com.mains03.chessboard.board.move.Move;
import com.mains03.chessboard.board.move.visitor.*;

public class Board {
    private final ColouredPiece[][] board;

    public Board(ColouredPiece[][] startPosition) {
        board = new ColouredPiece[8][8];
        for (int i=0; i<8; ++i) {
            for (int j=0; j<8; ++j) {
                board[i][j] = startPosition[i][j];
            }
        }
    }

    public Board makeMove(Move move) {
        boolean moveLegal = move.accept(
            new LegalMoveVisitor(this)
        );

        Board newBoard = null;
        if (moveLegal) {
            newBoard = move.accept(
                new MoveMakerVisitor(this)
            );
        }

        return newBoard;
    }
}
