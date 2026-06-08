package adapter.adapter;

import adapter.adaptee.LegacyPaymentSystem;
import adapter.target.PaymentProcessor;

public class PaymentAdapter implements PaymentProcessor {

    private final LegacyPaymentSystem legacySystem;

    public PaymentAdapter(LegacyPaymentSystem legacySystem) {
        this.legacySystem = legacySystem;
    }

    @Override
    public void processPayment(double amount) {
        legacySystem.makePayment(amount);
    }
}
