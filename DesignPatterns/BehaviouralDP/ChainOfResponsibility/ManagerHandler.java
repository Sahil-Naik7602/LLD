package DesignPatterns.ChainOfResponsibility;

public class ManagerHandler {
    public static Manager getManager(){
        Manager hiringManager = new HiringManager("Sahil",1000);
        Manager seniorManager = new HiringManager("Lijo",5000);
        Manager director = new HiringManager("Chakra",10000);

        hiringManager.setUpperManager(seniorManager);
        seniorManager.setUpperManager(director);

        return hiringManager;
    }
}
