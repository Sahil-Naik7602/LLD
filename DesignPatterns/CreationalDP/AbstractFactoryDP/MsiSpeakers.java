package DesignPatterns.CreationalDP.AbstractFactoryDP;

public class MsiSpeakers extends Speakers{
    @Override
    public void checkSound() {
        System.out.println("Play music on MsiSpeakers");
    }
}
