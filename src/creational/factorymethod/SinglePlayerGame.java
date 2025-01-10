package creational.factorymethod;

public class SinglePlayerGame implements IGame {
    @Override
    public void start() {
        System.out.println("Single player game has started.");
    }
}
