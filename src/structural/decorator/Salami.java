package structural.decorator;

public class Salami extends Topping {
    public Salami(IFood food) {
        super(food);
    }

    @Override
    public String getDescription() {
        return food.getDescription().replace("}", ", 'salami'}");
    }

    @Override
    public double cost() {
        return food.cost() + 2.5;
    }
}
