package Character;

import com.phukoyeuai.engine.pieces.Piece;

public class Pawns extends Piece {
    public Pawns(Pawns e) {
        super(e);
    }

    public Pawns(boolean white) {
        super(white);
    }

    @Override
    public boolean canMove(int x, int y) {
        return false;
    }
}
