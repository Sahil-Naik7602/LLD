public interface PaymentStarategy {
    void pay();
    boolean validatePayment();
    void collectPaymentCredentials();
}
