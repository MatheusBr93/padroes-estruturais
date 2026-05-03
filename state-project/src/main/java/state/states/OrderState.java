package state.states;

import state.context.Order;

public interface OrderState {
    void next(Order order);
    void printStatus();
}
