package BuilderDP;

public class dellDesktopBuilder implements DesktopBuilder {
    private Desktop desktop ;
    public dellDesktopBuilder(){
        this.desktop = new Desktop();
    }

    @Override
    public void buildMontior(){
        desktop.setMontior("DELL_monitor");
    }
    @Override
    public void buildKeyboard(){
        desktop.setKeyboard("DELL_Keyboard");
    }
    @Override
    public void buildMouse(){
        desktop.setMouse("DELL_Mouse");

    }
    @Override
    public void buildSpeaker(){
        desktop.setSpeaker("DELL_Speaker");
    }
    @Override
    public void buildRam(){
        desktop.setRam("DELL_Ram");
    }
    @Override
    public void buildProcessor(){
        desktop.setProcessor("DELL_Processor");

    }
    @Override
    public void buildMotherboard(){
        desktop.setMotherboard("DELL_Motherboard");

    }
    @Override
    public void deliverDesktop(){
        System.out.println(desktop.toString());
        this.desktop = new Desktop();
    }
    
}
