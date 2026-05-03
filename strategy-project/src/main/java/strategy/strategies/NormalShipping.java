package strategy.strategies;

public class NormalShipping implements ShippingStrategy {

    @Override
    public double calculate(double orderValue) {
        return 10.00;
    }
}
