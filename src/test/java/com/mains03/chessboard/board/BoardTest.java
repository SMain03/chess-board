package com.mains03.chessboard.board;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    @Test
    public void test1() {
        Board board = new Board();
        Move move = MoveFactory.getInstance().createMove("e2e4");
        board = board.makeMove(move);
        assertFalse(board.pieceAt(1, 4));
        assertTrue(board.pieceAt(3, 4));
    }

    @Test
    public void test2() {
        Board board = new Board();
        Move move = MoveFactory.getInstance().createMove("g1f3");
        board = board.makeMove(move);
        assertFalse(board.pieceAt(0, 6));
        assertTrue(board.pieceAt(2, 5));
    }

    @Test
    public void test3() {
        Board board = new Board();
        Move move = MoveFactory.getInstance().createMove("c1a3");
        board = board.makeMove(move);
        assertNull(board);
    }
}