package com.phukoyeuai.engine.pieces;

import com.google.common.collect.ImmutableList;
import com.phukoyeuai.engine.Alliance;
import com.phukoyeuai.engine.board.Board;
import com.phukoyeuai.engine.board.BoardUtils;
import com.phukoyeuai.engine.board.Move;
import com.phukoyeuai.engine.board.Tile;
import com.phukoyeuai.engine.pieces.Piece;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Bishop extends Piece {

    public Bishop(int piecePosition, Alliance pieceAlliance) {
        super(piecePosition, pieceAlliance);
    }


    private final static int[] CANDIDATE_MOVE_VECTOR_COORDINATES = {-9, -7, 7, 9};

    @Override
    public Collection<Move> calculateLegalMoves(final Board board) {
        final List<Move> legalMoves = new ArrayList<>();

        for (final int candidateDirection : CANDIDATE_MOVE_VECTOR_COORDINATES) {
            int candidateDestinationCoordinate = this.piecePosition + candidateDirection;
            while (BoardUtils.isValidTileCoordinate(candidateDestinationCoordinate)) {

                final Tile candidateDestinationTile = board.getTile(candidateDestinationCoordinate);

                if (candidateDestinationTile.isTileOccupied()) {
                    final Piece pieceAtDestination = candidateDestinationTile.getPiece();
                    final Alliance pieceAlliance = pieceAtDestination.getPieceAlliance();
                    if (this.pieceAlliance != pieceAlliance) {
                        legalMoves.add(new Move.AttackMove(board, this, pieceAtDestination.piecePosition, pieceAtDestination));
                    }
                    break;
                }
                else {
                    legalMoves.add(new Move.MajorMove(board, this, candidateDestinationCoordinate));
                }
                candidateDestinationCoordinate += candidateDirection;
            }
        }
        return ImmutableList.copyOf(legalMoves);
    }

}
