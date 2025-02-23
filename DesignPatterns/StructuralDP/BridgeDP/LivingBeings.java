public abstract class LivingBeings {
    Breathing breath;
    public LivingBeings(Breathing breath){
        this.breath = breath;
    }
    public abstract void respire();
}
