package lab6.observer;

import java.util.ArrayList;
import java.util.List;

// Интерфейс для подписчиков
interface Subscriber {
    void update(String article);
}

// Класс, представляющий издателя новостей
class NewsPublisher {
    private List<Subscriber> subscribers = new ArrayList<>();

    // Метод для добавления подписчика
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    // Метод для удаления подписчика
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    // Метод для публикации новой статьи
    public void publish(String article) {
        System.out.println("Публикация новой статьи: " + article);
        notifySubscribers(article);
    }

    // Метод для уведомления всех подписчиков
    private void notifySubscribers(String article) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(article);
        }
    }
}

// Пример подписчика
class NewsSubscriber implements Subscriber {
    private String name;

    public NewsSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String article) {
        System.out.println(name + " получил уведомление о новой статье: " + article);
    }
}

// Пример использования
public class Main {
    public static void main(String[] args) {
        NewsPublisher publisher = new NewsPublisher();

        NewsSubscriber subscriber1 = new NewsSubscriber("Подписчик 1");
        NewsSubscriber subscriber2 = new NewsSubscriber("Подписчик 2");

        publisher.subscribe(subscriber1);
        publisher.subscribe(subscriber2);

        publisher.publish("Новая статья о паттернах проектирования");
        publisher.publish("Обзор новых технологий в 2023 году");
    }
}