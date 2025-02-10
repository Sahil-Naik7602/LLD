package FactoryDP;

public class VegBurgerMaker implements BurgerMaker{
    @Override
    public Burger prepareBurger() {
        return new VegBurger();
    }
}
