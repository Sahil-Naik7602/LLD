package DesignPatterns.CreationalDP.AbstractFactoryDP;

public class DellFactoryGenerator implements ElectronicItemFactoryGenerator{
    @Override
    public Monitor generateMonitor() {
        return new DellMonitor();
    }

    @Override
    public Speakers generateSpeakers() {
        return new DellSpeakers();
    }
}
