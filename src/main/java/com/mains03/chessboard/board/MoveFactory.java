package com.mains03.chessboard.board;

public class MoveFactory {
    private static MoveFactory instance;

    public static MoveFactory getInstance() {
        if (instance == null) {
            instance = new MoveFactory();
        }

        return instance;
    }

    private MoveFactory() {}

    public Move createMove(String moveString) {
        return null;
    }
}
