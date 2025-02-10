package DesignPatterns.CreationalDP.AbstractFactoryDP;

public class DellSpeakers extends Speakers{
    @Override
    public void checkSound() {
        System.out.println("Play music on MsiSpeakers");
    }
}
