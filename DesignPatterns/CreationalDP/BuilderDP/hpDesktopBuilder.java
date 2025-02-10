package BuilderDP;

public class hpDesktopBuilder implements DesktopBuilder {
    private Desktop desktop ;
    public hpDesktopBuilder(){
        this.desktop = new Desktop();
    }

    @Override
    public void buildMontior(){
        desktop.setMontior("HP_monitor");
    }
    @Override
    public void buildKeyboard(){
        desktop.setKeyboard("HP_Keyboard");
    }
    @Override
    public void buildMouse(){
        desktop.setMouse("HP_Mouse");

    }
    @Override
    public void buildSpeaker(){
        desktop.setSpeaker("HP_Speaker");
    }
    @Override
    public void buildRam(){
        desktop.setRam("HP_Ram");
    }
    @Override
    public void buildProcessor(){
        desktop.setProcessor("HP_Processor");

    }
    @Override
    public void buildMotherboard(){
        desktop.setMotherboard("HP_Motherboard");

    }
    @Override
    public void deliverDesktop(){
        System.out.println(desktop.toString());
        this.desktop = new Desktop();
    }
    
    
}
