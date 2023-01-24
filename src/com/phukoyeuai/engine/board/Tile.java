package com.phukoyeuai.engine.board;

import com.phukoyeuai.engine.pieces.Piece;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// immutable the class -> object cant be changed
// what can be mutable
public abstract class Tile {
    private static final Map<Integer, EmptyTile> EMPTY_TILES = createAllPossibleEmptyTiles();
    /* how to make tileCoordinate immutable
     protected -> only access by subclass
    final: once it is set in the constructor, never set it again
    */
    //tile number
    protected final int tileCoordinate;

    private Tile(final int tileCoordinate) {
        this.tileCoordinate = tileCoordinate;
    }

    private static Map<Integer, EmptyTile> createAllPossibleEmptyTiles() {
        final Map<Integer, EmptyTile> EMPTY_TILES_CACHE = new HashMap<>();
        for (int i = 0; i < BoardUtils.NUM_TILES; i++) {
            EMPTY_TILES_CACHE.put(i, new EmptyTile(i));
        }
        return  Collections.unmodifiableMap(EMPTY_TILES_CACHE);
    }

    public static Tile createTile(final int tileCoordinate, final Piece piece) {
        return piece != null ? new OccupiedTile(tileCoordinate, piece) : EMPTY_TILES.get(tileCoordinate);
    }

    public abstract boolean isTileOccupied();

    public abstract Piece getPiece();


    /* why use static nested class (not inner class)
        no need to init with the outer class
        only can access static member of outer class
     */

    // subClasses
    public static final class EmptyTile extends Tile {
        private EmptyTile(final int coordinate) {
            super(coordinate);
            //final var cannot be reassigned
        }

        @Override
        public boolean isTileOccupied() {
            return false;
        }

        @Override
        public Piece getPiece() {
            return null;
        }
    }

    public static final class OccupiedTile extends Tile {
        // no way to reference without calling getPiece
        private final Piece pieceOnTile;

        private OccupiedTile(final int tileCoordinate, Piece pieceOnTile) {
            super(tileCoordinate);
            this.pieceOnTile = pieceOnTile;
        }

        @Override
        public Piece getPiece() {
            return pieceOnTile;
        }

        @Override
        public boolean isTileOccupied() {
            return true;
        }
    }
}
