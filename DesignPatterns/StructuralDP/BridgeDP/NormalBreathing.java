public class NormalBreathing implements Breathing{
    @Override
    public void Inhale(String livingEntity) {
        System.out.println(livingEntity+": Inhaling O2 from air");
    }

    @Override
    public void Exhale(String livingEntity) {
        System.out.println(livingEntity+": Exhaling CO2 to air");
    }
}
