package creational.abstractfactory;

public class LightThemeButton implements IButton {
    @Override
    public void render() {
        System.out.println("Light theme button created.");
    }
}
