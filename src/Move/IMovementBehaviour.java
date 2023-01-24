package Move;

import Board.Spot;

interface IMovementBehaviour{
    void move(Spot curr, Spot end);
}
