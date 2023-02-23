package com.mains03.chessboard.board;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveFactoryTest {
    @Test
    public void test1() {
        String moveString = "e4";
        Move move = MoveFactory.getInstance().createMove(moveString);
        assertNotNull(move);
    }

    @Test
    public void test2() {
        String moveString = "Nf3";
        Move move = MoveFactory.getInstance().createMove(moveString);
        assertNotNull(moveString);
    }

    @Test
    public void test3() {
        String moveString = "Ba6";
        Move move = MoveFactory.getInstance().createMove(moveString);
        assertNotNull(move);
    }

    @Test
    public void test4() {
        String moveString = "Rh4";
        Move move = MoveFactory.getInstance().createMove(moveString);
        assertNotNull(move);
    }

    @Test
    public void test5() {
        String moveString = "Qe7";
        Move move = MoveFactory.getInstance().createMove(moveString);
        assertNotNull(move);
    }

    @Test
    public void test6() {
        String moveString = "Ke2";
        Move move = MoveFactory.getInstance().createMove(moveString);
        assertNotNull(move);
    }

    @Test
    public void test7() {
        String moveString = "O-O";
        Move move = MoveFactory.getInstance().createMove(moveString);
        assertNotNull(move);
    }

    @Test
    public void test8() {
        String moveString = "O-O-O";
        Move move = MoveFactory.getInstance().createMove(moveString);
        assertNotNull(move);
    }

    @Test
    public void test9() {
        String moveString = "exd5";
        Move move = MoveFactory.getInstance().createMove(moveString);
        assertNotNull(move);
    }

    @Test
    public void test10() {
        String moveString = "Bxf6";
        Move move = MoveFactory.getInstance().createMove(moveString);
        assertNotNull(move);
    }

    @Test
    public void test11() {
        String moveString = "e8=Q";
        Move move = MoveFactory.getInstance().createMove(moveString);
        assertNotNull(move);
    }

    @Test
    public void test12() {
        String moveString = "cxd8=Q";
        Move move = MoveFactory.getInstance().createMove(moveString);
        assertNotNull(move);
    }

    @Test
    public void test13() {
        String moveString = "cxd8=N";
        Move move = MoveFactory.getInstance().createMove(moveString);
        assertNotNull(move);
    }

    @Test
    public void test14() {
        String moveString = "i4";
        Move move = MoveFactory.getInstance().createMove(moveString);
        assertNull(move);
    }

    @Test
    public void test15() {
        String moveString = "e0";
        Move move = MoveFactory.getInstance().createMove(moveString);
        assertNull(move);
    }
}