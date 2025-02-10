package DesignPatterns.CreationalDP.AbstractFactoryDP;

public class DellMonitor extends Monitor{

    @Override
    void assemble() {
        System.out.println("Assembling Dell monitor");
    }
}
