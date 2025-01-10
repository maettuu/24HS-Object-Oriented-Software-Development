package creational.singleton;

public class Game {
    private static Game instance;

    private Game() {
        System.out.println("Game created.");
    }

    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }
}
