package creational.abstractfactory;

public class DarkThemeUIFactory implements IUIFactory {
    @Override
    public DarkThemeButton createButton() {
        return new DarkThemeButton();
    }

    @Override
    public DarkThemeTextField createTextField() {
        return new DarkThemeTextField();
    }
}
