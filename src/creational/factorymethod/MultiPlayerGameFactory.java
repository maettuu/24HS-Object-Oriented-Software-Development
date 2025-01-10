package creational.factorymethod;

public class MultiPlayerGameFactory implements IGameFactory {
    @Override
    public MultiPlayerGame createGame() {
        return new MultiPlayerGame();
    }
}
