package structural.decorator;

public class Mushroom extends Topping {
    public Mushroom(IFood food) {
        super(food);
    }

    @Override
    public String getDescription() {
        return food.getDescription().replace("}", ", 'mushroom'}");
    }

    @Override
    public double cost() {
        return food.cost() + 2.5;
    }
}
