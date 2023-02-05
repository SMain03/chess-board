package com.mains03.chessboard.board.move;

public class CastlingMove extends Move {
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
