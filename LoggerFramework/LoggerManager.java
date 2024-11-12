package LoggerFramework;

public class LoggerManager {
    public static AbstractLogger buildChain(){
        AbstractLogger infoLogger = new InfoLogger(1);
        AbstractLogger errorLogger = new ErrorLogger(2);
        AbstractLogger debugLogger = new DebugLogger(3);

        infoLogger.setNextLogger(errorLogger);
        errorLogger.setNextLogger(debugLogger);

        return infoLogger;
    }

    public static LogProducer buildLogProducer(){
        LogProducer logProducer = new LogProducer();
        LogObserver fileLogger = new FileLogger();
        LogObserver consoleLogger = new ConsoleLogger();

        //Level 1 messages should be written in console and file
        logProducer.addObserver(1,fileLogger);
        logProducer.addObserver(1,consoleLogger);

        //Level 2 messages should be written only in file
        logProducer.addObserver(2,fileLogger);
        return logProducer;
    }
}
