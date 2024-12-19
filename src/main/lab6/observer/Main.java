package main.lab6.observer;

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