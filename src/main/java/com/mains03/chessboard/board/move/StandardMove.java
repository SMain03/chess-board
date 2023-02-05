package com.mains03.chessboard.board.move;

public class StandardMove extends Move {
    public final int r1;
    public final int c1;

    public final int r2;
    public final int c2;

    public StandardMove(int r1, int c1, int r2, int c2) {
        this.r1 = r1;
        this.c1 = c1;
        this.r2 = r2;
        this.c2 = c2;
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
