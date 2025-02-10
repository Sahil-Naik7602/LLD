package DesignPatterns.CreationalDP.AbstractFactoryDP;

public class abstractFactoryDPMain {
    public static void main(String[] args) {
        ElectronicItemFactoryGenerator msiFactoryGenerator = new MsiFactoryGenerator();
        Client client = new Client(msiFactoryGenerator);
        Monitor monitor = client.manufactureMonitor();
        Speakers speaker = client.manufactureSpeakers();
        monitor.assemble();
        speaker.checkSound();
    }
}
