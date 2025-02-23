public class Frog extends LivingBeings{
    public Frog(Breathing breath) {
        super(breath);
    }

    @Override
    public void respire() {
        breath.Inhale("FROG");
        breath.Exhale("FROG");
    }
}
