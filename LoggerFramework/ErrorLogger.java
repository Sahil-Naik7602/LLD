package LoggerFramework;

public class ErrorLogger extends AbstractLogger{

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    public void display(String msg,LogProducer logProducer) {
        String message =  "ERROR | " + msg;
        logProducer.notifyAll(2,message);
    }
}
