package Move;

import Board.Spot;

public class DiagonalMovement implements IMovementBehaviour{

    private boolean isSafe(int x, int y){
        if (x < 1 || x > 8 || y < 1 || y > 8) {
            return false;
        }
        return true;
    }

    private void upLeftMost(int x, int y) {
        if (!isSafe(x, y)) {
            return;
        }
        upLeftMost(x - 1, y - 1);
    }
    private void downLeftMost(int x, int y) {
        if (!isSafe(x, y)) {
            return;
        }
        downLeftMost(x - 1, y - 1);
    }
    private void upRightMost(int x, int y) {
        if (!isSafe(x, y)) {
            return;
        }
        upRightMost(x - 1, y + 1);
    }
    private void downRightMost(int x, int y) {
        if (!isSafe(x, y)) {
            return;
        }

        downLeftMost(x - 1, y - 1);
    }
    public void possibleMove(int x, int y) {
        upLeftMost(x, y);
        downLeftMost(x, y);
        upRightMost(x, y);
        downRightMost(x, y);
    }
    @Override
    public void move(Spot curr, Spot end) {

    }
}
