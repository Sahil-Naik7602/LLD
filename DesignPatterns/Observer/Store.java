package DesignPatterns.Observer;

public class Store {
    private final NotificationService notificationService = new NotificationService();


    public void newItemPromotion(String msg){
        notificationService.notifySubscriber(msg);
    }

    public NotificationService getNotificationService(){
        return new NotificationService();
    }
}
