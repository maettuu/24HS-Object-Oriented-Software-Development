package creational.abstractfactory;

public class DarkThemeButton implements IButton {
    @Override
    public void render() {
        System.out.println("Dark theme button created.");
    }
}
