package state.states;

import state.context.Order;

public class ShippedState implements OrderState {

    @Override
    public void next(Order order) {
        System.out.println("Pedido já foi enviado.");
    }

    @Override
    public void printStatus() {
        System.out.println("Pedido enviado.");
    }
}
