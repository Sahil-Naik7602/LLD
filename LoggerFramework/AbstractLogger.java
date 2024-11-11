package LoggerFramework;

public abstract class AbstractLogger {
    public int level;
    AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }
     public void logMessage(int level, String msg){
        if (this.level<=level){
            display(msg);
        }
        if (this.nextLogger != null){
            nextLogger.logMessage(level,msg);
        }
     }

     public abstract void display(String msg);
}
