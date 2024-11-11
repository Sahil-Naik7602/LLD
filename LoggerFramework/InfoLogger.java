package LoggerFramework;

public class InfoLogger extends AbstractLogger{

    public InfoLogger(int level){
        this.level = level;
    }

    @Override
    public void display(String msg) {
        System.out.println("INFO: "+msg);
    }
}
