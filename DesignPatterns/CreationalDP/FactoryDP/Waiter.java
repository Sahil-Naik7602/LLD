package FactoryDP;

public class Waiter {
    private BurgerMaker burgerMaker;

    public Waiter(BurgerMaker burgerMaker){
        this.burgerMaker = burgerMaker;
    }

    public Burger orderBurger(){
        return burgerMaker.prepareBurger();
    }
}
