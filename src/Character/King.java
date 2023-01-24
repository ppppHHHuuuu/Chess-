package Character;

import com.phukoyeuai.engine.pieces.Piece;

public class King extends Piece {
    public King(King e) {
        super(e);
    }

    public King(boolean white) {
        super(white);
    }

    @Override
    public boolean canMove(int x, int y) {
        return false;
    }
}
