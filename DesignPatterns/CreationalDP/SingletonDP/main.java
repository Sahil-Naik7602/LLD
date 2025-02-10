package SingletonDP;

public class main {
    public static void main(String args[]){
        Customer sahil = new Customer(500);
        Customer satyam = new Customer(1000);
        Wallet wallet = Wallet.getInstance();
        Company amazon = new Company(wallet);

        sahil.expense(100);
        amazon.income(sahil.getCustomerWallet());
        System.out.println("Hi your todays' collection uptill is:" + amazon.showIncome());

        satyam.expense(250);
        amazon.income(satyam.getCustomerWallet());
        System.out.println("Hi your todays' collection uptill is:" + amazon.showIncome());
        
        Wallet newWallet = wallet.getInstance(); 
        amazon.setCompanyWallet(newWallet);
        System.out.println("Hi your todays' collection uptill is:" + amazon.showIncome());
        
    }

    
    
}
