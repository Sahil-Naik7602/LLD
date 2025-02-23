package DesignPatterns.Observer;

public class main {
    public static void main(String[] args) {
        Store store = new Store();
        NotificationService ns = store.getNotificationService();
        ns.addEventListener(new MobileMsgListener("Sahil"));
        ns.addEventListener(new EmailMsgListener("sahilnaik7602@gmail.com"));
        ns.notifySubscriber("Hello this product is available!!");
    }

}
