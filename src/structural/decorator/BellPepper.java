package structural.decorator;

public class BellPepper extends Topping {
    public BellPepper(IFood food) {
        super(food);
    }

    @Override
    public String getDescription() {
        return food.getDescription().replace("}", ", 'bell-pepper'}");
    }

    @Override
    public double cost() {
        return food.cost() + 2.5;
    }
}
