package FactoryDP;

public class ChickenBurgerMaker implements BurgerMaker{
    @Override
    public Burger prepareBurger() {
        return new ChickenBurger();
    }
}
