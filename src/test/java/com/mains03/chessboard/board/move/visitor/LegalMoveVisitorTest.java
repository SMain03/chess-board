package com.mains03.chessboard.board.move.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.mains03.chessboard.board.Board;
import com.mains03.chessboard.board.ColouredPiece;
import com.mains03.chessboard.board.move.*;

import static com.mains03.chessboard.board.Colour.*;
import static com.mains03.chessboard.board.Piece.*;

public class LegalMoveVisitorTest {
    @Test
    void test1() {
        Board board = createStandardBoard();

        Move move = new StandardMove(1, 5, 3, 5); // e4

        boolean legal = move.accept(
            new LegalMoveVisitor(board)
        );

        assertTrue(legal);
    }

    @Test
    void test2() {
        Board board = createStandardBoard();

        Move move = new StandardMove(0, 1, 2, 2); // Nc3

        boolean legal = move.accept(
            new LegalMoveVisitor(board)
        );

        assertTrue(legal);
    }

    private Board createStandardBoard() {
        ColouredPiece[][] pieces = new ColouredPiece[][] {
            new ColouredPiece[] {
                new ColouredPiece(Rook, White),
                new ColouredPiece(Knight, White),
                new ColouredPiece(Bishop, White),
                new ColouredPiece(Queen, White),
                new ColouredPiece(King, White),
                new ColouredPiece(Bishop, White),
                new ColouredPiece(Knight, White),
                new ColouredPiece(Rook, White)
            },
            new ColouredPiece[] {
                new ColouredPiece(Pawn, White),
                new ColouredPiece(Pawn, White),
                new ColouredPiece(Pawn, White),
                new ColouredPiece(Pawn, White),
                new ColouredPiece(Pawn, White),
                new ColouredPiece(Pawn, White),
                new ColouredPiece(Pawn, White),
                new ColouredPiece(Pawn, White)
            },
            new ColouredPiece[] {
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null
            },
            new ColouredPiece[] {
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null
            },
            new ColouredPiece[] {
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null
            },
            new ColouredPiece[] {
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null
            },
            new ColouredPiece[] {
                new ColouredPiece(Pawn, Black),
                new ColouredPiece(Pawn, Black),
                new ColouredPiece(Pawn, Black),
                new ColouredPiece(Pawn, Black),
                new ColouredPiece(Pawn, Black),
                new ColouredPiece(Pawn, Black),
                new ColouredPiece(Pawn, Black),
                new ColouredPiece(Pawn, Black)
            },
            new ColouredPiece[] {
                new ColouredPiece(Rook, Black),
                new ColouredPiece(Knight, Black),
                new ColouredPiece(Bishop, Black),
                new ColouredPiece(Queen, Black),
                new ColouredPiece(King, Black),
                new ColouredPiece(Bishop, Black),
                new ColouredPiece(Knight, Black),
                new ColouredPiece(Rook, Black)
            }
        };

        return new Board(pieces);
    }
}
