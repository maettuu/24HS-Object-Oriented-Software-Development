package creational.abstractfactory;

public interface IUIFactory {
    IButton createButton();
    ITextField createTextField();
}
