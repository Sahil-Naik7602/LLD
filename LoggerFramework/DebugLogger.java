package LoggerFramework;

public class DebugLogger extends AbstractLogger{

    public DebugLogger(int level){
        this.level = level;
    }
    @Override
    public void display(String msg,LogProducer logProducer) {
        String message =  "DEBUG" + msg;
        logProducer.notifyAll(3,message);
    }
}
