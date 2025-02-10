package BuilderDP;

public class ChiefEngineer {
    private DesktopBuilder chiefEnginner;
    public ChiefEngineer(DesktopBuilder desktopBuilder){
        this.chiefEnginner = desktopBuilder;
    }
    public void constructDesktop(){
        chiefEnginner.buildMontior();
        chiefEnginner.buildKeyboard();
        chiefEnginner.buildMouse();
        chiefEnginner.buildSpeaker();
        chiefEnginner.buildRam();
        chiefEnginner.buildProcessor();
        chiefEnginner.buildMotherboard();
    }

    public void DeliverDesktop(){
        chiefEnginner.deliverDesktop();
    }
}
