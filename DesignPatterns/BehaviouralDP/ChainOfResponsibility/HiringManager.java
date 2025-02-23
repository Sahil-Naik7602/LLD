package DesignPatterns.ChainOfResponsibility;

public class HiringManager extends Manager {
    public HiringManager(String name, int limit){
        this.name = name;
        this.limit = limit;
    }

    @Override
    public void processSalary(int salary) {
        System.out.println(name + " has approved your compensation of: "+salary+" at level 1");
    }
}
