package com.mains03.chessboard.board.move.visitor;

import com.mains03.chessboard.board.Board;
import com.mains03.chessboard.board.move.*;

public class MoveMakerVisitor implements Move.Visitor<Board> {
    private final Board board;

    public MoveMakerVisitor(Board board) {
        this.board = board;
    }

    public Board visit(CastlingMove move) {
        return null;
    }

    public Board visit(CaptureMove move) {
        return null;
    }

    public Board visit(EnPassantMove move) {
        return null;
    }

    public Board visit(StandardMove move) {
        return null;
    }
}
