public class main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        PaymentStarategy paymentByCC = new PaymentByCreditCard();
        paymentService.setPaymentStrategy(paymentByCC);
        paymentService.initiatePayment();

    }

}
