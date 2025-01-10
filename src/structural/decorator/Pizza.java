package structural.decorator;

public class Pizza implements IFood {
    @Override
    public String getDescription() {
        return "Pizza{" +
                "'tomato'" +
                ", 'mozzarella'" +
                "}";
    }

    @Override
    public double cost() {
        return 10.0;
    }
}
