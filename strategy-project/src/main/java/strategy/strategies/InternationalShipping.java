package strategy.strategies;

public class InternationalShipping implements ShippingStrategy {

    @Override
    public double calculate(double orderValue) {
        return orderValue * 0.20;
    }
}
