package LoggerFramework;

public class Logger {
    private static Logger logger;
    private static  AbstractLogger abstractLogger;
    private static LogProducer logProducer;
    private Logger(){}

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
            abstractLogger = LoggerManager.buildChain();
            logProducer = LoggerManager.buildLogProducer();
        }
        return logger;
    }

    public void writeLogs(int level, String msg){
        abstractLogger.logMessage(level,msg,logProducer);
    }

    public void info(String msg){
        writeLogs(1,msg);
    }

    public void error(String msg){
        writeLogs(2,msg);
    }

    public void debug(String msg){
        writeLogs(3,msg);
    }
}
