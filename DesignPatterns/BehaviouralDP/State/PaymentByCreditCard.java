public class PaymentByCreditCard implements PaymentStarategy{
    @Override
    public void pay() {
        System.out.println("Paying by Credit Card");
    }

    @Override
    public boolean validatePayment() {
        System.out.println("Checking credit card limit has reached or not");
        return true;
    }

    @Override
    public void collectPaymentCredentials() {
        System.out.println("Collecting payment details for CC payment.");

    }
}
