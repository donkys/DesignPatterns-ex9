public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        
        game.setGameBehavior(new Football());
        game.playGame();

        game.setGameBehavior(new Basketball());
        game.playGame();
    }
}