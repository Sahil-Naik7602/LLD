public class PhotoSynthesis implements Breathing{
    @Override
    public void Inhale(String livingEntity) {
        System.out.println(livingEntity+": Inhale CO2 form air");
    }

    @Override
    public void Exhale(String livingEntity) {
        System.out.println(livingEntity+": Exhale O2 to air");

    }
}
