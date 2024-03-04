class Game {
    private GameBehavior gameBehavior;

    public void setGameBehavior(GameBehavior gameBehavior) {
        this.gameBehavior = gameBehavior;
    }

    public void playGame() {
        gameBehavior.initialize();
        gameBehavior.play();
        gameBehavior.showResult();
    }
}