package adapter.adaptee;

public class LegacyPaymentSystem {

    public void makePayment(double value) {
        System.out.println("Pagamento realizado pelo sistema legado: R$ " + value);
    }
}
