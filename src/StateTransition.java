public interface StateTransition {
    default void initGame() {}
    void newGame();
    void startGame();
    void stopGame();
    void pauseGame();
    void resumeGame();
    void destroyGame();
}
