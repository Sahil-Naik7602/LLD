package FactoryDP;

public class main {
    public static void main(String[] args) {

        BurgerMaker chickenBurgerMaker = new ChickenBurgerMaker();
        Waiter waiter = new Waiter(chickenBurgerMaker);
        Burger burger = waiter.orderBurger();
        burger.cookBurger();

    }
}
