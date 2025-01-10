package creational.abstractfactory;

public class DarkThemeTextField implements ITextField {
    @Override
    public void render() {
        System.out.println("Dark theme text field created.");
    }
}
