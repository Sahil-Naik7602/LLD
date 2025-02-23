public class PaymentService {
    private PaymentStarategy paymentStrategy;

    public void initiatePayment(){
        paymentStrategy.collectPaymentCredentials();
        if (paymentStrategy.validatePayment()){
            paymentStrategy.pay();
        }
    }

    public void setPaymentStrategy(PaymentStarategy paymentStarategy){
        this.paymentStrategy = paymentStarategy;
    }
}
