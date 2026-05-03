package strategy.context;

import strategy.strategies.ShippingStrategy;

public class Order {

    private double value;
    private ShippingStrategy shippingStrategy;

    public Order(double value) {
        this.value = value;
    }

    public void setShippingStrategy(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public double calculateShipping() {
        if (shippingStrategy == null) {
            throw new IllegalStateException("Nenhuma estratégia de frete foi definida.");
        }

        return shippingStrategy.calculate(value);
    }

    public double calculateTotal() {
        return value + calculateShipping();
    }
}
