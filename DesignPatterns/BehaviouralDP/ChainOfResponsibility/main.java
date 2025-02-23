package DesignPatterns.ChainOfResponsibility;

public class main {
    public static void main(String[] args) {
        Manager hr = ManagerHandler.getManager();
        hr.negotiate(11000);
    }
}
