package creational.abstractfactory;

public class LightThemeUIFactory implements IUIFactory {
    @Override
    public LightThemeButton createButton() {
        return new LightThemeButton();
    }

    @Override
    public LightThemeTextField createTextField() {
        return new LightThemeTextField();
    }
}
