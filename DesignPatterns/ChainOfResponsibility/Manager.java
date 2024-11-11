package DesignPatterns.ChainOfResponsibility;

public abstract class Manager {
    protected int limit;
    protected String name;
    private Manager upperManager;

    public void setUpperManager(Manager upperManager) {
        this.upperManager = upperManager;
    }

    public void negotiate(int salary){
        if (salary<=this.limit){
            processSalary(salary);
        }else if(this.upperManager != null){
            this.upperManager.negotiate(salary);
        }else{
            System.out.println("Sorry can't hire you");
        }
    }
    public abstract void processSalary(int salary);
}
