package SingletonDP;

public class Customer {
    private int customerWallet;

    public Customer(int amount){
        this.customerWallet = amount;
    }

    public int getCustomerWallet() {
        return customerWallet;
    }

    public void setCustomerWallet(int customerWallet) {
        this.customerWallet = customerWallet;
    }

    public void expense(int amount){
        if (amount>this.customerWallet){
            System.err.println("Balance insufficient");
        }
        else{
           this.setCustomerWallet(this.customerWallet - amount);
        }
    }
}
