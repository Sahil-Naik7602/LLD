package DesignPatterns.Observer;

public class EmailMsgListener implements EventListener{
    private final String email;

    public EmailMsgListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String msg) {
        System.out.println("EMAIL to: "+email+" MSG: "+msg);
    }
}
