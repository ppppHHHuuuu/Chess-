package com.phukoyeuai.engine.pieces;

import com.phukoyeuai.engine.Alliance;
import com.phukoyeuai.engine.board.Board;
import com.phukoyeuai.engine.board.Move;

import java.util.Collection;

public class Rock extends Piece {

    public Rock(int piecePosition, Alliance pieceAlliance) {
        super(piecePosition, pieceAlliance);
    }

    @Override
    public Collection<Move> calculateLegalMoves(Board board) {
        return null;
    }
}
