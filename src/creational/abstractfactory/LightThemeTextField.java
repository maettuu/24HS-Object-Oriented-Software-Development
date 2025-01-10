package creational.abstractfactory;

public class LightThemeTextField implements ITextField {
    @Override
    public void render() {
        System.out.println("Light theme text field created.");
    }
}
