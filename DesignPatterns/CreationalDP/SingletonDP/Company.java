package SingletonDP;

public class Company {
    private Wallet companyWallet;
    public Company(Wallet companyWallet){
        this.companyWallet = companyWallet;
    }

    public Wallet getCompanyWallet() {
        return companyWallet;
    }

    public void setCompanyWallet(Wallet companyWallet) {
        this.companyWallet = companyWallet;
    }

    public void income(int amount){
        this.companyWallet.addAmount(amount);
    }

    public int showIncome(){
        return this.companyWallet.showAmount();
    }


    
}
