package com.phukoyeuai.engine.board;

public class BoardUtils {

    public static final int NUM_TILES_PER_ROW = 8;
    public static final int NUM_TILES = 64;

    public static final boolean[] FIRST_COLUMN = initColumn(0);

    public static final boolean[] SEVENTH_COLUMN = initColumn(6);
    public static final boolean[] SECOND_COLUMN = initColumn(1);
    public static final boolean[] EIGHTH_COLUMN = initColumn(7);


    public static final boolean[] DOWNWARD_DIAGONAL = initDiagonal(-1);

    public static final boolean[] UPWARD_DIAGONAL = initDiagonal(1);

    private static boolean[] initDiagonal(int slope) {
        final boolean [] diagonal = new boolean[NUM_TILES];
        if (slope == 1) {
            int coordinate = 0;
            do {
                diagonal[coordinate] = true;
                coordinate += 7;
            } while (coordinate < NUM_TILES);
        }
        else {
            int coordinate = 0;
            do {
                diagonal[coordinate] = true;
                coordinate += 9;
            } while (coordinate < NUM_TILES);
        }
    }
    private static boolean[] initColumn(int firstCoordinate) {
        final boolean [] column = new boolean[NUM_TILES];
        do {
            column[firstCoordinate] = true;
            firstCoordinate += 8;
        } while (firstCoordinate < NUM_TILES);
        return column;
    }


    private BoardUtils() {
        throw new RuntimeException("Cannot init Board");
    }
    public static boolean isValidTileCoordinate(final int coordinate) {
        return coordinate >= 0 && coordinate < NUM_TILES;
    }
}
