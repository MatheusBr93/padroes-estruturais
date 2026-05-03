package strategy.app;

import strategy.context.Order;
import strategy.strategies.ExpressShipping;
import strategy.strategies.InternationalShipping;
import strategy.strategies.NormalShipping;

public class Main {

    public static void main(String[] args) {
        Order order = new Order(200.00);

        order.setShippingStrategy(new NormalShipping());
        System.out.println("Frete normal: R$ " + order.calculateShipping());
        System.out.println("Total com frete normal: R$ " + order.calculateTotal());

        order.setShippingStrategy(new ExpressShipping());
        System.out.println("Frete expresso: R$ " + order.calculateShipping());
        System.out.println("Total com frete expresso: R$ " + order.calculateTotal());

        order.setShippingStrategy(new InternationalShipping());
        System.out.println("Frete internacional: R$ " + order.calculateShipping());
        System.out.println("Total com frete internacional: R$ " + order.calculateTotal());
    }
}
