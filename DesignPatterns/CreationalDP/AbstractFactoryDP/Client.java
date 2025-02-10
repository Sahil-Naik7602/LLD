package DesignPatterns.CreationalDP.AbstractFactoryDP;

public class Client {
    private ElectronicItemFactoryGenerator factoryGenerator;

    public Client(ElectronicItemFactoryGenerator factoryGenerator){
        this.factoryGenerator = factoryGenerator;
    }

    public Monitor manufactureMonitor(){
        return factoryGenerator.generateMonitor();
    }

    public Speakers manufactureSpeakers(){
        return factoryGenerator.generateSpeakers();
    }



}
