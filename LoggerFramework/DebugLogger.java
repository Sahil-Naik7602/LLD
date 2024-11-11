package LoggerFramework;

public class DebugLogger extends AbstractLogger{

    public DebugLogger(int level){
        this.level = level;
    }
    @Override
    public void display(String msg) {
        System.out.println("DEBUG: "+msg);
    }
}
