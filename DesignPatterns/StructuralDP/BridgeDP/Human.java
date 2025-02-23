public class Human extends LivingBeings{
    public Human(Breathing breath) {
        super(breath);
    }

    @Override
    public void respire() {
        breath.Inhale("HUMAN");
        breath.Exhale("HUMAN");
    }
}
