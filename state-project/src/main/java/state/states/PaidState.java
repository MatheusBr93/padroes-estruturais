package state.states;

import state.context.Order;

public class PaidState implements OrderState {

    @Override
    public void next(Order order) {
        order.setState(new ShippedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Pedido pago.");
    }
}
