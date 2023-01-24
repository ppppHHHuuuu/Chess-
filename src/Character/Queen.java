package Character;

import com.phukoyeuai.engine.pieces.Piece;

public class Queen extends Piece {
    public Queen(boolean white) {
        super(white);
    }
    public Queen(Queen e) {
        super(e);
    }


    @Override
    public boolean canMove(int x, int y) {
        return false;
    }
}
