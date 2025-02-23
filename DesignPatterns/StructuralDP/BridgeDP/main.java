public class main {
    public static void main(String[] args) {
        LivingBeings human = new Human(new NormalBreathing());
        human.respire();
        LivingBeings frog = new Frog(new UnderWaterBreathing());
        frog.respire();
    }
}
