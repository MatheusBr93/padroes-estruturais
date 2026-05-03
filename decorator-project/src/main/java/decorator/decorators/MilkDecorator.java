package decorator.decorators;

import decorator.components.Coffee;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", leite";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 2.00;
    }
}
