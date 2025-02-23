public class UnderWaterBreathing implements Breathing{
    @Override
    public void Inhale(String livingEntity) {
        System.out.println(livingEntity+" :Inhale oxygen mixed in water");
    }

    @Override
    public void Exhale(String livingEntity) {
        System.out.println(livingEntity+" :Exhale CO2");
    }
}
