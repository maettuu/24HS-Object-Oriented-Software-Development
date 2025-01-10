package creational.factorymethod;

public class SinglePlayerGameFactory implements IGameFactory {
    @Override
    public SinglePlayerGame createGame() {
        return new SinglePlayerGame();
    }
}
