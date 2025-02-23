package DesignPatterns.Observer;

public class MobileMsgListener implements EventListener{
    private final String username;

    public MobileMsgListener(String username) {
        this.username = username;
    }

    @Override
    public void update(String msg) {
        System.out.println("MESSAGE to: "+username+"MSG: "+msg);
    }
}
