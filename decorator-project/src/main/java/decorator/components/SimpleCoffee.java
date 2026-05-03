package decorator.components;

public class SimpleCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Café simples";
    }

    @Override
    public double getCost() {
        return 5.00;
    }
}
