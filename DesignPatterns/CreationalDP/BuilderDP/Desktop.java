package BuilderDP;

public class Desktop {

    private String montior;
    private String keyboard;
    private String mouse;
    private String speaker;
    private String ram;
    private String processor;
    private String motherboard;

    public void setMontior(String montior) {
        this.montior = montior;
    }
    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }
    public void setMouse(String mouse) {
        this.mouse = mouse;
    }
    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }
    public void setRam(String ram) {
        this.ram = ram;
    }
    public void setProcessor(String processor) {
        this.processor = processor;
    }
    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }
    @Override
    public String toString() {
        return "Desktop [montior=" + montior + ", keyboard=" + keyboard + ", mouse=" + mouse + ", speaker=" + speaker
                + ", ram=" + ram + ", processor=" + processor + ", motherboard=" + motherboard + "]";
    }

}
