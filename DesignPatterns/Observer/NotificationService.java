package DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    private List<EventListener> eventListeners = new ArrayList<>();

    public void addEventListener(EventListener eventListener){
        eventListeners.add(eventListener);
    }

    public void removeEventListener(EventListener eventListener){
        eventListeners.remove(eventListener);
    }

    public void notifySubscriber(String msg){
        eventListeners.forEach(subscriber -> subscriber.update(msg));

    }
}
