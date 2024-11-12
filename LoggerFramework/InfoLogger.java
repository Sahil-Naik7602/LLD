package LoggerFramework;

public class InfoLogger extends AbstractLogger{

    public InfoLogger(int level){
        this.level = level;
    }

    public void display(String msg,LogProducer logProducer) {
        String message =  "INFO | " + msg;
        logProducer.notifyAll(1,message);
    }
}
