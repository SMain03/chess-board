package com.mains03.chessboard.board.move.visitor;

import com.mains03.chessboard.board.Board;
import com.mains03.chessboard.board.move.*;

public class LegalMoveVisitor implements Move.Visitor<Boolean> {
    private final Board board;

    public LegalMoveVisitor(Board board) {
        this.board = board;
    }

    public Boolean visit(CastlingMove move) {
        return false;
    }

    public Boolean visit(CaptureMove move) {
        return false;
    }

    public Boolean visit(EnPassantMove move) {
        return false;
    }

    public Boolean visit(StandardMove move) {
        return false;
    }
}
