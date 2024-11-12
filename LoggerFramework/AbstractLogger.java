package LoggerFramework;

public abstract class AbstractLogger {
    public int level;
    AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }
     public void logMessage(int level, String msg,LogProducer logProducer){
        if (this.level==level){
            display(msg,logProducer);
        }
        if (this.nextLogger != null){
            nextLogger.logMessage(level,msg,logProducer);
        }
     }

     public abstract void display(String msg,LogProducer logProducer);
}
