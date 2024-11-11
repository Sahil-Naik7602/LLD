package LoggerFramework;

public class ErrorLogger extends AbstractLogger{

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    public void display(String msg) {
        System.out.println("ERROR: "+msg);
    }
}
