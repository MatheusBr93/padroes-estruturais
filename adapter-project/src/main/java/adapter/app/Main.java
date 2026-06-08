package adapter.app;

import adapter.adaptee.LegacyPaymentSystem;
import adapter.adapter.PaymentAdapter;
import adapter.target.PaymentProcessor;

public class Main {

    public static void main(String[] args) {

        LegacyPaymentSystem legacySystem = new LegacyPaymentSystem();

        PaymentProcessor processor =
                new PaymentAdapter(legacySystem);

        processor.processPayment(150.00);
    }
}
