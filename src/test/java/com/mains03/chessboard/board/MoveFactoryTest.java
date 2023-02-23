package com.mains03.chessboard.board;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveFactoryTest {
    @Test
    public void test1() {
        String moveString = "e2e4";
        Move move = MoveFactory.getInstance().createMove(moveString);
        assertNotNull(move);
    }

    @Test
    public void test2() {
        String moveString = "g1f3";
        Move move = MoveFactory.getInstance().createMove(moveString);
        assertNotNull(moveString);
    }

    @Test
    public void test3() {
        String moveString = "c8a6";
        Move move = MoveFactory.getInstance().createMove(moveString);
        assertNotNull(move);
    }

    @Test
    public void test4() {
        String moveString = "h1h4";
        Move move = MoveFactory.getInstance().createMove(moveString);
        assertNotNull(move);
    }

    @Test
    public void test5() {
        String moveString = "d8e7";
        Move move = MoveFactory.getInstance().createMove(moveString);
        assertNotNull(move);
    }

    @Test
    public void test6() {
        String moveString = "e1e2";
        Move move = MoveFactory.getInstance().createMove(moveString);
        assertNotNull(move);
    }

    @Test
    public void test7() {
        String moveString = "e1g1";
        Move move = MoveFactory.getInstance().createMove(moveString);
        assertNotNull(move);
    }

    @Test
    public void test8() {
        String moveString = "e1c1";
        Move move = MoveFactory.getInstance().createMove(moveString);
        assertNotNull(move);
    }

    @Test
    public void test9() {
        String moveString = "e4d5";
        Move move = MoveFactory.getInstance().createMove(moveString);
        assertNotNull(move);
    }

    @Test
    public void test10() {
        String moveString = "g5f6";
        Move move = MoveFactory.getInstance().createMove(moveString);
        assertNotNull(move);
    }

    @Test
    public void test11() {
        String moveString = "e7e8q";
        Move move = MoveFactory.getInstance().createMove(moveString);
        assertNotNull(move);
    }

    @Test
    public void test12() {
        String moveString = "c7d8q";
        Move move = MoveFactory.getInstance().createMove(moveString);
        assertNotNull(move);
    }

    @Test
    public void test13() {
        String moveString = "c7d8n";
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
        String moveString = "e0e1";
        Move move = MoveFactory.getInstance().createMove(moveString);
        assertNull(move);
    }
}