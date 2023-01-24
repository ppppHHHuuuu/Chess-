package com.phukoyeuai.engine.pieces;
import com.phukoyeuai.engine.Alliance;
import com.phukoyeuai.engine.board.Board;
import com.phukoyeuai.engine.board.Move;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class Piece {

    //why the fuck final here: doesn't it gonna change its place?
    protected final int piecePosition;
    protected final Alliance pieceAlliance;

    Piece(final int piecePosition, final Alliance pieceAlliance) {
        this.pieceAlliance = pieceAlliance;
        this.piecePosition = piecePosition;
    }
    public Alliance getPieceAlliance() {
        return pieceAlliance;
    }
    public abstract Collection<Move> calculateLegalMoves(final Board board);
}


//    boolean white;
//    boolean killed;
//    public Piece (boolean white) {
//        this.white = white;
//    }
//
//    public Piece (Piece e) {
//        this.killed = e.killed;
//        this.white = e.white;
//    }
//
//    public void isWhite (boolean white) {
//        this.white = white;
//    }
//    public void isKilled(boolean killed) {
//        this.killed = killed;
//    }
//
//    @Override
//    public String toString() {
//        return "This Piece is alive: " +
//                white
//                + " and killed: "
//                + killed;
//    }
//
//    public String getStatus() {
//        return toString();
//    }
//
//    public abstract boolean canMove(int x, int y);

