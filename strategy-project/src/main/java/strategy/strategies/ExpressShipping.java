package strategy.strategies;

public class ExpressShipping implements ShippingStrategy {

    @Override
    public double calculate(double orderValue) {
        return 25.00;
    }
}
