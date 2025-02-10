package SingletonDP;

//Wallet with lazy Initialization
public class Wallet {
    private static Wallet instance = new Wallet();
    private int amount;

    private Wallet(){
        this.amount = 0;
    }

    public static Wallet getInstance(){
        if (instance == null){
            instance = new Wallet();
        }
        return instance;
    }

    public int showAmount(){
        return this.amount;
    }

    public void addAmount(int amount){
        this.amount = amount + this.amount;
    }


    
}
