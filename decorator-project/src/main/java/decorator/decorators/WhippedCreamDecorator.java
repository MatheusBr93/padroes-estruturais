package decorator.decorators;

import decorator.components.Coffee;

public class WhippedCreamDecorator extends CoffeeDecorator {

    public WhippedCreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", chantilly";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 4.00;
    }
}
