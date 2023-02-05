package com.mains03.chessboard.board.move;

public abstract class Move {
    public interface Visitor<T> {
        public T visit(CastlingMove move);
        
        public T visit(CaptureMove move);

        public T visit(EnPassantMove move);

        public T visit(StandardMove move);
    }

    public abstract <T> T accept(Visitor<T> visitor);
}
