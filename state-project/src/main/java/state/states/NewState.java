package state.states;

import state.context.Order;

public class NewState implements OrderState {

    @Override
    public void next(Order order) {
        order.setState(new PaidState());
    }

    @Override
    public void printStatus() {
        System.out.println("Pedido criado.");
    }
}
