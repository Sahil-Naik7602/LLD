public class PaymentByGPay implements PaymentStarategy{
    @Override
    public void pay() {
        System.out.println("Paying by Google Pay");
    }

    @Override
    public boolean validatePayment() {
        System.out.println("Checking whether balance is there ot not");
        return true;
    }

    @Override
    public void collectPaymentCredentials() {
        System.out.println("Collecting payment credentials for G pay");

    }
}
