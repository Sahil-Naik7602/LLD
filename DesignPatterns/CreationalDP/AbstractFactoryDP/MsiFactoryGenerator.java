package DesignPatterns.CreationalDP.AbstractFactoryDP;

public class MsiFactoryGenerator implements ElectronicItemFactoryGenerator{
    @Override
    public Monitor generateMonitor() {
        return new MsiMonitor();
    }

    @Override
    public Speakers generateSpeakers() {
        return new MsiSpeakers();
    }
}
