package LoggerFramework;

public class main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.info("Working successfully");
        logger.error("Throwing error successfully");
//        logger.debug("Debugging successfully");
    }

}
