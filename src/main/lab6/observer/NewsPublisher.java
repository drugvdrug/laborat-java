package main.lab6.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsPublisher {
    private List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void publish(String article) {
        System.out.println("Публикация новой статьи: " + article);
        notifySubscribers(article);
    }

    private void notifySubscribers(String article) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(article);
        }
    }
}
