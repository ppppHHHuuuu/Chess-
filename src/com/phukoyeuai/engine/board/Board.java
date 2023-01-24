package com.phukoyeuai.engine.board;
import com.phukoyeuai.engine.pieces.Piece;

import java.util.ArrayList;
import java.util.List;

//immutable the class -> object cant be changed
// what can be mutable
//
public class Board {

    private final List<Tile> tilesList;

    Board (final List<Tile> tiles) {
        tilesList = tiles;
    }
    public Tile getTile (final int tileCoordinate) {
        return null;
    }
    private Tile[][] Tile;

    public void  initSpot() {
    }
    public Tile getSpot(int x, int y) throws Exception {
        if (x < 1 || x > 8 || y < 1 || y > 8) {
            throw new Exception("Can't get this Tile");
        }
        return Tile[x][y];
    }

    public void resetBoard() {
        Tile[1][1] = new Tile(1, 1, new Rock(true));
        Tile[1][2] = new Tile(1, 2, new Knight(true));
        Tile[1][3] = new Tile(1, 3, new Bishop(true));
        Tile[1][4] = new Tile(1, 4, new Queen(true));
        Tile[1][5] = new Tile(1, 5, new King(true));
        Tile[1][6] = new Tile(1, 6, new Bishop(true));
        Tile[1][7] = new Tile(1, 7, new Knight(true));
        Tile[1][8] = new Tile(1, 8, new Rock(true));

        Tile[8][1] = new Tile(8, 1, new Rock(true));
        Tile[8][2] = new Tile(8, 2, new Knight(true));
        Tile[8][3] = new Tile(8, 3, new Bishop(true));
        Tile[8][4] = new Tile(8, 4, new Queen(true));
        Tile[8][5] = new Tile(8, 5, new King(true));
        Tile[8][6] = new Tile(8, 6, new Bishop(true));
        Tile[8][7] = new Tile(8, 7, new Knight(true));
        Tile[8][8] = new Tile(8, 8, new Rock(true));
    }
}
