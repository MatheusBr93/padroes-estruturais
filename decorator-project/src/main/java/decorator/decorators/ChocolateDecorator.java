package decorator.decorators;

import decorator.components.Coffee;

public class ChocolateDecorator extends CoffeeDecorator {

    public ChocolateDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", chocolate";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 3.00;
    }
}
