package structural.decorator;

public abstract class Topping implements IFood {
    protected IFood food;

    public Topping(IFood food) {
        this.food = food;
    }

    @Override
    public String getDescription() {
        return food.getDescription();
    }

    @Override
    public double cost() {
        return food.cost();
    }
}
